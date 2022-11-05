/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Oct 12, 2022
 */

package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class ListEvent {
	@Id
	@GeneratedValue
	private int eventId;
	private String artist;
	private LocalDate concertDate;
	private LocalTime concertTime;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="eventID")
	private List<ListTicket> listOfTickets;
	
	public List<ListTicket> getListOfTickets() {
		return listOfTickets;
	}
	public void setListOfTickets(List<ListTicket> listOfTickets) {
		this.listOfTickets = listOfTickets;
	}
	//Getters and Setters
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public LocalDate getConcertDate() {
		return concertDate;
	}
	public void setConcertDate(LocalDate concertDate) {
		this.concertDate = concertDate;
	}
	public LocalTime getConcertTime() {
		return concertTime;
	}
	public void setConcertTime(LocalTime concertTime) {
		this.concertTime = concertTime;
	}
	
	
	public ListEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListEvent(String artist, LocalDate concertDate, LocalTime concertTime) {
		super();
		this.artist = artist;
		this.concertDate = concertDate;
		this.concertTime = concertTime;
	}
	@Override
	public String toString() {
		return "ListEvent [eventId=" + eventId + ", artist=" + artist + ", concertDate=" + concertDate
				+ ", concertTime=" + concertTime + "]";
	}
	
	
	
	

	
}
