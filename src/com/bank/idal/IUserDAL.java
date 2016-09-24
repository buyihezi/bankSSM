package com.bank.idal;

import java.util.List;

import com.bank.model.UserInfo;

public interface IUserDAL {
	// ����ָ��id��ѯ
			public UserInfo getUserInfo(int id);

			// ����û�
			public boolean addUser(UserInfo u);

			// ɾ���û�
			public boolean delUser(int id);

			// �����û�
			public boolean UpdateUser(UserInfo u);

			// ��ѯȫ���û�
			public List<UserInfo> getAllUsers();
}
