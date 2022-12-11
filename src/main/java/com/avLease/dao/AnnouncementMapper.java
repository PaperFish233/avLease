package com.avLease.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.avLease.pojo.Announcement;


public interface AnnouncementMapper {
	
	public List<Announcement> findAllAnnouncements();
	
	public List<Announcement> findAnnouncementById(@Param("name") String name);
	
	public Announcement addAnnouncement(@Param("name") String name,@Param("content") String content,@Param("time") String time);

	public Announcement delAnnouncementById(@Param("no") int no);
	
	public Announcement upAnnouncementById(@Param("no") int no,@Param("name") String name,@Param("content") String content,@Param("time") String time);
}
