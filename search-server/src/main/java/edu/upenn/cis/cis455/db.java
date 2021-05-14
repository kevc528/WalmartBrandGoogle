package edu.upenn.cis.cis455;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class db {
    static Logger logger = LogManager.getLogger(db.class);

	public db() {
		
	}
	
	static Connection getRemoteConnection() {
	      try {
	      Class.forName("org.postgresql.Driver");
	      String dbName = "postgres";
	      String userName = System.getenv("RDS_USERNAME");
	      String password = System.getenv("RDS_PASSWORD");
	      String hostname = System.getenv("RDS_HOSTNAME");
	      String port = "5432";
	      String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
	      System.out.println(jdbcUrl);
	      Connection con = DriverManager.getConnection(jdbcUrl);
	      System.out.println("Remote connection successful.");
	      return con;
	    }
	    catch (ClassNotFoundException e) { logger.warn(e.toString());}
	    catch (SQLException e) { logger.warn(e.toString());}

	     System.out.println("Remote connection unsuccessful.");
	    return null;
	  }

}
