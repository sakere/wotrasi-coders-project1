package com.mapping;

import javax.persistence.*;

@Entity
@Table(name = "tbllogindetail")
public class Users {
	
	@Id
	@GeneratedValue
	@Column(name = "flduserid")
	private int id;
	@Column(name = "fldusername")
	private String username;
	@Column(name = "fldpassword")
	private String password;
	@Column(name = "fldemail")
	private String email;
	@Column(name = "fldphonenumber")
	private String phonenumber;
	@Column(name = "fldfirstname")
	private String firstname;
	@Column(name = "fldlastname")
	private String lastname;
	@Column(name = "fldtype")
	private int type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
