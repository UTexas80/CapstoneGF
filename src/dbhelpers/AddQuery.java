package dbhelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbhelpers.dao.ConnectionBuilder;
import model.WaterQuality;

public class AddQuery {

	// Query the DB to add water quality data

	public void doAdd(WaterQuality waterQuality) {
		String query = "insert into WATER_QUALITY(`SAMPLE_DATE`, `SAMPLED_BY`, `SITE_CONDITION`,`PH`,`CONDUCTIVITY`,`DISSOLVED_OXYGEN`,`TEMPERATURE`,`TURBIDITY`,`STAGE`,`FECAL_COLIFORM`,`E_COLI`,`HARDNESS`,`TOTAL_P`,`TOTAL_N`,`TSS`,`ARSENIC`,`COPPER`,`LEAD`,`ZINC`,`1_1_2_2_TETRACHLOROETHENE`,`1_1_1_TRICHLOROETHANE`,`1_1_2_TRICHLOROETHANE`,`1_1_DICHLOROETHANE`,`1_1_DICHLOROETHENE`,`1_2_DICHLOROBENZENE`,`1_2_DICHLOROETHANE`,`1_2_DICHLOROPROPANE`,`1_2_DIMETHYLBENZENE`,`1_3_DICHLOROBENZENE`,`1_4_DICHLOROBENZENE`,`2_CHLOROETHYL_VINYL_ETHER`,`ACROLEIN`,`ACRYLONITRILE`,`BENZENE`,`BROMODICHLOROMETHANE`,`BROMOFORM`,`BROMOMETHANE`,`CARBON_TETRACHLORIDE`,`CHLOROBENZENE`,`CHLOROETHANE`,`CHLOROFORM`,`CHLOROMETHANE`,`CIS_1_3_DICHLOROPROPENE`,`DIBROMOCHLOROMETHANE`,`ETHYLBENZENE`,`METHYLENE_CHLORIDE`,`TETRACHLOROETHENE_PCE`,`TOLUENE`,`TRANS_1_2_DICHLOROETHENE`,`TRANS_1_3_DICHLOROPROPENE`,`TRICHLOROETHENE_TCE`,`TRICHLOROFLUOROMETHANE_FREON_11`,`VINYL_CHLORIDE`,`XYLENES_MP`,`SITE_NAME`,`SITE_POINT`) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ) ";

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
			ps.setString(20, waterQuality.getTETRACHLOROETHENE());
			ps.setString(21, waterQuality.getTRICHLOROETHANE());
			ps.setString(22, waterQuality.getTRICHLOROETHANEa());
			ps.setString(23, waterQuality.getDICHLOROETHANE());
			ps.setString(24, waterQuality.getDICHLOROETHENEa());
			ps.setString(25, waterQuality.getDICHLOROBENZENE());
			ps.setString(26, waterQuality.getDICHLOROETHANEa());
			ps.setString(27, waterQuality.getDICHLOROPROPANE());
			ps.setString(28, waterQuality.getDIMETHYLBENZENEa());
			ps.setString(29, waterQuality.getDICHLOROBENZENEb());
			ps.setString(30, waterQuality.getDICHLOROBENZENEc());
			ps.setString(31, waterQuality.getCHLOROETHYLVINYLETHER());
			ps.setString(32, waterQuality.getACROLEIN());
			ps.setString(33, waterQuality.getACRYLONITRILE());
			ps.setString(34, waterQuality.getBENZENE());
			ps.setString(35, waterQuality.getBROMODICHLOROMETHANE());
			ps.setString(36, waterQuality.getBROMOFORM());
			ps.setString(37, waterQuality.getBROMOMETHANE());
			ps.setString(38, waterQuality.getCARBONTETRACHLORIDE());
			ps.setString(39, waterQuality.getCHLOROBENZENE());
			ps.setString(40, waterQuality.getCHLOROETHANEa());
			ps.setString(41, waterQuality.getCHLOROFORM());
			ps.setString(42, waterQuality.getCHLOROMETHANE());
			ps.setString(43, waterQuality.getCISDICHLOROPROPENE());
			ps.setString(44, waterQuality.getDIBROMOCHLOROMETHANE());
			ps.setString(45, waterQuality.getETHYLBENZENE());
			ps.setString(46, waterQuality.getMETHYLENECHLORIDE());
			ps.setString(47, waterQuality.getTETRACHLOROETHENE());
			ps.setString(48, waterQuality.getTOLUENE());
			ps.setString(49, waterQuality.getTRANSDICHLOROETHENEa());
			ps.setString(50, waterQuality.getTRANSDICHLOROPROPENEb());
			ps.setString(51, waterQuality.getTRICHLOROETHENETCE());
			ps.setString(52, waterQuality.getTRICHLOROFLUOROMETHANEFREON());
			ps.setString(53, waterQuality.getVINYLCHLORIDE());
			ps.setString(54, waterQuality.getXYLENES_MP());
			ps.setString(55, waterQuality.getSitename());
			ps.setString(56, waterQuality.getSitepoint());

			System.out.println(ps.executeUpdate());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConnectionBuilder.disconnect();
	}

}