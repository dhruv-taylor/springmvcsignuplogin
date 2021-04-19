package com.springmvcsignuplogin.models;

public class User {
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private String mobile;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

//	public User(int id, String username, String password, String firstname, String lastname, String email,
//			String address, String mobile) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.email = email;
//		this.address = address;
//		this.mobile = mobile;
//	}

	public User(String username, String password, String firstname, String lastname, String email, String address,
			String mobile) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", phone=" + mobile + "]";
	}
}
