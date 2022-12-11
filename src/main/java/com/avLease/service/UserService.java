package com.avLease.service;

import java.util.List;

import com.avLease.pojo.User;

public interface UserService {
	
	public List<User> findAllUsers();
	
	public User findUserById(String account);
	
	public User addUser(String account, String name, String password, int authority);
	
	public User delUserById(int no);
	
	public User upUserById(String account, String name, String password, int authority);
	
	public User loginUser(String account, String password);
	
	public User register(String account, String name, String password);
}
