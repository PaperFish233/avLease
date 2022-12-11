package com.avLease.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avLease.dao.MessageMapper;
import com.avLease.pojo.Message;

@Repository
public class MessageDao implements MessageMapper {
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Message> findAllMessages() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(MessageMapper.class).findAllMessages();
	}

	@Override
	public List<Message> findMessageById(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(MessageMapper.class).findMessageById(name);
	}

	@Override
	public Message addMessage(String name, String content, String time) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(MessageMapper.class).addMessage(name,content,time);
	}

	@Override
	public Message delMessageById(int no) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(MessageMapper.class).delMessageById(no);
	}

	@Override
	public Message upMessageById(int no, String name, String content, String time) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(MessageMapper.class).upMessageById(no,name,content,time);
	}

}
