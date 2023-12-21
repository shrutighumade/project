package com.Anudip.DomesticHelpManagementSystem.entity;

import java.io.ObjectInputFilter.Status;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="bookings")
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="client_id",nullable=false)
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="maid_id", nullable=false)
	private Maid maid;
	
	@Column(name="Booking_Date",length=30, nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date bookingDate;
	
	@Column(name="Start_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;
	
	@Column(name="End_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date entTime;
  
	@Column(name="Duration_Hours", length=4, nullable=false)
	private Integer durationHours;
    
	@Embedded
	Address address;
   
	@Column(name="Amount",length=6)
	private double amount;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Status", length=10)
    private BookingStatus status;
	
	@Column(name="Note_if_any", length=50)
	private String notes;
	
     
   

	
	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public Client getClient() {
		return client;
	}





	public void setClient(Client client) {
		this.client = client;
	}





	public Maid getMaid() {
		return maid;
	}





	public void setMaid(Maid maid) {
		this.maid = maid;
	}





	public Date getBookingDate() {
		return bookingDate;
	}





	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}





	public Date getStartTime() {
		return startTime;
	}





	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}





	public Date getEntTime() {
		return entTime;
	}





	public void setEntTime(Date entTime) {
		this.entTime = entTime;
	}





	public Integer getDurationHours() {
		return durationHours;
	}





	public void setDurationHours(Integer durationHours) {
		this.durationHours = durationHours;
	}





	public Address getAddress() {
		return address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	public double getAmount() {
		return amount;
	}





	public void setAmount(double amount) {
		this.amount = amount;
	}





	public BookingStatus getStatus() {
		return status;
	}





	public void setStatus(BookingStatus status) {
		this.status = status;
	}





	public String getNotes() {
		return notes;
	}





	public void setNotes(String notes) {
		this.notes = notes;
	}

    



	public Booking(Client client, Maid maid, Date bookingDate, Date startTime, Date entTime, Integer durationHours,
			Address address, double amount, BookingStatus status, String notes) {
		super();
		this.client = client;
		this.maid = maid;
		this.bookingDate = bookingDate;
		this.startTime = startTime;
		this.entTime = entTime;
		this.durationHours = durationHours;
		this.address = address;
		this.amount = amount;
		this.status = status;
		this.notes = notes;
	}





	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
	

	
}