
/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbhelpers.dao.ConnectionBuilder;
import model.WaterQuality;

/**
 * @author gfalk
 *
 */
public class ReadQuery {

	private Connection connection;
	private ResultSet results;
	
	// public ReadQuery(String dbName, String uname, String pwd){
	public ReadQuery(){
		/*		String url = "jdbc:mysql://localhost:3306/" + dbName + "?verifyServerCertificate=false&useSSL=true";
			Connection connection = ConnectionBuilder.connect();  // last statement added
		
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
  			this.connection = DriverManager.getConnection(url, uname, pwd);

 			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
*/	
	}
	
	public void doRead(){
		// Connection connection = ConnectionBuilder.connect();
		// Connection connection = ConnectionBuilder.connect();
		// String query = "select * from water_quality";
		
/*		try {
//			PreparedStatement ps = this.connection.prepareStatement(query);
//			this.results= ps.executeQuery();
//			System.out.println("Hello World!! " + this.results.getString(1));	
			String url = "jdbc:mysql://localhost:3306/";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
	}

public String getHTMLTable(){
	Connection connection = ConnectionBuilder.connect();
	WaterQuality waterQuality = new WaterQuality();
	String table ="";
	table+="<table border=1>";

	//System.out.println("Hello World!! " + this.results.getString(1));	
	
	try {
		String query = "select * from water_quality";
		PreparedStatement ps = connection.prepareStatement(query);		
		ResultSet rs = ps.executeQuery();
		//while(this.results.next()){
		while (rs.next()){	
					
			// waterQuality.setSampleDate(this.results.getString(1));

			waterQuality.setSampleDate(rs.getString(1));
			waterQuality.setSampledBy(rs.getString(2));
			waterQuality.setSiteCondition(rs.getString(3));
			waterQuality.setPH(rs.getString(4));
			waterQuality.setConductivity(rs.getString(5));
			waterQuality.setDissolvedOxygen(rs.getString(6));
			waterQuality.setTemperature(rs.getString(7));
			waterQuality.setTurbidity(rs.getString(8));
			waterQuality.setStage(rs.getString(9));
			waterQuality.setFecalColiform(rs.getString(10));
			waterQuality.setEcoli(rs.getString(11));
			waterQuality.setHardness(rs.getString(12));
			waterQuality.setTotalP(rs.getString(13));
			waterQuality.setTotaln(rs.getString(14));
			waterQuality.setTss(rs.getString(15));
			waterQuality.setArsenic(rs.getString(16));
			waterQuality.setCopper(rs.getString(17));
			waterQuality.setLead(rs.getString(18));
			waterQuality.setZinc(rs.getString(19));
			waterQuality.setSitename(rs.getString(20));
			waterQuality.setSitepoint(rs.getString(21));
		
			table +="<tr>";
			table +="<td>";
			table += waterQuality.getSampleDate();
			//table += "<a href=readItem?productID=" + product.getProductID() + ">" + product.getProductName() + "</a>";	//	<a href=update?productID=" ====>ReadItemController	
			//table +="<a href=delete?SampleDate=" + rs.getString(1)	 + ">delete</a>";
			table +="</td>";		
						
			table +="<td>";
			table += waterQuality.getSampledBy();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getSiteCondition();
			table +="</td>";			
			table +="<td>";
			table += waterQuality.getPH();
			table +="</td>";			
			table +="<td>";
			table +=waterQuality.getConductivity();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getDissolvedOxygen();
			table +="</td>";			
			table +="<td>";
			table += waterQuality.getTemperature();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getTurbidity();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getStage();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getFecalColiform();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getEcoli();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getHardness();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getTotalP();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getTotaln();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getTss();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getArsenic();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getCopper();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getLead();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getZinc();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getSitename();
			table +="</td>";
			table +="<td>";
			table += waterQuality.getSitepoint();
			table +="</td>";
						
			table +="<td>";
				table +="<a href=update?SampleDate=" + rs.getString(1)	 + ">update | </a>" + 
					    "<a href=delete?SampleDate=" + rs.getString(1)	 + ">delete</a>";

			table +="</td>";	
			table +="</tr>";
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ConnectionBuilder.disconnect();
	
	table+="</table>";
	
	return table;
}
}