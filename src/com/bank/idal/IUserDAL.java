package com.bank.idal;

import java.util.List;

import com.bank.model.UserInfo;

public interface IUserDAL {
	// 根据指定id查询
			public UserInfo getUserInfo(int id);

			// 添加用户
			public boolean addUser(UserInfo u);

			// 删除用户
			public boolean delUser(int id);

			// 更新用户
			public boolean UpdateUser(UserInfo u);

			// 查询全部用户
			public List<UserInfo> getAllUsers();
}
