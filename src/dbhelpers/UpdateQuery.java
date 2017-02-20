package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbhelpers.dao.ConnectionBuilder;
import model.WaterQuality;
/**
 * @author gfalk
 *
 */
public class UpdateQuery {

	// Query the DB to update water quality data

	public void doUpdate(WaterQuality waterQuality) {

		String query = "UPDATE WATER_QUALITY SET SAMPLE_DATE = ?, SAMPLED_BY=?, SITE_CONDITION =?, PH=?, CONDUCTIVITY=?, DISSOLVED_OXYGEN=?, TEMPERATURE=?,TURBIDITY=?,STAGE=?,FECAL_COLIFORM=?,E_COLI=?,HARDNESS=?,TOTAL_P=?,TOTAL_N=?,TSS=?,ARSENIC=?,COPPER=?,LEAD=?,ZINC=?,SITE_NAME=?,SITE_POINT=? WHERE SITE_POINT=?";
		
		Connection connection = ConnectionBuilder.connect();
		try {
			PreparedStatement ps = connection.prepareStatement(query);

			// System.out.println(waterQuality.getSampleDate());

			ps.setString(1, waterQuality.getSampleDate());
			ps.setString(2, waterQuality.getSampledBy());
			ps.setString(3, waterQuality.getSiteCondition());
			ps.setString(4, waterQuality.getPH());
			ps.setString(5, waterQuality.getConductivity());
			ps.setString(6, waterQuality.getDissolvedOxygen());
			ps.setString(7, waterQuality.getTemperature());
			ps.setString(8, waterQuality.getTurbidity());
			ps.setString(9, waterQuality.getStage());
			ps.setString(10, waterQuality.getFecalColiform());
			ps.setString(11, waterQuality.getEcoli());
			ps.setString(12, waterQuality.getHardness());
			ps.setString(13, waterQuality.getTotalP());
			ps.setString(14, waterQuality.getTotaln());
			ps.setString(15, waterQuality.getTss());
			ps.setString(16, waterQuality.getArsenic());
			ps.setString(17, waterQuality.getCopper());
			ps.setString(18, waterQuality.getLead());
			ps.setString(19, waterQuality.getZinc());
			ps.setString(20, waterQuality.getSitename());
			ps.setString(21, waterQuality.getSitepoint());

			ps.executeUpdate();

			System.out.println(ps.executeUpdate());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConnectionBuilder.disconnect();
	}

}