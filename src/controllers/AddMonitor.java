package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.AddMonitorQuery;
import model.MonitoringPoint;

/**
 * Servlet implementation class AddMonitor
 */
@WebServlet("/addMonitor")
public class AddMonitor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddMonitor() {
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
		String url = "AddMonitorPoint.jsp";

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
		String SiteName = request.getParameter("Sitename");
		String SitePoint = request.getParameter("Sitepoint");
		String Latitude = request.getParameter("Latitude");
		String Longitude = request.getParameter("Longitude");
		String Description = request.getParameter("Description");
		String SiteUse = request.getParameter("Siteuse");

		// set up the monitoringPoint object

		MonitoringPoint monitoringPoint = new MonitoringPoint();

		// store data for the fields in the monitoringPoint object

		monitoringPoint.setSiteName(SiteName);
		monitoringPoint.setSitePoint(SitePoint);
		monitoringPoint.setLatitude(Latitude);
		monitoringPoint.setLongitude(Longitude);
		monitoringPoint.setDescription(Description);
		monitoringPoint.setSiteUse(SiteUse);

		// Setting up the add Query object for Monitoring Point
		AddMonitorQuery addMonitorQuery = new AddMonitorQuery();
		addMonitorQuery.doAdd(monitoringPoint);

		// pass on the object to the view data url
		String url = "/viewMonitor";

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
