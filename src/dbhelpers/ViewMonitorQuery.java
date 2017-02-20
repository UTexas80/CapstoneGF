package dbhelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbhelpers.dao.ConnectionBuilder;
import model.MonitoringPoint;

public class ViewMonitorQuery {

	public ViewMonitorQuery() {
		// TODO Auto-generated constructor stub
	}

	public List<MonitoringPoint> getMonitoringPoints() throws SQLException {
		List<MonitoringPoint> monitoringPoints = new ArrayList<>();

		Connection connection = ConnectionBuilder.connect();
		String query = "select `SITE_NAME`,`SITE_POINT`,`LOCATION_LATITUDE`,`LOCATION_LONGITUDE`,`DESCRIPTION`,`SITE_USE` from MONITORING_POINT";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			MonitoringPoint monitoringPoint = new MonitoringPoint();

			monitoringPoint.setSiteName(rs.getString(1));
			monitoringPoint.setSitePoint(rs.getString(2));
			monitoringPoint.setLatitude(rs.getString(3));
			monitoringPoint.setLongitude(rs.getString(4));
			monitoringPoint.setDescription(rs.getString(5));
			monitoringPoint.setSiteUse(rs.getString(6));

			// create the object to hold the values from the db
			monitoringPoints.add(monitoringPoint);
		}
		ConnectionBuilder.disconnect();

		// returns the object that holds the values
		return monitoringPoints;

	}

}

