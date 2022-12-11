package com.avLease.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.avLease.pojo.Message;


public interface MessageMapper {
	
	public List<Message> findAllMessages();
	
	public List<Message> findMessageById(@Param("name") String name);
	
	public Message addMessage(@Param("name") String name,@Param("content") String content,@Param("time") String time);

	public Message delMessageById(@Param("no") int no);
	
	public Message upMessageById(@Param("no") int no,@Param("name") String name,@Param("content") String content,@Param("time") String time);
}
