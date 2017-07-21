package org.fkit.mapperprovider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;
import org.fkit.domain.User;

public class MapperProvider {	
			// 动态查询总数量
			public String count(Map<String, Object> params){
				return new SQL(){
					{
						SELECT("count(*)");
						FROM("user");
						if(params.get("user") != null){
							User user = (User)params.get("user");
							if(user.getUsername() != null && !user.getUsername().equals("")){
								WHERE(" username LIKE CONCAT ('%',#{user.username},'%') ");
							}
						}
					}
				}.toString();
			}	
			
			// 动态插入
			public String insertUser(User user){
				
				return new SQL(){
					{
						INSERT_INTO("user");
						if(user.getLoginname() != null && !user.getLoginname().equals("")){
							VALUES("loginname", "#{loginname}");
						}
						if(user.getPassword() != null && !user.getPassword().equals("")){
							VALUES("password", "#{password}");
						}
						if(user.getUsername() != null && !user.getUsername().equals("")){
							VALUES("username", "#{username}");
						}
						if(user.getPhone() != null && !user.getPhone().equals("")){
							VALUES("phone", "#{phone}");
						}
						if(user.getAddress() != null && !user.getAddress().equals("")){
							VALUES("address", "#{address}");
						}
					}
				}.toString();
			}
			// 动态更新
				public String updateUser(User user){
					
					return new SQL(){
						{
							UPDATE("user");
							if(user.getLoginname() != null){
								SET(" loginname = #{loginname} ");
							}
							if(user.getPassword()!= null){
								SET(" password = #{password} ");
							}
							if(user.getUsername() != null){
								SET(" username = #{username} ");
							}
							if(user.getPhone() != null){
								SET(" phone = #{phone} ");
							}
							if(user.getAddress() != null){
								SET(" address = #{address} ");
							}
							
							WHERE(" id = #{id} ");
						}
					}.toString();
				}
}
