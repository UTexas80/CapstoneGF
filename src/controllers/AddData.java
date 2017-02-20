package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.AddQuery;
import dbhelpers.ViewQuery;
import model.MonitoringPoint;
import model.WaterQuality;

/**
 * Servlet implementation class AddData
 */
@WebServlet({ "/addData" })
public class AddData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "AddWaterQuality.jsp";
		ViewQuery viewQuery = new ViewQuery();
		try {
			List<MonitoringPoint> monitoringPoints = viewQuery.getMonitoringPointSiteNames();

			request.setAttribute("MONITORINGPOINTS", monitoringPoints);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String SampleDate = request.getParameter("SampleDate");
		String SampledBy = request.getParameter("SampledBy");
		String SiteCondition = request.getParameter("SiteCondition");
		String PH = request.getParameter("PH");
		String Conductivity = request.getParameter("Conductivity");
		String DissolvedOxygen = request.getParameter("DissolvedOxygen");
		String Temperature = request.getParameter("Temperature");
		String Turbidity = request.getParameter("Turbidity");
		String Stage = request.getParameter("Stage");
		String FecalColiform = request.getParameter("FecalColiform");
		String Ecoli = request.getParameter("Ecoli");
		String Hardness = request.getParameter("Hardness");
		String TotalP = request.getParameter("TotalP");
		String Totaln = request.getParameter("Totaln");
		String Tss = request.getParameter("Tss");
		String Arsenic = request.getParameter("Arsenic");
		String Copper = request.getParameter("Copper");
		String Lead = request.getParameter("Lead");
		String Zinc = request.getParameter("Zinc");
		String TETRACHLOROETHENE = request.getParameter("TETRACHLOROETHENE");
		String TRICHLOROETHANE = request.getParameter("TRICHLOROETHANE");
		String TRICHLOROETHANEa = request.getParameter("TRICHLOROETHANEa");
		String DICHLOROETHANE = request.getParameter("DICHLOROETHAN");
		String DICHLOROETHENEa = request.getParameter("DICHLOROETHENEa");
		String DICHLOROBENZENE = request.getParameter("DICHLOROBENZENE");
		String DICHLOROETHANEa = request.getParameter("DICHLOROETHANEa");
		String DICHLOROPROPANE = request.getParameter("DICHLOROPROPANE");
		String DIMETHYLBENZENEa = request.getParameter("DIMETHYLBENZENEa");
		String DICHLOROBENZENEb = request.getParameter("DICHLOROBENZENEb");
		String DICHLOROBENZENEc = request.getParameter("DICHLOROBENZENEc");
		String CHLOROETHYLVINYLETHER = request.getParameter("CHLOROETHYLVINYLETHER");
		String ACROLEIN = request.getParameter("ACROLEIN");
		String ACRYLONITRILE = request.getParameter("ACRYLONITRILE");
		String BENZENE = request.getParameter("BENZENE");
		String BROMODICHLOROMETHANE = request.getParameter("BROMODICHLOROMETHANE");
		String BROMOFORM = request.getParameter("BROMOFORM");
		String BROMOMETHANE = request.getParameter("BROMOMETHANE");
		String CARBONTETRACHLORIDE = request.getParameter("CARBONTETRACHLORIDE");
		String CHLOROBENZENE = request.getParameter("CHLOROBENZENE");
		String CHLOROETHANEa = request.getParameter("CHLOROETHANEa");
		String CHLOROFORM = request.getParameter("CHLOROFORM");
		String CHLOROMETHANE = request.getParameter("CHLOROMETHANE");
		String CISDICHLOROPROPENE = request.getParameter("CISDICHLOROPROPENE");
		String DIBROMOCHLOROMETHANE = request.getParameter("DIBROMOCHLOROMETHANE");
		String ETHYLBENZENE = request.getParameter("ETHYLBENZENE");
		String METHYLENECHLORIDE = request.getParameter("METHYLENECHLORIDE");
		String TETRACHLOROETHENEPCE = request.getParameter("TETRACHLOROETHENEPCE");
		String TOLUENE = request.getParameter("TOLUENE");
		String TRANSDICHLOROETHENEa = request.getParameter("TRANSDICHLOROETHENEa");
		String TRANSDICHLOROPROPENEb = request.getParameter("TRANSDICHLOROPROPENEb");
		String TRICHLOROETHENETCE = request.getParameter("TRICHLOROETHENETCE");
		String TRICHLOROFLUOROMETHANEFREON = request.getParameter("TRICHLOROFLUOROMETHANEFREON");
		String VINYLCHLORIDE = request.getParameter("VINYLCHLORIDE");
		String XYLENESMP = request.getParameter("XYLENESMP");
		String Sitename = request.getParameter("Site");
		String Sitepoint = request.getParameter("Sitepoint");

		// set up the water quality object

		WaterQuality waterQuality = new WaterQuality();

		// store data for the fields in the waterQuality object

		waterQuality.setSampleDate(SampleDate);
		waterQuality.setSampledBy(SampledBy);
		waterQuality.setSiteCondition(SiteCondition);
		waterQuality.setPH(PH);
		waterQuality.setConductivity(Conductivity);
		waterQuality.setDissolvedOxygen(DissolvedOxygen);
		waterQuality.setTemperature(Temperature);
		waterQuality.setTurbidity(Turbidity);
		waterQuality.setStage(Stage);
		waterQuality.setFecalColiform(FecalColiform);
		waterQuality.setEcoli(Ecoli);
		waterQuality.setHardness(Hardness);
		waterQuality.setTotalP(TotalP);
		waterQuality.setTotaln(Totaln);
		waterQuality.setTss(Tss);
		waterQuality.setArsenic(Arsenic);
		waterQuality.setCopper(Copper);
		waterQuality.setLead(Lead);
		waterQuality.setZinc(Zinc);
		waterQuality.setTETRACHLOROETHENE(TETRACHLOROETHENE);
		waterQuality.setTRICHLOROETHANEa(TRICHLOROETHANEa);
		waterQuality.setDICHLOROETHANE(DICHLOROETHANE);
		waterQuality.setDICHLOROETHENEa(DICHLOROETHENEa);
		waterQuality.setDICHLOROBENZENE(DICHLOROBENZENE);
		waterQuality.setDICHLOROETHANEa(DICHLOROETHANEa);
		waterQuality.setDICHLOROPROPANE(DICHLOROPROPANE);
		waterQuality.setDIMETHYLBENZENEa(DIMETHYLBENZENEa);
		waterQuality.setDICHLOROBENZENEb(DICHLOROBENZENEb);
		waterQuality.setDICHLOROBENZENEc(DICHLOROBENZENEc);
		waterQuality.setCHLOROETHYLVINYLETHER(CHLOROETHYLVINYLETHER);
		waterQuality.setACROLEIN(ACROLEIN);
		waterQuality.setACRYLONITRILE(ACRYLONITRILE);
		waterQuality.setBENZENE(BENZENE);
		waterQuality.setBROMODICHLOROMETHANE(BROMODICHLOROMETHANE);
		waterQuality.setBROMOFORM(BROMOFORM);
		waterQuality.setBROMOMETHANE(BROMOMETHANE);
		waterQuality.setCARBONTETRACHLORIDE(CARBONTETRACHLORIDE);
		waterQuality.setCHLOROBENZENE(CHLOROBENZENE);
		waterQuality.setCHLOROETHANEa(CHLOROETHANEa);
		waterQuality.setCHLOROFORM(CHLOROFORM);
		waterQuality.setCHLOROMETHANE(CHLOROMETHANE);
		waterQuality.setCISDICHLOROPROPENE(CISDICHLOROPROPENE);
		waterQuality.setDIBROMOCHLOROMETHANE(DIBROMOCHLOROMETHANE);
		waterQuality.setETHYLBENZENE(ETHYLBENZENE);
		waterQuality.setMETHYLENECHLORIDE(METHYLENECHLORIDE);
		waterQuality.setTETRACHLOROETHENEPCE(TETRACHLOROETHENEPCE);
		waterQuality.setTOLUENE(TOLUENE);
		waterQuality.setTRANSDICHLOROETHENEa(TRANSDICHLOROETHENEa);
		waterQuality.setTRANSDICHLOROPROPENEb(TRANSDICHLOROPROPENEb);
		waterQuality.setTRICHLOROETHENETCE(TRICHLOROETHENETCE);
		waterQuality.setTRICHLOROFLUOROMETHANEFREON(TRICHLOROFLUOROMETHANEFREON);
		waterQuality.setVINYLCHLORIDE(VINYLCHLORIDE);
		waterQuality.setXYLENES_MP(XYLENESMP);
		waterQuality.setSitename(Sitename);
		waterQuality.setSitepoint(Sitepoint);

		// Setting up the add Query object for Water Quality
		AddQuery addQuery = new AddQuery();
		addQuery.doAdd(waterQuality);

		// pass on the object to the view data url
		String url = "/viewData";

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}

