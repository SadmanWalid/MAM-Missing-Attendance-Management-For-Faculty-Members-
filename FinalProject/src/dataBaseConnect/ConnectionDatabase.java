package dataBaseConnect;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class ConnectionDatabase {

	static Connection conn;
	
	public static Connection getConnection() //return connection
	{
		
		try{
            Class.forName("com.mysql.jdbc.Driver");
    		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginuser", "root", "");
    		
    		}
    		catch(Exception ex)
    	   {
            ex.printStackTrace();
           }
		return conn;
		
	}
	
}
