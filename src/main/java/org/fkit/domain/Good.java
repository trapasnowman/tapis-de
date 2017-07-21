package org.fkit.domain;

import java.io.Serializable;

/**
 * id INT (11) PRIMARY KEY AUTO_INCREMENT,
good_sn VARCHAR (100),
good_name VARCHAR (100),
material VARCHAR (255),
picture VARCHAR (255),
price DECIMAL (10),
category_sn VARCHAR (20),
picturea VARCHAR (255),
pictureb VARCHAR (255),
picturec VARCHAR (255),
details VARCHAR (255),
packing VARCHAR (255)
);
 * */
public class Good implements Serializable{
	
	private Integer id;			// id
	private String good_sn;	// 商品编号
	private String good_name;	// 商品名
	private String material;	// 材料
	private String picture;		// 图片
	private String price;		// 价格
	private String categorysn;		// 种类编号
	private String picturea;		// 图片a
	private String pictureb;		// 图片b
	private String picturec;		// 图片c
	private String details;		// 表述
	private String packing;		// 包装
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGood_sn() {
		return good_sn;
	}
	public void setGood_sn(String good_sn) {
		this.good_sn = good_sn;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategorysn() {
		return categorysn;
	}
	public void setCategorysn(String categorysn) {
		this.categorysn = categorysn;
	}
	public String getPicturea() {
		return picturea;
	}
	public void setPicturea(String picturea) {
		this.picturea = picturea;
	}
	public String getPictureb() {
		return pictureb;
	}
	public void setPictureb(String pictureb) {
		this.pictureb = pictureb;
	}
	public String getPicturec() {
		return picturec;
	}
	public void setPicturec(String picturec) {
		this.picturec = picturec;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getPacking() {
		return packing;
	}
	public void setPacking(String packing) {
		this.packing = packing;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", good_sn=" + good_sn + ", good_name="
				+ good_name + ", material=" + material + ", picture=" + picture
				+ ", price=" + price +", categorysn=" + categorysn +", picturea=" 
				+ picturea +", pictureb=" + pictureb + ", picturec=" + picturec +
				",details=" + details +",packing=" + packing +"]";
	}
}
