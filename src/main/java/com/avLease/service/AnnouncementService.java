package com.avLease.service;

import java.util.List;

import com.avLease.pojo.Announcement;

public interface AnnouncementService {
	
	public List<Announcement> findAllAnnouncements();
	
	public List<Announcement> findAnnouncementById(String name);

	public Announcement addAnnouncement(String name, String content, String time);
	
	public Announcement delAnnouncementById(int no);
	
	public Announcement upAnnouncementById(int no, String name, String content, String time);
}
