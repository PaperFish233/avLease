package com.avLease.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avLease.pojo.Announcement;
import com.avLease.service.AnnouncementService;

@Controller
public class AnnouncementController {
	
	@Autowired
	private AnnouncementService announcementService;
	
	@RequestMapping("/allAnnouncements")
	public String allAnnouncements(Model model)
	{
		//调用service层返回list
		List<Announcement> announcements = announcementService.findAllAnnouncements();
		//在模型中添加数据
		model.addAttribute("announcements",announcements);
		//返回视图名，交给视图解析器处理
		return "admin_allAnnouncement";
	}
	
	@RequestMapping("/findAnnouncementById")
	public String findAnnouncementById(Model model,@RequestParam("name") String name)
	{
		List<Announcement> announcement = announcementService.findAnnouncementById(name);
		List<Announcement> list = new ArrayList<Announcement>();
		list.addAll(announcement);
		model.addAttribute("announcements",list);
		return "admin_allAnnouncement";
	}
	
	@RequestMapping("/addAnnouncement")
	public String addAnnouncement(Model model,@RequestParam("name") String name,@RequestParam("content") String content,@RequestParam("time") String time)
	{
		Announcement announcement = announcementService.addAnnouncement(name,content,time);
		List<Announcement> list = new ArrayList<Announcement>();
		list.add(announcement);
		model.addAttribute("announcements",list);
		return "redirect:/allAnnouncements";
	}
	
	@RequestMapping("/delAnnouncementById/{no}")
	public String delAnnouncementById(Model model,@PathVariable("no") int no)
	{
		Announcement announcement = announcementService.delAnnouncementById(no);
		List<Announcement> list = new ArrayList<Announcement>();
		list.add(announcement);
		model.addAttribute("announcements",list);
		return "redirect:/allAnnouncements";
	}
	
	@RequestMapping("/upAnnouncementById")
	public String upAnnouncementById(Model model,@RequestParam("no") int no,@RequestParam("name") String name,@RequestParam("content") String content,@RequestParam("time") String time)
	{
		Announcement announcement = announcementService.upAnnouncementById(no,name,content,time);
		List<Announcement> list = new ArrayList<Announcement>();
		list.add(announcement);
		model.addAttribute("announcements",list);
		return "redirect:/allAnnouncements";
	}
	
	
	
	@RequestMapping("/allAnnouncementsUser")
	public String allAnnouncementsUser(Model model)
	{
		//调用service层返回list
		List<Announcement> announcements = announcementService.findAllAnnouncements();
		//在模型中添加数据
		model.addAttribute("announcements",announcements);
		//返回视图名，交给视图解析器处理
		return "user_allAnnouncement";
	}
	
	@RequestMapping("/findAnnouncementByIdUser")
	public String findAnnouncementByIdUser(Model model,@RequestParam("name") String name)
	{
		List<Announcement> announcement = announcementService.findAnnouncementById(name);
		List<Announcement> list = new ArrayList<Announcement>();
		list.addAll(announcement);
		model.addAttribute("announcements",list);
		return "user_allAnnouncement";
	}

}
