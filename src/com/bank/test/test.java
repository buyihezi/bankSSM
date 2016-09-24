package com.bank.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.bank.bll.UserMapperBLL;
import com.bank.model.UserInfo;

public class test {


	@Test
	public void Mytest() {
		UserMapperBLL userMBLL = new UserMapperBLL();
		
		List<UserInfo> u = userMBLL.getAllUsers();
		for (UserInfo item : u) {
			System.out.println(item.getUsername());
		}
	}


}
