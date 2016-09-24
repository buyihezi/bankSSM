package com.bank.dal;



import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bank.idal.IUserDAL;
import com.bank.model.UserInfo;
import com.bank.mybatisutil.MyBatisUtil;

public class UserDAL implements IUserDAL {
 
	@Override
	public UserInfo getUserInfo(int id) {
		// TODO Auto-generated method stub
		
		SqlSession session = MyBatisUtil.getsqlSession(true);
		/**
		 * 映射sql的标识字符串， com.bank.mapper.userMapper.xml文件中mapper标签的namespace属性的值，
		 * getUserById是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.bank.mapper.userMapper.getUserById";// 映射sql的标识字符串
		// 执行查询返回一个唯一user对象的sql
		UserInfo user = session.selectOne(statement, id);
		// 使用SqlSession执行完SQL之后需要关闭SqlSession
		session.close();
		return user;
	}

	@Override
	public boolean addUser(UserInfo u) {
		// TODO Auto-generated method stub
		// 调用我的SqlSession
		SqlSession session = MyBatisUtil.getsqlSession(true);
		String statement = "com.bank.mapper.userMapper.addUser";// 映射sql的标识字符串
		int count = session.insert(statement, u);
		if (count > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean delUser(int id) {
		// TODO Auto-generated method stub
		// 调用我的SqlSession
		SqlSession session = MyBatisUtil.getsqlSession(true);
		String statement = "com.bank.mapper.userMapper.deleteUser";// 映射sql的标识字符串
		int count = session.delete(statement, id);
		if (count > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean UpdateUser(UserInfo u) {
		// TODO Auto-generated method stub
		// 调用我的SqlSession
		SqlSession session = MyBatisUtil.getsqlSession(true);
		String statement = "com.bank.mapper.userMapper.updateUser";// 映射sql的标识字符串
		int count = session.update(statement, u);
		if (count > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<UserInfo> getAllUsers() {
		// TODO Auto-generated method stub
		// 调用我的SqlSession
		SqlSession session = MyBatisUtil.getsqlSession(true);
		String statement = "com.bank.mapper.userMapper.getAllUsers";// 映射sql的标识字符串
		List<UserInfo> userlist=session.selectList(statement);
		return userlist;
	}
}
