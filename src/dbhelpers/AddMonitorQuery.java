package dbhelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbhelpers.dao.ConnectionBuilder;
import model.MonitoringPoint;

public class AddMonitorQuery {

	// Query the DB to add water quality data

	public void doAdd(MonitoringPoint monitoringPoint) {
		String query = "INSERT INTO  `MONITORING_POINT`(`SITE_NAME`,`SITE_POINT`,`LOCATION_LATITUDE`,`LOCATION_LONGITUDE`,`DESCRIPTION`,`SITE_USE`)values (?,?,?,?,?,?)";

		Connection connection = ConnectionBuilder.connect();
		try {
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setString(1, monitoringPoint.getSiteName());
			ps.setString(2, monitoringPoint.getSitePoint());
			ps.setString(3, monitoringPoint.getLatitude());
			ps.setString(4, monitoringPoint.getLongitude());
			ps.setString(5, monitoringPoint.getDescription());
			ps.setString(6, monitoringPoint.getSiteUse());

			System.out.println(ps.executeUpdate());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConnectionBuilder.disconnect();
	}

}