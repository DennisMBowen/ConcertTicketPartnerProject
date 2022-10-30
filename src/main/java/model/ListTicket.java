/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Oct 12, 2022
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tickets")
public class ListTicket {
	@Id
	@GeneratedValue
	private int id;
	private double price;
	private String customer;
	private String venueRow;
	private String seatNumber;
	
	//Getters and Setters
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
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
	
	public ListTicket(int id, double price, String customer, String venueRow, String seatNumber) {
		super();
		this.id = id;
		this.price = price;
		this.customer = customer;
		this.venueRow = venueRow;
		this.seatNumber = seatNumber;
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
		return "ListTicket [id=" + id + ", price=" + price + ", customer=" + customer + ", venueRow=" + venueRow
				+ ", seatNumber=" + seatNumber + "]";
	}
	
	

	
}
