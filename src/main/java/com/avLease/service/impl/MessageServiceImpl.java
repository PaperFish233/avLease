package com.avLease.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avLease.dao.MessageMapper;
import com.avLease.pojo.Message;
import com.avLease.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageMapper messageDao;

	@Override
	public List<Message> findAllMessages() {
		// TODO Auto-generated method stub
		return messageDao.findAllMessages();
	}

	@Override
	public List<Message> findMessageById(String name) {
		// TODO Auto-generated method stub
		return messageDao.findMessageById(name);
	}

	@Override
	public Message addMessage(String name, String content, String time) {
		// TODO Auto-generated method stub
		return messageDao.addMessage(name, content, time);
	}

	@Override
	public Message delMessageById(int no) {
		// TODO Auto-generated method stub
		return messageDao.delMessageById(no);
	}

	@Override
	public Message upMessageById(int no, String name, String content, String time) {
		// TODO Auto-generated method stub
		return messageDao.upMessageById(no,name,content,time);
	}

}
