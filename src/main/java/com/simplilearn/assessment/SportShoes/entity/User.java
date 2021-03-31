package com.simplilearn.assessment.SportShoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long ID;
	
	@Column(name="user_id")
	private String UserID;
	
	@Column(name="firstname")
	private String FirstName;
	
	@Column(name="lastname")
	private String LastName;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="contact")
	private String Contact;

	public User() {}
	
	public User(String userID, String firstName, String lastName, String email, String contact) {
		super();
		UserID = userID;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Contact = contact;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", UserID=" + UserID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Email=" + Email + ", Contact=" + Contact + "]\n";
	}
	
}
