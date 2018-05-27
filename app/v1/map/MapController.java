package v1.map;

import play.mvc.*;
import utils.*;
import java.sql.Connection;

public class MapController extends Controller{

	public Result getMap(){
		
		//testing DB conns
		Connection con = MapDatabase.getConnection();
		
		int[][] grid = new int [11][11];
		
		for(int row=0; row < grid.length; row++){
			for(int col=0; col < grid[0].length; col++){
				grid[row][col] = (int)(Math.random() * 3);
			}
		}
		return RequestUtils.prepResponse(ok(jsonifyGrid(grid)));
	}
	
	public Result getMapSlowly(){
		int retval = 0;
		for(int i = 0; i < 100000000; i++){
			retval += i;
		}
		return RequestUtils.prepResponse(ok("result is "+retval));
	}
	
	private String jsonifyGrid(int[][] grid){
		String retval = "";
		
		for(int row=0; row < grid.length; row++){
			for(int col=0; col < grid[0].length; col++){
				retval += grid[row][col];
				retval += ",";
			}
			if(row < grid.length-1){
				retval=retval.substring(0, retval.length()-1)+";";
			}
		}
		return retval;
	}
	
}
