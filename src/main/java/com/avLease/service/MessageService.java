package com.avLease.service;

import java.util.List;

import com.avLease.pojo.Message;

public interface MessageService {
	
	public List<Message> findAllMessages();
	
	public List<Message> findMessageById(String name);

	public Message addMessage(String name, String content, String time);
	
	public Message delMessageById(int no);
	
	public Message upMessageById(int no, String name, String content, String time);
}
