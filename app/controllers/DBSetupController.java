package controllers;

import play.mvc.*;
import utils.*;
import java.sql.Connection;
import java.sql.SQLException;
import v1.map.MapDatabase;

public class DBSetupController extends Controller{

	public Result setupTestDB(){
		try{
			Connection con = MapDatabase.getConnection();
			
			/*con.prepareStatement("CREATE TABLE films ( "+
"    code        char(5), "+
"    title       varchar(40), "+
"    did         integer,  "+
"    date_prod   date,   "+
"    kind        varchar(10),   "+
"    len         interval hour to minute ");*/
			
			return RequestUtils.prepResponse(ok("apparently it worked"));
		}catch(Exception e){
			return RequestUtils.prepResponse(ok("failure"));
		}
		
	}
	
}
