package org.fkit.service;

import java.util.List;

import org.fkit.domain.Good;

/**
 * Book服务层接口
 * */
public interface GoodService {
	
	/**
	 * 查找所有鲜花
	 * @return fresh对象集合
	 * */
	List<Good> getAllfresh();
	
	/**
	 * 查找所有干花
	 * @return dried对象集合
	 * */
	List<Good> getAlldried();
	
	/**
	 * 查找所有美食
	 * @return food对象集合
	 * */
	List<Good> getAllfood();
	
	/**
	 * 查找选择商品详情
	 * @return Good选择详情对象集合
	 */
	 Good getGoodDetail(Integer good_sn);

}		
