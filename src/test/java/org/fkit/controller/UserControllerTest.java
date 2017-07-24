package org.fkit.controller;

import static org.junit.Assert.*;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import tapisTest.test1;

public class UserControllerTest extends test1{
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Test
	public void testLogin() {
		User user = userService.login("1", "234");
		if (user!=null){
			System.out.println("登陆成功");
		}else{
			System.out.println("登录失败");
		}
	}

	@Test
	public void testAddUser() {
		/*userService.addUser(user);
		if (user!=null){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}*/
	}

	@Test
	public void testUpdatepsaaword() {
		/*userService.updatePassword(user);
		if (user!=null){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}*/		
	}

	@Test
	public void testFind() {
		User user=userService.forgetpwd("loginname", "email");
		System.out.println("1");
		if(user!=null){
			System.out.println("成功找回");
		}else{
			System.out.println("找回失败");
		}
	}

}
