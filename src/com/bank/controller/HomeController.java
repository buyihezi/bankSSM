package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bank.bll.UserBLL;
import com.bank.dal.UserMapper;




@Controller
@RequestMapping("/")   //代表View下面根目录
public class HomeController
{
	UserBLL userBLL = new UserBLL();
	
	// 执行的方法action
	@RequestMapping("/index")  //提交的action
	public ModelAndView Index()
	{
		// ModelAndView的参数 index=index.jsp
		ModelAndView mv=new ModelAndView("index");
		
		String s="Spring MVC Hello World";
		mv.addObject("Home", s);
		return mv;
	}
	
	//获取用户信息
	@RequestMapping("/getUserInfo")
	public ModelAndView getUserInfoById(){
		ModelAndView view = new ModelAndView("user");
		view.addObject("user", userBLL.getUserInfo(1));
		
		return view;
	}
	
	//获取全部用户
		@RequestMapping("/getUserList")
		public ModelAndView getALLUsers(){
			ModelAndView view=new ModelAndView("getallusers");
			UserMapper mapper=new UserMapper();
			view.addObject("userlist", mapper.getAllUsers());
			return view;
		}
	

}
