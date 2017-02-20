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

import dbhelpers.ViewMonitorQuery;
import model.MonitoringPoint;

/**
 * Servlet implementation class ViewMonitorData
 */
@WebServlet("/viewMonitor")
public class ViewMonitorData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewMonitorData() {
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "ViewMonitor.jsp";

		ViewMonitorQuery viewMonitorQuery = new ViewMonitorQuery();
		try {
			List<MonitoringPoint> monitoringPoints = viewMonitorQuery.getMonitoringPoints();
			/**
			 * System.out.println(monitoringPoin
			 * System.out.println(waterQuality.getSampledBy());
			 * System.out.println(waterQuality.getSiteCondition());
			 */
			request.setAttribute("MONITORINGPOINTS", monitoringPoints);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
