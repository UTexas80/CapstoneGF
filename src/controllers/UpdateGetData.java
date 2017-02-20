package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.UpdateGetDataQuery;
import model.WaterQuality;

/**
 * Servlet implementation class UpdateFormServlet
 */
@WebServlet(description = "This will get a water quality record and use the data to fill in a table for updating the record", 
	urlPatterns = { "/updateGetData" })

public class UpdateGetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGetData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the sample Date pk ID
		String url = "UpdateWaterQuality.jsp";
		String sampleDate = request.getParameter("SampleDate");
		String sitePoint = request.getParameter("SitePoint");
		System.out.println("Hello UpdateGetData doPost Servlet!! "  + sitePoint);

		System.out.println("BEFORE create a UpdateGetDataQuery to read the update record"  + sitePoint);
		// create a UpdateGetDataQuery to read the update record
		UpdateGetDataQuery ud = new UpdateGetDataQuery();
		System.out.println("AFTER create a UpdateGetDataQuery to read the update record"  + sitePoint);
		try {
			List<WaterQuality> waterQualities = ud.getWaterQualities(sampleDate, sitePoint);
			/*
			 System.out.println(waterQualities.get(0));	
			 * System.out.println(waterQuality.getSampledBy());
			 * System.out.println(waterQuality.getSiteCondition());
			 */
			request.setAttribute("WATERQUALITIES", waterQualities);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
