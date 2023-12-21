package com.Anudip.DomesticHelpManagementSystem.entity;

import java.util.List;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("CLIENT")
public class Client extends User {
	
	@Embedded
	//@OneToOne(cascade = CascadeType.ALL)
    Address address;
	
    @OneToMany(mappedBy = "client")
	private List<Booking> booking;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Booking> getBookingHistory() {
		return booking;
	}

	public void setBookingHistory(List<Booking> bookingHistory) {
		this.booking = booking;
	}

	

	public Client(String fname, String mname, String lname, String email, String phoneNumber, Address address,
			String password, com.Anudip.DomesticHelpManagementSystem.entity.Role role, Address address2,
			List<Booking> booking) {
		super(fname, mname, lname, email, phoneNumber, address, password, role);
		address = address2;
		this.booking = booking;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	  

}