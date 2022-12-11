package com.avLease.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avLease.pojo.Tap;
import com.avLease.service.TapService;

@Controller
public class TapController {
	
	@Autowired
	private TapService tapService;
	
	@RequestMapping("/allTaps")
	public String allTaps(Model model)
	{
		//调用service层返回list
		List<Tap> taps = tapService.findAllTaps();
		//在模型中添加数据
		model.addAttribute("taps",taps);
		//返回视图名，交给视图解析器处理
		return "admin_allTap";
	}
	
	@RequestMapping("/findTapById")
	public String findTapById(Model model,@RequestParam("name") String name)
	{
		List<Tap> tap = tapService.findTapById(name);
		List<Tap> list = new ArrayList<Tap>();
		list.addAll(tap);
		model.addAttribute("taps",list);
		return "admin_allTap";
	}
	
	@RequestMapping("/addTap")
	public String addTap(Model model,@RequestParam("name") String name,@RequestParam("tno") String tno)
	{
		Tap tap = tapService.addTap(name,tno);
		List<Tap> list = new ArrayList<Tap>();
		list.add(tap);
		model.addAttribute("taps",list);
		return "redirect:/allTaps";
	}
	
	@RequestMapping("/delTapById/{no}")
	public String delTapById(Model model,@PathVariable("no") int no)
	{
		Tap tap = tapService.delTapById(no);
		List<Tap> list = new ArrayList<Tap>();
		list.add(tap);
		model.addAttribute("taps",list);
		return "redirect:/allTaps";
	}
	
	@RequestMapping("/upTapById")
	public String upTapById(Model model,@RequestParam("no") int no,@RequestParam("name") String name,@RequestParam("tno") String tno,@RequestParam("state") String state)
	{
		Tap tap = tapService.upTapById(no,name,tno,state);
		List<Tap> list = new ArrayList<Tap>();
		list.add(tap);
		model.addAttribute("taps",list);
		return "redirect:/allTaps";
	}
	
	
	
	
	@RequestMapping("/allTapsUser")
	public String allTapsUserUser(Model model)
	{
		//调用service层返回list
		List<Tap> taps = tapService.findAllTapsUser();
		//在模型中添加数据
		model.addAttribute("taps",taps);
		//返回视图名，交给视图解析器处理
		return "user_allTap";
	}
	
	@RequestMapping("/findTapByIdUser")
	public String findTapByIdUser(Model model,@RequestParam("name") String name)
	{
		List<Tap> tap = tapService.findTapByIdUser(name);
		List<Tap> list = new ArrayList<Tap>();
		list.addAll(tap);
		model.addAttribute("taps",list);
		return "user_allTap";
	}

}
