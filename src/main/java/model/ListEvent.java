/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Oct 12, 2022
 */

package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String artist;
	private LocalDate concertDate;
	private LocalTime concertTime;
	
	//Getters and Setters
	public int getEventId() {
		return id;
	}

	public void setEventId(int eventId) {
		this.id = eventId;
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


	//Constructors
	public ListEvent() {
		super();
	}
	
	public ListEvent(String artist, LocalDate concertDate, LocalTime concertTime) {
		super();
		this.artist = artist;
		this.concertDate = concertDate;
		this.concertTime = concertTime;
	}

	//Methods
	@Override
	public String toString() {
		return "ListEvent [eventId=" + id + ", artist=" + artist + ", concertDate=" + concertDate + ", concertTime="
				+ concertTime + "]";
	}

	/**
	 * @param newTicket
	 */
	/*public void addTicket(ListTicket newTicket) {
		// TODO Auto-generated method stub
		this.listOfTickets.add(newTicket);
		
	}*/
	
	
}
