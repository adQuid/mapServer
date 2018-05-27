package v1.map;

import java.sql.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import javax.inject.Inject;

public class MapDatabase {
	public static Connection getConnection() throws SQLException {
	    String dbUrl = System.getenv("JDBC_DATABASE_URL");
	    return DriverManager.getConnection(dbUrl);
	}	
	

}