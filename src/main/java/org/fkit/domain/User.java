package org.fkit.domain;

import java.io.Serializable;

/**
 * CREATE TABLE user(
id INT PRIMARY KEY AUTO_INCREMENT,      #id
loginname VARCHAR(20) UNIQUE,		#登录名
password VARCHAR(20),			#密码
email VARCHAR(18),			#邮箱
phone VARCHAR(18),			#电话
address VARCHAR(255)			#地址
);
 * */
public class User implements Serializable{

	private Integer id;			// id
	private String loginname;	// 登录名
	private String password;	// 密码
	private String email;	// 邮箱
	private String phone;		// 电话
	private String address;		// 地址
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", loginname=" + loginname + ", password="
				+ password + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	
	
}
