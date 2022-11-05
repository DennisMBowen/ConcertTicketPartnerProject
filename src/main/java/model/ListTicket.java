/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Oct 12, 2022
 */
package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tickets")
public class ListTicket {
	@Id
	@GeneratedValue
	private int ticketId;
	private double price;
	private String customer;
	private String venueRow;
	private String seatNumber;
	@ManyToOne
	@JoinTable(name="events",
		joinColumns = @JoinColumn(name = "eventID", referencedColumnName="eventID"))
	private ListEvent eventID;
	
	//Getters and Setters
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public ListEvent getEventID() {
		return eventID;
	}
	public void setEventID(ListEvent eventID) {
		this.eventID = eventID;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getVenueRow() {
		return venueRow;
	}
	public void setVenueRow(String venueRow) {
		this.venueRow = venueRow;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	
	//Constructors
	public ListTicket() {
		super();
	}
	
	
	public ListTicket(double price, String customer, String venueRow, String seatNumber, ListEvent eventID) {
		super();
		this.price = price;
		this.customer = customer;
		this.venueRow = venueRow;
		this.seatNumber = seatNumber;
		this.eventID = eventID;
	}
	public ListTicket(double price, String customer, String venueRow, String seatNumber) {
		super();
		this.price = price;
		this.customer = customer;
		this.venueRow = venueRow;
		this.seatNumber = seatNumber;
	}
	@Override
	public String toString() {
		return "ListTicket [id=" + ticketId + ", price=" + price + ", customer=" + customer + ", venueRow=" + venueRow
				+ ", seatNumber=" + seatNumber + "]";
	}
	
	

	
}
