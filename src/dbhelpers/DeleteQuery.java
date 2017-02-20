/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbhelpers.dao.ConnectionBuilder;

/**
 * @author gfalk
 *
 */
public class DeleteQuery {
	
//	 private Connection connection;
	
	public DeleteQuery(){
//	public DeleteQuery(String dbName, String uname, String pwd){	
/*	
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?verifyServerCertificate=false&useSSL=true";;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
*/		
	}
	
	public void doDelete(String sampleDate){
		Connection connection = ConnectionBuilder.connect();
		
		// set up a String to hold our query
		System.out.println("Hello Delete Query!! " + sampleDate);
		
		String query = "DELETE from water_quality WHERE SAMPLE_DATE=?";
		// create a preparestatement using our query string
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			// fill in the preparedstatement
			ps.setString(1, sampleDate);
			
			// execute the query
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("Goodbye Delete Query!! " + sampleDate);
	}
	
}
