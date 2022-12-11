package com.avLease.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avLease.dao.AnnouncementMapper;
import com.avLease.pojo.Announcement;

@Repository
public class AnnouncementDao implements AnnouncementMapper {
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Announcement> findAllAnnouncements() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AnnouncementMapper.class).findAllAnnouncements();
	}

	@Override
	public List<Announcement> findAnnouncementById(String name) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AnnouncementMapper.class).findAnnouncementById(name);
	}

	@Override
	public Announcement addAnnouncement(String name, String content, String time) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AnnouncementMapper.class).addAnnouncement(name,content,time);
	}

	@Override
	public Announcement delAnnouncementById(int no) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AnnouncementMapper.class).delAnnouncementById(no);
	}

	@Override
	public Announcement upAnnouncementById(int no, String name, String content, String time) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(AnnouncementMapper.class).upAnnouncementById(no,name,content,time);
	}

}
