package com.Anudip.DomesticHelpManagementSystem.entity;

//import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="user_type", discriminatorType=DiscriminatorType.STRING)
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="fname", nullable=false, length=50)
	private String fname;
	
	@Column(name="mname", length=50)
    private String mname;
	
	@Column(name="lname", nullable=true, length=50)
	private String lname;
	
	
	@Column(name="email", nullable=false, length=50, unique=true)
	private String email;
	
	@Column(name="PhoneNumber", nullable=false, length=10, unique=true)
	private String phoneNumber;
	
	@Embedded
	//@OneToOne(cascade=CascadeType.ALL)
	Address address;
	
	@Column(name="password", nullable=false, length=25)
	private String password;
	
	@Column(name="role", nullable=false, length=50)
	@Enumerated(EnumType.STRING)
	private Role role;//maid, client or admin

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	public User(String fname, String mname, String lname, String email, String phoneNumber, Address address,
			String password, Role role) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
