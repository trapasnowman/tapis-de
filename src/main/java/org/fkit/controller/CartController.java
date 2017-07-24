package org.fkit.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.fkit.domain.Cart;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	
	@RequestMapping(value = "/cart")
	public String cart(Model model) {
		
		// 获得所有物品集合
		List<Cart> cart_list = cartService.getAll();
		// 将物品集合添加到model当中		
		model.addAttribute("cart_list", cart_list);
		// 跳转到cartForm页面
		return "cartForm";
	
	}
	
	@RequestMapping(value = "/save")
	public String save(HttpServletRequest request,Model model) {
		String good_id = request.getParameter("good_id");
		int good_id_ = Integer.parseInt(good_id);
		Cart cart=cartService.findCart(good_id_);
		if (cart == null) {
			cartService.saveCart(good_id_);
		}else {			
			cartService.addCart(good_id_);	
		}
		List<Cart> cart_list = cartService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cartForm页面
		return "cartForm";
	}
	
	//从购物车里减少数量
	@RequestMapping(value="/reduce")
	public String reduce(Model model,HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id_ = Integer.parseInt(good_id);
		cartService.reduceCart(good_id_);
		List<Cart> cart_list = cartService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cartForm页面
		return "cartForm";
	}

	//从购物车里增加数量
		@RequestMapping(value="/increase")
		public String increase(Model model,HttpServletRequest request){
			String good_id = request.getParameter("good_id");
			int good_id_ = Integer.parseInt(good_id);
			cartService.increaseCart(good_id_);
			List<Cart> cart_list = cartService.getAll();
			// 将物品集合添加到model当中
			model.addAttribute("cart_list", cart_list);
			// 跳转到cartForm页面
			return "cartForm";
		}

	//取消购物车的东西
	@RequestMapping(value="/remove")
	public String remove(Model model,HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id_ = Integer.parseInt(good_id);
		cartService.removeCart(good_id_);
		List<Cart> cart_list = cartService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cartForm页面
		return "cartForm";
	}
	
}
