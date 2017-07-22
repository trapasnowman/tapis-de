package org.fkit.domain;

/**
 * id INT (11) PRIMARY KEY AUTO_INCREMENT,
loginname VARCHAR (20),
good_sn VARCHAR (100),
count INT(10),
price DECIMAL (10),
sum_price FLOAT(8)
);
 * */

public class Cart {

	private Integer id;			// id
	private String loginname;	// 用户名
	private Integer good_sn;	// 商品编号
	private Integer count;	// 数量
	private Integer price;		// 单价
	private Integer sum_price;		// 总价
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
	public Integer getGood_sn() {
		return good_sn;
	}
	public void setGood_sn(Integer good_sn) {
		this.good_sn = good_sn;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getSum_price() {
		return sum_price;
	}
	public void setSum_price(Integer sum_price) {
		this.sum_price = sum_price;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", loginname=" + loginname + ", good_sn="
				+ good_sn + ", count=" + count + ", price=" + price
				+ ",sum_price=" + sum_price +"]";
	}
}
