package v1.map;

import play.mvc.*;

public class MapController extends Controller{

	public Result getMap(){
		return ok("test");
	}
	
	public Result getMapSlowly(){
		int retval = 0;
		for(int i = 0; i < 100000000; i++){
			retval += i;
		}
		return ok("result is "+retval);
	}
	
}
