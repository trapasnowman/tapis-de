package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setView(new RedirectView("./index"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.setViewName("loginForm");
			mv.addObject("message", "登录名或密码错误，请重新输入!");
		}
		return mv;
	}
	/**
	 * 处理添加请求
	 * @param User user 要添加用户的对象
	 * @param ModelAndView mv
	 **/
	@RequestMapping(value = "/registe")

	public ModelAndView addUser(
			@ModelAttribute User user,
			ModelAndView mv){
				userService.addUser(user);
				//设置客户端跳转到查询页面
			mv.setViewName("loginForm");
				return mv;
			}
	
	/**
	 * 处理updatepassword请求
	 * @param username
	 * @param password
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/updatepassword")
	 public String updatepsaaword(@RequestParam("loginname") String loginname,
			HttpServletRequest request,
			Model model,
			@ModelAttribute User user){
				userService.updatePassword(user);
				return "loginForm";
			}

	
	
}
