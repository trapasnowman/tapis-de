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
		@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.Mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),		
		@Result(column = "count", property = "count"),@Result(column = "good_id", property = "good_id")})
	List<Cart> findAll();

    //通过good_id寻找商品
   @Select("select * from cart where good_id=#{good_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),				
			@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id") })
   Cart findWithGood_id(@Param("good_id") int good_id);
   
    //加入购物车
    @Insert("insert into cart(good_id,count) values(#{good_id},#{count})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveCart(Cart cart);

    //增加商品
    @Update("update cart set count=count+1 where good_id=#{good_id}")
	void addCart(Cart cart);

    
    //减少购物车商品数量
    @Update("update cart set count=count-1 where good_id=#{good_id}")
	void reduceCart(Cart cart);
    
    //增加购物车商品数量
    @Update("update cart set count=count+1 where good_id#{good_id}")
	void increaseCart(Cart cart);
    
    //删除商品
    @Delete("delete from cart where good_id=#{good_id}")
	void removeCart(Cart cart);
    
    //清空购物车
    @Delete("delete from cart ")
	void clearCart();

}
