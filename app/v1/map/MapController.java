package v1.map;

import play.mvc.*;

public class MapController extends Controller{

	public Result getMap(){
		int[][] grid = new int [10][10];
		
		for(int row=0; row < grid.length; row++){
			for(int col=0; col < grid[0].length; col++){
				grid[row][col] = (int)(Math.random() * 3);
			}
		}
		return ok(jsonifyGrid(grid)).withHeader("Access-Control-Allow-Origin","*");
	}
	
	public Result getMapSlowly(){
		int retval = 0;
		for(int i = 0; i < 100000000; i++){
			retval += i;
		}
		return ok("result is "+retval);
	}
	
	private String jsonifyGrid(int[][] grid){
		String retval = "";
		
		for(int row=0; row < grid.length; row++){
			for(int col=0; col < grid[0].length; col++){
				retval += grid[row][col];
				retval += ",";
			}
			retval=retval.substring(0, retval.length()-1)+";";
		}
		return retval;
	}
	
}
