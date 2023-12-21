package com.Anudip.DomesticHelpManagementSystem.entity;

import java.util.List;

import javax.management.relation.Role;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("MAID")
public class Maid extends User {
	
	private String name;
	
	@Column(name= "Gender", nullable=false, length=7)
	private String gender;
  	
	@Column(name= "Age", nullable=false, length=2)
	private String age;
	
	@Column(name= "Location", nullable=false, length=30)
	private String location;
	
	@Column(name= "Working_Time", nullable=false, length=10)
	private String workingTime;
	
	@Column(name= "Experience", nullable=false, length=2)
	private int experienceYears;
	
	@Column(name= "Salary_Expectation", nullable=false, length=7)
	private double expectedSalary;
	
	@Column(name= "Native_Place", nullable=false, length=30)
	private String nativePlace;
	
	@Column(name= "Preferred_City", nullable=false, length=30)
	private String preferredCity;
	
	@Column(name= "Marrital_Status", nullable=false, length=10)
	private String maritalStatus;
	
	@Column(name= "Religion", nullable=false, length=10)
	private String religion;
	
	@Column(name= "Education", nullable=false, length=30)
	private String education;
	
	@Column(name= "Languages", nullable=false, length=50)
	private String languages;
	
	@Column(name= "Vaccination", nullable=false, length=30)
	private String vaccination;
	
	@Column(name="Pet_Friendly", nullable=false, length=3)
	private boolean petFriendly;
	
	//@Enumerated(EnumType.STRING)
	@Column(name= "Availability", nullable=false, length=10)
	private String availability;//FullTime, PartTime
	
	@Column(name="Skills", nullable=false)
	private String skills;
		
	@Column(name= "Hourly_Rate", nullable=false, length=7)
	private double hourlyRate;
	
	@Embedded
	Address address;
	
	@OneToMany(mappedBy = "maid")
	private List<Rating> ratings;
	
	@OneToMany(mappedBy = "maid")
	private List<Booking> bookings;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public double getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getPreferredCity() {
		return preferredCity;
	}

	public void setPreferredCity(String preferredCity) {
		this.preferredCity = preferredCity;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getVaccination() {
		return vaccination;
	}

	public void setVaccination(String vaccination) {
		this.vaccination = vaccination;
	}

	public boolean isPetFriendly() {
		return petFriendly;
	}

	public void setPetFriendly(boolean petFriendly) {
		this.petFriendly = petFriendly;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	
	public Maid(String fname, String mname, String lname, String email, String phoneNumber, Address address,
			String password, com.Anudip.DomesticHelpManagementSystem.entity.Role role, String name, String gender,
			String age, String location, String workingTime, int experienceYears, double expectedSalary,
			String nativePlace, String preferredCity, String maritalStatus, String religion, String education,
			String languages, String vaccination, boolean petFriendly, String availability, String skills,
			double hourlyRate, Address address2, List<Rating> ratings, List<Booking> bookings) {
		super(fname, mname, lname, email, phoneNumber, address, password, role);
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.location = location;
		this.workingTime = workingTime;
		this.experienceYears = experienceYears;
		this.expectedSalary = expectedSalary;
		this.nativePlace = nativePlace;
		this.preferredCity = preferredCity;
		this.maritalStatus = maritalStatus;
		this.religion = religion;
		this.education = education;
		this.languages = languages;
		this.vaccination = vaccination;
		this.petFriendly = petFriendly;
		this.availability = availability;
		this.skills = skills;
		this.hourlyRate = hourlyRate;
		address = address2;
		this.ratings = ratings;
		this.bookings = bookings;
	}

	public Maid() {
		super();
		// TODO Auto-generated constructor stub
	}

	  
	
	}
	
	
	
	
	



