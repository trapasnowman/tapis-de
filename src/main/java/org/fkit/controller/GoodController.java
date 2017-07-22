package org.fkit.controller;

import java.util.List;

import org.fkit.domain.Good;
import org.fkit.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理图书请求控制器
 * */
@Controller
public class GoodController {
	
	/**
	 * 自动注入GoodService
	 * */
	@Autowired
	@Qualifier("goodService")
	private GoodService goodService;

	/**		
	 * 处理/fresh请求
	 * */
	@RequestMapping(value="/fresh")
	 public String fresh(Model model){
		// 获得所有鲜花集合
		List<Good> good_list = goodService.getAllfresh();
		// 将鲜花集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到fresh页面
		return "fresh";
	}
	
	/**		
	 * 处理/dried请求
	 * */
	@RequestMapping(value="/dried")
	 public String dried(Model model){
		// 获得所有干花集合
		List<Good> good_list = goodService.getAlldried();
		// 将干花集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到dried页面
		return "dried";
	}
	
	/**		
	 * 处理/food请求
	 * */
	@RequestMapping(value="/food")
	 public String food(Model model){
		// 获得所有美食集合
		List<Good> good_list = goodService.getAllfood();
		// 将美食集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到food页面
		return "food";
	}
	
	/**
	 * 处理/detail
	 */
	@RequestMapping(value="/detail_good")
	public ModelAndView detail(@RequestParam("good_sn") Integer good_sn, Model model,ModelAndView mv){
		Good good = goodService.getGoodDetail(good_sn);
		mv.addObject("good",good);
		mv.setViewName("forward:/detail");
		return mv;	
	}
}
