package com.bank.idal;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bank.model.UserInfo;

public interface IUserMapper {
	// ����ָ��id��ѯ
		// ʹ��@Selectע��ָ��getUserInfo����Ҫִ�е�SQL
		@Select("select * from usertbl where id=#{id}")
		public UserInfo getUserInfo(int id);

		// ����û�
		// ʹ��@Insertע��ָ��addUser����Ҫִ�е�SQL
		@Insert("insert into usertbl(username,password) values(#{username},#{password})")
		public int addUser(UserInfo u);

		// ɾ���û�
		 //ʹ��@Deleteע��ָ��delUser����Ҫִ�е�SQL
		@Delete("delete from usertbl where id=#{id}")
		public int delUser(int id);

		// �����û�
		 //ʹ��@Updateע��ָ��UpdateUser����Ҫִ�е�SQL
		@Update("update usertbl set name=#{username},age=#{password} where id=#{id}")
		public int UpdateUser(UserInfo u);

		// ��ѯȫ���û�
		//ʹ��@Selectע��ָ��getAllUsers����Ҫִ�е�SQL
		@Select("select * from usertbl")
		public List<UserInfo> getAllUsers();
}
