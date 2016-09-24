package com.bank.bll;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.idal.IUserDAL;
import com.bank.model.UserInfo;

public class UserMapperBLL {
	// ��������
	ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	IUserDAL dal = (IUserDAL) ac.getBean("userMapperDAL");

	// װ��
	public UserInfo getUserInfo(int id) {
		return dal.getUserInfo(id);
	}

	// ����û�
	public boolean addUser(UserInfo u) {
		return dal.addUser(u);
	}

	// ɾ���û�
	public boolean delUser(int id) {
		return dal.delUser(id);
	}

	// �����û�
	public boolean UpdateUser(UserInfo u) {
		return dal.UpdateUser(u);
	}

	// ��ѯȫ���û�
	public List<UserInfo> getAllUsers() {
		return dal.getAllUsers();
	}
}
