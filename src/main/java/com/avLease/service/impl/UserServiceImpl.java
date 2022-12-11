package com.avLease.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avLease.dao.UserMapper;
import com.avLease.pojo.User;
import com.avLease.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userDao;
	
	
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.findAllUsers();
	}


	@Override
	public User findUserById(String account) {
		// TODO Auto-generated method stub
		return userDao.findUserById(account);
	}


	@Override
	public User addUser(String account, String name, String password, int authority) {
		// TODO Auto-generated method stub
		return userDao.addUser(account,name,password,authority);
	}


	@Override
	public User delUserById(int no) {
		// TODO Auto-generated method stub
		return userDao.delUserById(no);
	}


	@Override
	public User upUserById(String account, String name, String password, int authority) {
		// TODO Auto-generated method stub
		return userDao.upUserById(account,name,password,authority);
	}


	@Override
	public User loginUser(String account, String password) {
		// TODO Auto-generated method stub
		return userDao.loginUser(account,password);
	}
	
	
	@Override
	public User register(String account, String name, String password) {
		// TODO Auto-generated method stub
		return userDao.register(account,name,password);
	}

}
