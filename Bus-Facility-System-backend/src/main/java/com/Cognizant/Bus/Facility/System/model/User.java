package com.Cognizant.Bus.Facility.System.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="dateofbirth")
	private String dateOfBirth;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="userType")
	private String userType;
	
	@Column(name="mobileNo")
	private String mobileNo;

	public User() {
		
	}

	public User(long id, String name, String password, String email, String dateOfBirth, String gender, String userType,
			 String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.userType = userType;
		this.mobileNo = mobileNo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
