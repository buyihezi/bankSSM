package com.bank.idal;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bank.model.UserInfo;

public interface IUserMapper {
	// 根据指定id查询
		// 使用@Select注解指明getUserInfo方法要执行的SQL
		@Select("select * from usertbl where id=#{id}")
		public UserInfo getUserInfo(int id);

		// 添加用户
		// 使用@Insert注解指明addUser方法要执行的SQL
		@Insert("insert into usertbl(username,password) values(#{username},#{password})")
		public int addUser(UserInfo u);

		// 删除用户
		 //使用@Delete注解指明delUser方法要执行的SQL
		@Delete("delete from usertbl where id=#{id}")
		public int delUser(int id);

		// 更新用户
		 //使用@Update注解指明UpdateUser方法要执行的SQL
		@Update("update usertbl set name=#{username},age=#{password} where id=#{id}")
		public int UpdateUser(UserInfo u);

		// 查询全部用户
		//使用@Select注解指明getAllUsers方法要执行的SQL
		@Select("select * from usertbl")
		public List<UserInfo> getAllUsers();
}
