package transsoft.GenericUtility;

import com.mysql.jdbc.Driver;
import java.sql.*;

/**
 * This class will provide database connection
 * @author mishr
 *
 */
public class DataBaseUtilities {
	Connection con;
	
	/**
	 * This method will update data in database
	 * @param query
	 * @throws SQLException
	 */
	public void databaseConnection(String query) throws SQLException
	{
		
		
		Driver ref=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(ref);
		String URL=IConstantUtilities.URI;
		String USERNAME=IConstantUtilities.username;
		String Password=IConstantUtilities.password;
		Connection con = DriverManager.getConnection(URL, USERNAME, Password);
		Statement sta = con.createStatement();
		int result = sta.executeUpdate(query);
		if(result==1)
		  System.out.println("data updated");
		else
			System.out.println("data not updated");	
		
	}
	
	/**
	 * This method will make a connection with database
	 * @throws SQLException
	 */
	public void dBconnection() throws SQLException
	{
		Driver ref=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(ref);
		String URL="jdbc:mysql://rmgtestingserver:3333/projects";
		String USERNAME="root@%";
		String Password="root";
		Connection con = DriverManager.getConnection(URL, USERNAME, Password);
		
	}
	
	
	
	public void executeUpdate(String Query) throws SQLException
	{
		dBconnection();
		
             Statement sta = con.createStatement();
             
            int result=sta.executeUpdate(Query);
             if(result==1)
            	 System.out.println("data created");
             else
            	 System.out.println("data not created"); 	
	}
	
	
	

}
