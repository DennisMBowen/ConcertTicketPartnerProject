package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListEvent;
import model.ListTicket;


/**
 * Servlet implementation class AddTicketServlet
 */
@WebServlet("/addTicketServlet")
public class AddTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTicketServlet() {
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
		ListEventHelper concertDao = new ListEventHelper();
		ListTicketHelper ticketDao = new ListTicketHelper();
		
		
		// TODO Auto-generated method stub
		String stringPrice = request.getParameter("price");
		double price = Double.parseDouble(stringPrice);
		System.out.println(price);
		
		String customer = request.getParameter("customer");
		System.out.println(customer);
		String row = request.getParameter("row");
		System.out.println(row);
		String seat = request.getParameter("seat");
		System.out.println(seat);
		
		String stringConcertId = request.getParameter("id");
		int concertId = Integer.parseInt(stringConcertId);
		ListEvent concert = concertDao.searchForEventById(concertId);
		
		ListTicket newTicket = new ListTicket (price, customer, row, seat, concert);
		System.out.println(newTicket.toString());
		ticketDao.insertTicket(newTicket);
		
		/*concert.addTicket(newTicket);
		concertDao.updateEvent(concert);
		//Create method in EventHelper to add new ticket to Event's list of Tickets*/
		
		getServletContext().getRequestDispatcher("/viewAllEventsServlet").forward(request, response);
	}

}
