package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bank.bll.UserBLL;
import com.bank.dal.UserMapper;




@Controller
@RequestMapping("/")   //����View�����Ŀ¼
public class HomeController
{
	UserBLL userBLL = new UserBLL();
	
	// ִ�еķ���action
	@RequestMapping("/index")  //�ύ��action
	public ModelAndView Index()
	{
		// ModelAndView�Ĳ��� index=index.jsp
		ModelAndView mv=new ModelAndView("index");
		
		String s="Spring MVC Hello World";
		mv.addObject("Home", s);
		return mv;
	}
	
	//��ȡ�û���Ϣ
	@RequestMapping("/getUserInfo")
	public ModelAndView getUserInfoById(){
		ModelAndView view = new ModelAndView("user");
		view.addObject("user", userBLL.getUserInfo(1));
		
		return view;
	}
	
	//��ȡȫ���û�
		@RequestMapping("/getUserList")
		public ModelAndView getALLUsers(){
			ModelAndView view=new ModelAndView("getallusers");
			UserMapper mapper=new UserMapper();
			view.addObject("userlist", mapper.getAllUsers());
			return view;
		}
	

}
