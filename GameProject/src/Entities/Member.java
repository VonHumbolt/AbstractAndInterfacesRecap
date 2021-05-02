package Entities;

import java.util.Date;

import Abstract.Entity;

public class Member implements Entity {
	private int id;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private String nationalIdentity;
	private Date bornYear;
	
	public Member(int id, String userName, String firstName, String lastName, String password, String nationalIdentity,
			Date bornYear) {
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.nationalIdentity = nationalIdentity;
		this.bornYear = bornYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public Date getBornYear() {
		return bornYear;
	}

	public void setBornYear(Date bornYear) {
		this.bornYear = bornYear;
	}
}
