package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Good;

/**
 * BookMapper接口
 * */
public interface GoodMapper {
	
	/**
	 * 查询所有鲜花
	 * @return 鲜花对象集合
	 * */
	@Select(" select * from good where category_sn=010 ")
	List<Good> findAllfresh();

	/**
	 * 查询所有干花
	 * @return 干花对象集合
	 * */
	@Select(" select * from good where category_sn=020 ")
	List<Good> findAlldried();
	
	/**
	 * 查询所有美食
	 * @return 美食对象集合
	 * */
	@Select(" select * from good where category_sn=030 ")
	List<Good> findAllfood();
	
	/**
	 *根据good_sn查找物品详情
	 */
	@Select(" select * from good where good_sn = #{good_sn}" )
	Good findGoodDetail(Integer good_sn);
}
