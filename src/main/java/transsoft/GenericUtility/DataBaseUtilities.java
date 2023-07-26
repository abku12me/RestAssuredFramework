package transsoft.GenericUtility;

import com.mysql.jdbc.Driver;
import java.sql.*;

/**
 * This class will provide database connection
 * @author mishr
 *
 */
public class DataBaseUtilities {
	
	/**
	 * This method will update data in database
	 * @param query
	 * @throws SQLException
	 */
	public void databaseConnection(String query) throws SQLException
	{
		Driver ref=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(ref);
		String URL="";
		String USERNAME="";
		String Password="";
		Connection con = DriverManager.getConnection(URL, USERNAME, Password);
		Statement sta = con.createStatement();
		int result = sta.executeUpdate(query);
		if(result==1)
		  System.out.println("data updated");
		else
			System.out.println("data not updated");	
		
	}

}
