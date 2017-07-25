package org.fkit.domain;

public class Collect{

	/**
	 * 
	 */
	
	private int id;
	private String name;
	private Double price;
	private String picture;
	private String loginname;
	private int good_id;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public int getGood_id() {
		return good_id;
	}

	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}
	@Override
	public String toString() {
		return "Collect [id=" + id + ",name=" + name + ", price=" + price + ", picture=" + picture + ",loginname=" + loginname + ",good_id=" + good_id + "]";
	}

}