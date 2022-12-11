package com.avLease.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avLease.pojo.User;
import com.avLease.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/allUsers")
	public String allUsers(Model model)
	{
		//调用service层返回list
		List<User> users = userService.findAllUsers();
		//在模型中添加数据
		model.addAttribute("users",users);
		//返回视图名，交给视图解析器处理
		return "admin_allUser";
	}
	
	@RequestMapping("/findUserById")
	public String findUserById(Model model,@RequestParam("account") String account)
	{
		User user = userService.findUserById(account);
		List<User> list = new ArrayList<User>();
		list.add(user);
		model.addAttribute("users",list);
		return "admin_allUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(Model model,@RequestParam("account") String account,@RequestParam("name") String name,@RequestParam("password") String password,@RequestParam("authority") int authority,HttpSession session)
	{
		
		User user1 = userService.findUserById(account);
		if (user1 != null) {
			
			session.setAttribute("errorMessage", 4);
			return "errorInfo"; // 逻辑视图名
			
		}else {		
			
		User user = userService.addUser(account,name,password,authority);
		List<User> list = new ArrayList<User>();
		list.add(user);
		model.addAttribute("users",list);
		return "redirect:/allUsers";
		
		}
		
	}
	
	@RequestMapping("/delUserById/{no}")
	public String delUserById(Model model,@PathVariable("no") int no)
	{
		User user = userService.delUserById(no);
		List<User> list = new ArrayList<User>();
		list.add(user);
		model.addAttribute("users",list);
		return "redirect:/allUsers";
	}
	
	@RequestMapping("/upUserById")
	public String upUserById(Model model,@RequestParam("account") String account,@RequestParam("name") String name,@RequestParam("password") String password,@RequestParam("authority") int authority)
	{
		User user = userService.upUserById(account,name,password,authority);
		List<User> list = new ArrayList<User>();
		list.add(user);
		model.addAttribute("users",list);
		return "redirect:/allUsers";
	}
	
	@RequestMapping("/loginUser")
	public String loginUser(Model model,@RequestParam("account") String account,@RequestParam("password") String password,HttpSession session)
	{
		User user = userService.loginUser(account,password);
		
		 // 判断用户是否登录成功
        if (user != null) {
            // 将登录用户名写入会话
            session.setAttribute("Uaccount", account);
            session.setAttribute("Uauthority", user.getAuthority());
            return "main";
        } else {
        	session.setAttribute("errorMessage", 1);
            // 跳转到前台登录页面
            return "errorInfo"; // 逻辑视图名
        }
    }

	@RequestMapping("/register")
	public String register(Model model,@RequestParam("account") String account,@RequestParam("name") String name,@RequestParam("password") String password,HttpSession session)
	{
		User user1 = userService.findUserById(account);
		if (user1 != null) {
			
			session.setAttribute("errorMessage", 3);
			return "errorInfo"; // 逻辑视图名
			
		}else {		
			
			session.setAttribute("errorMessage", 2);
			User user = userService.register(account,name,password);
			List<User> list = new ArrayList<User>();
			list.add(user);
			model.addAttribute("users",list);
			return "errorInfo";
		
		}
	}
	
}
