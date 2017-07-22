package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Cart;

public interface CartMapper {
    
@Select("select * from cart")
@Results({ @Result(id = true, column = "id", property = "id"),
	@Result(column = "good_sn", property = "good", many = @Many(select = "org.fkit.Mapper.GoodMapper.selectByGoodGood_sn", fetchType = FetchType.LAZY)),		
	@Result(column = "count", property = "count"),@Result(column = "good_sn", property = "good_sn")})
List<Cart> findAll();

    //加入购物车
    @Insert("insert into shop(good_sn,count) values(#{good_sn},#{count})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveCart(Cart cart);
     //通过ID寻找商品
    @Select("select * from shop where good_sn=#{good_sn}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_sn", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGoodGood_sn", fetchType = FetchType.LAZY)),				
			@Result(column = "count", property = "count"), @Result(column = "good_sn", property = "good_sn") })
    Cart findWithId(@Param("good_sn") int good_sn);
    //增加商品数量
    @Update("update shop set count=count+1 where good_sn=#{good_sn}")
	void addCart(Cart cart);
    //清空购物车
    @Delete("delete from shop ")
	void clearCart();
    //减少购物车商品数量
    @Update("update shop set count=count-1 where good_sn=#{good_sn}")
	void reduceCart(Cart cart);
  //增加购物车商品数量
    @Update("update shop set count=count+1 where good_sn#{good_sn}")
	void increaseCart(Cart cart);
    //删除商品
    @Delete("delete from shop where good_sn=#{good_sn}")
	void removeCart(Cart cart);


}
