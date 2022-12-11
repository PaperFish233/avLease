package com.avLease.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avLease.dao.UserMapper;
import com.avLease.pojo.User;

@Repository
public class UserDao implements UserMapper{

	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(UserMapper.class).findAllUsers();
	}


	@Override
	public User findUserById(String account) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(UserMapper.class).findUserById(account);
	}


	@Override
	public User addUser(String account, String name, String password, int authority) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(UserMapper.class).addUser(account,name,password,authority);
	}


	@Override
	public User delUserById(int no) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(UserMapper.class).delUserById(no);
	}

	@Override
	public User upUserById(String account, String name, String password, int authority) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(UserMapper.class).upUserById(account,name,password,authority);
	}

	@Override
	public User loginUser(String account, String password) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(UserMapper.class).loginUser(account,password);
	}
	
	@Override
	public User register(String account, String name, String password) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(UserMapper.class).register(account,name,password);
	}
}
