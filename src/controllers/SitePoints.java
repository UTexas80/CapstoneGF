package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dbhelpers.ViewQuery;

@WebServlet({ "/sitePoints" })
public class SitePoints extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SitePoints() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ViewQuery viewQuery = new ViewQuery();

		List<String> list;
		String json = null;
		try {
			list = viewQuery.getMonitoringPointSitePoint(request.getParameter("siteName"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

}
