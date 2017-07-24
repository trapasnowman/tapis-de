package org.fkit.domain;

import java.io.Serializable;

import java.util.List;

/**
 * id INT (11) PRIMARY KEY AUTO_INCREMENT,
loginname VARCHAR (20),
good_sn VARCHAR (100),
count INT(10),
price DECIMAL (10),
sum_price FLOAT(8)
);
 * */

public class Cart implements Serializable{
	 public List<Good> getGood(){
	    	return good;
	    }
	    public void setGood(List<Good> good){
	    	this.good=good;
	    } 

	private Integer id;			// id
	private List<Good> good;
	private String loginname;	// 用户名
	private Integer good_id;	// 商品id
	private Integer count;	// 数量
	private Integer good_price;		// 单价
	private Integer sum_price;		// 总价
	private String good_picture;		// 总价
	private String good_good_name;		// 总价
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getSum_price() {
		return sum_price;
	}
	public void setSum_price(Integer sum_price) {
		this.sum_price = sum_price;
	}
	public String getGood_picture() {
		return good_picture;
	}
	public void setGood_picture(String good_picture) {
		this.good_picture = good_picture;
	}
	public String getGood_good_name() {
		return good_good_name;
	}
	public void setgGood_good_name(String good_good_name) {
		this.good_good_name = good_good_name;
	}
	public Integer getGood_id() {
		return good_id;
	}
	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}
	public Integer getGood_price() {
		return good_price;
	}
	public void setGood_price(Integer good_price) {
		this.good_price = good_price;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", good=" + good + ",loginname=" + loginname + ", good_id="
				+ good_id + ", count=" + count + ", good_price=" + good_price
				+ ",sum_price=" + sum_price +", good_picture=" + good_picture
				+ ", good_good_name=" + good_good_name+ "]";
	}
}
