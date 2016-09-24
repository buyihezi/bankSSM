package com.bank.mybatisutil;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bank.dal.UserDAL;

public class MyBatisUtil {

	// ����SqlSessionFactory���������ļ�
	public static SqlSessionFactory getSqlSessionFactory() {
		// MyBatis�������ļ�
		String resource = "MyBatis.xml";
		// ʹ�������������mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
		InputStream is = UserDAL.class.getClassLoader().getResourceAsStream(
				resource);
		// ����sqlSession�Ĺ���
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
				.build(is);
		return sessionFactory;
	}

	// ��ȡSqlSession
	public static SqlSession getsqlSession() {
		// ������ִ��ӳ���ļ���sql��sqlSession
		return getSqlSessionFactory().openSession();
	}

	
	/**
	 * ��ȡSqlSession�����ط���
	 * 
	 * @param isAutoCommit
	 *            true ��ʾ������SqlSession������ִ����SQL֮����Զ��ύ���� 
	 *            false ��ʾ������SqlSession������ִ����SQL֮�󲻻��Զ��ύ����
	 *            ����ʱ����Ҫ�����ֶ�����sqlSession.commit()�ύ����
	 * @return SqlSession
	 */
	public static SqlSession getsqlSession(boolean isAutoCommit) {
		// ������ִ��ӳ���ļ���sql��sqlSession
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}
