package com.avLease.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avLease.pojo.Message;
import com.avLease.service.MessageService;

@Controller
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/allMessages")
	public String allMessages(Model model)
	{
		//调用service层返回list
		List<Message> messages = messageService.findAllMessages();
		//在模型中添加数据
		model.addAttribute("messages",messages);
		//返回视图名，交给视图解析器处理
		return "admin_allMessage";
	}
	
	@RequestMapping("/findMessageById")
	public String findMessageById(Model model,@RequestParam("name") String name)
	{
		List<Message> message = messageService.findMessageById(name);
		List<Message> list = new ArrayList<Message>();
		list.addAll(message);
		model.addAttribute("messages",list);
		return "admin_allMessage";
	}
	
	@RequestMapping("/addMessage")
	public String addMessage(Model model,@RequestParam("name") String name,@RequestParam("content") String content,@RequestParam("time") String time)
	{
		Message message = messageService.addMessage(name,content,time);
		List<Message> list = new ArrayList<Message>();
		list.add(message);
		model.addAttribute("messages",list);
		return "redirect:/allMessages";
	}
	
	@RequestMapping("/delMessageById/{no}")
	public String delMessageById(Model model,@PathVariable("no") int no)
	{
		Message message = messageService.delMessageById(no);
		List<Message> list = new ArrayList<Message>();
		list.add(message);
		model.addAttribute("messages",list);
		return "redirect:/allMessages";
	}
	
	@RequestMapping("/upMessageById")
	public String upMessageById(Model model,@RequestParam("no") int no,@RequestParam("name") String name,@RequestParam("content") String content,@RequestParam("time") String time)
	{
		Message message = messageService.upMessageById(no,name,content,time);
		List<Message> list = new ArrayList<Message>();
		list.add(message);
		model.addAttribute("messages",list);
		return "redirect:/allMessages";
	}
	
	
	
	
	@RequestMapping("/allMessagesUser")
	public String allMessagesUser(Model model)
	{
		//调用service层返回list
		List<Message> messages = messageService.findAllMessages();
		//在模型中添加数据
		model.addAttribute("messages",messages);
		//返回视图名，交给视图解析器处理
		return "user_allMessage";
	}
	
	@RequestMapping("/findMessageByIdUser")
	public String findMessageByIdUser(Model model,@RequestParam("name") String name)
	{
		List<Message> message = messageService.findMessageById(name);
		List<Message> list = new ArrayList<Message>();
		list.addAll(message);
		model.addAttribute("messages",list);
		return "user_allMessage";
	}
	
	@RequestMapping("/addMessageUser")
	public String addMessageUser(Model model,@RequestParam("name") String name,@RequestParam("content") String content,@RequestParam("time") String time)
	{
		Message message = messageService.addMessage(name,content,time);
		List<Message> list = new ArrayList<Message>();
		list.add(message);
		model.addAttribute("messages",list);
		return "redirect:/allMessagesUser";
	}

}
