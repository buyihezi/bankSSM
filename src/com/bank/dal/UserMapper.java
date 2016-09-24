package com.bank.dal;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bank.idal.IUserDAL;
import com.bank.model.UserInfo;
import com.bank.mybatisutil.MyBatisUtil;

public class UserMapper implements IUserDAL {

	@Override
	public UserInfo getUserInfo(int id) {
		// TODO Auto-generated method stub
		
		SqlSession session = MyBatisUtil.getsqlSession(true);
		/**
		 * ӳ��sql�ı�ʶ�ַ����� com.bank.mapper.userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
		 * getUserById��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
		 */
		String statement = "com.bank.mapper.userMapperPro.getUserById";// ӳ��sql�ı�ʶ�ַ���
		// ִ�в�ѯ����һ��Ψһuser�����sql
		UserInfo user = session.selectOne(statement, id);
		// ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
		session.close();
		return user;
	}

	@Override
	public boolean addUser(UserInfo u) {
		// TODO Auto-generated method stub
		// �����ҵ�SqlSession
		SqlSession session = MyBatisUtil.getsqlSession(true);
		String statement = "com.bank.mapper.userMapperPro.addUser";// ӳ��sql�ı�ʶ�ַ���
		int count = session.insert(statement, u);
		if (count > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean delUser(int id) {
		// TODO Auto-generated method stub
		// �����ҵ�SqlSession
		SqlSession session = MyBatisUtil.getsqlSession(true);
		String statement = "com.bank.mapper.userMapperPro.deleteUser";// ӳ��sql�ı�ʶ�ַ���
		int count = session.delete(statement, id);
		if (count > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean UpdateUser(UserInfo u) {
		// TODO Auto-generated method stub
		// �����ҵ�SqlSession
		SqlSession session = MyBatisUtil.getsqlSession(true);
		String statement = "com.bank.mapper.userMapperPro.updateUser";// ӳ��sql�ı�ʶ�ַ���
		int count = session.update(statement, u);
		if (count > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<UserInfo> getAllUsers() {
		// TODO Auto-generated method stub
		// �����ҵ�SqlSession
		SqlSession session = MyBatisUtil.getsqlSession(true);
		String statement = "com.bank.mapper.userMapperPro.getAllUsers";// ӳ��sql�ı�ʶ�ַ���
		List<UserInfo> userlist=session.selectList(statement);
		return userlist;
	}

}
