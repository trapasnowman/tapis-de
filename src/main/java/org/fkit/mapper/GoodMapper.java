package org.fkit.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Good;

/**
 * BookMapper接口
 * */
public interface GoodMapper {

	/**
	 * find all goods
	 * @return goods objects together
	 * */
	@Select(" select * from good ")
	List<Good> findAll();
	
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
	
	/**
	 *将good信息传至cart 
	 */
	@Select("select * from good where id=#{id}")
	Good findWithId(@Param("id") Integer id);
	
	@Select("select * from good where id=#{id}")
    @Results({@Result(id = true,column="id",property="id"),@Result(column="id",property="id"),
    @Result(column="good_name",property="good_name"),@Result(column="price",property="price"),
    @Result(column="picture",property="picture"),@Result(column="count",property="count")})
    List<Good> selectByGoodId(int id);
	
	
}
