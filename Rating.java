package com.Anudip.DomesticHelpManagementSystem.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="maid_id", nullable=false)
    private Maid maid;
    
    @ManyToOne
    @JoinColumn(name="client_id", nullable=false)
    private Client client;
    
    
    
    private Integer rating; // 1-5 scale
    
   /* @Temporal(TemporalType.DATE)
    private Date date;*/
      
    private String comments;

    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/*public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
*/
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Maid getMaid() {
		return maid;
	}

	public void setMaid(Maid maid) {
		this.maid = maid;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Rating(Long id, Integer rating, String comments, Maid maid, Client client) {
		super();
		this.id = id;
		this.rating = rating;
		
		this.comments = comments;
		this.maid = maid;
		this.client = client;
	}

	public Rating(Client client1, Maid maid1, int i, String string) {
		super();
		// TODO Auto-generated constructor stub
	}

   
   

}
