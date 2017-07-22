package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.User;
import org.fkit.mapperprovider.MapperProvider;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from user where loginname = #{loginname} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	// 动态修改用户
			@SelectProvider(type=MapperProvider.class,method="updateUser")
			void update(User user);
	// 动态插入用户
			@SelectProvider(type=MapperProvider.class,method="insertUser")
			void save(User user);
			
	/*
	* 修改密码
	 */
	@Update("update user set password=#{password} where loginname=#{loginname}")
	void updatePassword(User user);	
}

