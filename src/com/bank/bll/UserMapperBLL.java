package com.bank.bll;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.idal.IUserDAL;
import com.bank.model.UserInfo;

public class UserMapperBLL {
	// 创建容器
	ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	IUserDAL dal = (IUserDAL) ac.getBean("userMapperDAL");

	// 装配
	public UserInfo getUserInfo(int id) {
		return dal.getUserInfo(id);
	}

	// 添加用户
	public boolean addUser(UserInfo u) {
		return dal.addUser(u);
	}

	// 删除用户
	public boolean delUser(int id) {
		return dal.delUser(id);
	}

	// 更新用户
	public boolean UpdateUser(UserInfo u) {
		return dal.UpdateUser(u);
	}

	// 查询全部用户
	public List<UserInfo> getAllUsers() {
		return dal.getAllUsers();
	}
}
