package dbhelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbhelpers.dao.ConnectionBuilder;
import model.MonitoringPoint;
import model.WaterQuality;

public class ViewQuery {

	public ViewQuery() {
		// TODO Auto-generated constructor stub
	}
	
	public List<WaterQuality> getWaterQualities() throws SQLException {
		
		List<WaterQuality> waterQualities = new ArrayList<>();
		
		Connection connection = ConnectionBuilder.connect();
		String query = "select `SAMPLE_DATE`, `SAMPLED_BY`, `SITE_CONDITION`,`PH`,`CONDUCTIVITY`,`DISSOLVED_OXYGEN`,`TEMPERATURE`,`TURBIDITY`,`STAGE`,`FECAL_COLIFORM`,`E_COLI`,`HARDNESS`,`TOTAL_P`,`TOTAL_N`,`TSS`,`ARSENIC`,`COPPER`,`LEAD`,`ZINC`,`1_1_2_2_TETRACHLOROETHENE`,`1_1_1_TRICHLOROETHANE`,`1_1_2_TRICHLOROETHANE`,`1_1_DICHLOROETHANE`,`1_1_DICHLOROETHENE`,`1_2_DICHLOROBENZENE`,`1_2_DICHLOROETHANE`,`1_2_DICHLOROPROPANE`,`1_2_DIMETHYLBENZENE`,`1_3_DICHLOROBENZENE`,`1_4_DICHLOROBENZENE`,`2_CHLOROETHYL_VINYL_ETHER`,`ACROLEIN`,`ACRYLONITRILE`,`BENZENE`,`BROMODICHLOROMETHANE`,`BROMOFORM`,`BROMOMETHANE`,`CARBON_TETRACHLORIDE`,`CHLOROBENZENE`,`CHLOROETHANE`,`CHLOROFORM`,`CHLOROMETHANE`,`CIS_1_3_DICHLOROPROPENE`,`DIBROMOCHLOROMETHANE`,`ETHYLBENZENE`,`METHYLENE_CHLORIDE`,`TETRACHLOROETHENE_PCE`,`TOLUENE`,`TRANS_1_2_DICHLOROETHENE`,`TRANS_1_3_DICHLOROPROPENE`,`TRICHLOROETHENE_TCE`,`TRICHLOROFLUOROMETHANE_FREON_11`,`VINYL_CHLORIDE`,`XYLENES_MP`,`SITE_NAME`,`SITE_POINT`from WATER_QUALITY";

		PreparedStatement ps = connection.prepareStatement(query);
				
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			WaterQuality waterQuality = new WaterQuality();

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
			waterQuality.setTETRACHLOROETHENE(rs.getString(20));
			waterQuality.setTRICHLOROETHANE(rs.getString(21));
			waterQuality.setTRICHLOROETHANEa(rs.getString(22));
			waterQuality.setDICHLOROETHANE(rs.getString(23));
			waterQuality.setDICHLOROETHENEa(rs.getString(24));
			waterQuality.setDICHLOROBENZENE(rs.getString(25));
			waterQuality.setDICHLOROETHANEa(rs.getString(26));
			waterQuality.setDICHLOROPROPANE(rs.getString(27));
			waterQuality.setDIMETHYLBENZENEa(rs.getString(28));
			waterQuality.setDICHLOROBENZENEb(rs.getString(29));
			waterQuality.setDICHLOROBENZENEc(rs.getString(30));
			waterQuality.setCHLOROETHYLVINYLETHER(rs.getString(31));
			waterQuality.setACROLEIN(rs.getString(32));
			waterQuality.setACRYLONITRILE(rs.getString(33));
			waterQuality.setBENZENE(rs.getString(34));
			waterQuality.setBROMODICHLOROMETHANE(rs.getString(35));
			waterQuality.setBROMOFORM(rs.getString(36));
			waterQuality.setBROMOMETHANE(rs.getString(37));
			waterQuality.setCARBONTETRACHLORIDE(rs.getString(38));
			waterQuality.setCHLOROBENZENE(rs.getString(39));
			waterQuality.setCHLOROETHANEa(rs.getString(40));
			waterQuality.setCHLOROFORM(rs.getString(41));
			waterQuality.setCHLOROMETHANE(rs.getString(42));
			waterQuality.setCISDICHLOROPROPENE(rs.getString(43));
			waterQuality.setDIBROMOCHLOROMETHANE(rs.getString(44));
			waterQuality.setETHYLBENZENE(rs.getString(45));
			waterQuality.setMETHYLENECHLORIDE(rs.getString(46));
			waterQuality.setTETRACHLOROETHENEPCE(rs.getString(47));
			waterQuality.setTOLUENE(rs.getString(48));
			waterQuality.setTRANSDICHLOROETHENEa(rs.getString(49));
			waterQuality.setTRANSDICHLOROPROPENEb(rs.getString(50));
			waterQuality.setTRICHLOROETHENETCE(rs.getString(51));
			waterQuality.setTRICHLOROFLUOROMETHANEFREON(rs.getString(52));
			waterQuality.setVINYLCHLORIDE(rs.getString(53));
			waterQuality.setXYLENES_MP(rs.getString(54));
			waterQuality.setSitename(rs.getString(55));
			waterQuality.setSitepoint(rs.getString(56));

			// create the object to hold the values from the db
			waterQualities.add(waterQuality);
		}
		ConnectionBuilder.disconnect();

		// returns the object that holds the values
		return waterQualities;

	}

	public List<MonitoringPoint> getMonitoringPointSiteNames() throws SQLException {
		List<MonitoringPoint> monitoringPoints = new ArrayList<>();

		Connection connection = ConnectionBuilder.connect();
		String query = "select distinct `SITE_NAME` from MONITORING_POINT";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			MonitoringPoint monitoringPoint = new MonitoringPoint();

			monitoringPoint.setSiteName(rs.getString(1));
			// monitoringPoint.setSitePoint(rs.getString(2));

			// create the object to hold the values from the db
			monitoringPoints.add(monitoringPoint);
		}
		ConnectionBuilder.disconnect();

		// returns the object that holds the values
		return monitoringPoints;

	}

	public List<String> getMonitoringPointSitePoint(String siteName) throws SQLException {
		List<String> sitePoints = new ArrayList<>();

		Connection connection = ConnectionBuilder.connect();
		String query = "select distinct `SITE_POINT` from MONITORING_POINT where `SITE_NAME` = '" + siteName + "'";

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			sitePoints.add(rs.getString(1));
			// monitoringPoint.setSitePoint(rs.getString(2));

			// create the object to hold the values from the db
		}
		ConnectionBuilder.disconnect();

		// returns the object that holds the values
		return sitePoints;

	}

}
