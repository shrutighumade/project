package com.Anudip.DomesticHelpManagementSystem.entity;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
//import javax.persistence.Entity;
//import javax.persistence.OneToOne;
import javax.persistence.OneToOne;



@Embeddable
public class Address {
	@Column(name="Line", length=50, nullable=false)
	private String line;
	
	@Column(name="City", length=50, nullable=false)
	private String city;
	
	@Column(name="State", length=50, nullable=false)
	private String state;
	
	@Column(name="Country", length=50, nullable=false)
	private String country;
	
	@Column(name="Pin_Code", length=6, nullable=false)
	private String pinCode;
	
	/*@OneToOne
	Maid maid1;
	
	@OneToOne
	Booking booking1;
	
	@OneToOne
	User user1;*/

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Address(String line, String city, String state, String country, String pinCode) {
		super();
		this.line = line;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public Address() {
		//super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	

}
