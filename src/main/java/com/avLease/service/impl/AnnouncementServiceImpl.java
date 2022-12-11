package com.avLease.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avLease.dao.AnnouncementMapper;
import com.avLease.pojo.Announcement;
import com.avLease.service.AnnouncementService;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
	
	@Autowired
	private AnnouncementMapper announcementDao;

	@Override
	public List<Announcement> findAllAnnouncements() {
		// TODO Auto-generated method stub
		return announcementDao.findAllAnnouncements();
	}

	@Override
	public List<Announcement> findAnnouncementById(String name) {
		// TODO Auto-generated method stub
		return announcementDao.findAnnouncementById(name);
	}

	@Override
	public Announcement addAnnouncement(String name, String content, String time) {
		// TODO Auto-generated method stub
		return announcementDao.addAnnouncement(name, content, time);
	}

	@Override
	public Announcement delAnnouncementById(int no) {
		// TODO Auto-generated method stub
		return announcementDao.delAnnouncementById(no);
	}

	@Override
	public Announcement upAnnouncementById(int no, String name, String content, String time) {
		// TODO Auto-generated method stub
		return announcementDao.upAnnouncementById(no,name,content,time);
	}

}
