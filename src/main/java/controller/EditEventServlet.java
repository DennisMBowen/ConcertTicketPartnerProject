package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListEvent;


/**
 * Servlet implementation class EditEventServlet
 */
@WebServlet("/editEventServlet")
public class EditEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEventServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ListEventHelper dao = new ListEventHelper();
		int id = Integer.parseInt(request.getParameter("id"));
		String artist = request.getParameter("artist");
		String month = request.getParameter("month");
    	String day = request.getParameter("day");
    	String year = request.getParameter("year");
    	String hour = request.getParameter("hour");
    	String minutes = request.getParameter("minutes");
		String fullTime;
		
		LocalDate date;
		LocalTime time;
		
		try {
			date = LocalDate. of(Integer.parseInt(year),Integer.parseInt(month), Integer.parseInt(day));
		}catch(NumberFormatException e) {
			date = LocalDate.now();
		}
		
		if(Integer.parseInt(hour) < 10) {
			hour = "0" + hour;
		}
		
		if(Integer.parseInt(minutes) < 10 && Integer.parseInt(minutes) != 00) {
				minutes = "0" + minutes;
			}
		
		fullTime = hour + ":" + minutes + ":" + "00";
		
		try {
			time = LocalTime.parse(fullTime);
		}catch(NumberFormatException e) {
			time = LocalTime.now();
		}
		
		ListEvent eventToUpdate = dao.searchForEventById(id);
		eventToUpdate.setArtist(artist);
		eventToUpdate.setConcertDate(date);
		eventToUpdate.setConcertTime(time);
		
		dao.updateEvent(eventToUpdate);

		getServletContext().getRequestDispatcher("/viewAllEventsServlet").forward(request, response);
	}

}
