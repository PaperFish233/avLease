package com.avLease.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.avLease.pojo.User;


public interface UserMapper {
	
	public List<User> findAllUsers();
	
	public User findUserById(@Param("account") String account);
	
	public User addUser(@Param("account") String account,@Param("name") String name,@Param("password") String password,@Param("authority") int authority);

	public User delUserById(@Param("no") int no);
	
	public User upUserById(@Param("account") String account,@Param("name") String name,@Param("password") String password,@Param("authority") int authority);

	public User loginUser(@Param("account") String account,@Param("password") String password);
	
	public User register(@Param("account") String account,@Param("name") String name,@Param("password") String password);
}
