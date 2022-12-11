package com.avLease.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avLease.pojo.Type;
import com.avLease.service.TypeService;

@Controller
public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	@RequestMapping("/allTypes")
	public String allTypes(Model model)
	{
		//调用service层返回list
		List<Type> types = typeService.findAllTypes();
		//在模型中添加数据
		model.addAttribute("types",types);
		//返回视图名，交给视图解析器处理
		return "admin_allType";
	}

	@RequestMapping("/findTypeById")
	public String findTypeById(Model model,@RequestParam("ttname") String ttname)
	{
		List<Type> type = typeService.findTypeById(ttname);
		List<Type> list = new ArrayList<Type>();
		list.addAll(type);
		model.addAttribute("types",list);
		return "admin_allType";
	}
	
	@RequestMapping("/addType")
	public String addType(Model model,@RequestParam("ttname") String ttname)
	{
		Type type = typeService.addType(ttname);
		List<Type> list = new ArrayList<Type>();
		list.add(type);
		model.addAttribute("types",list);
		return "redirect:/allTypes";
	}

	@RequestMapping("/delTypeById/{ttno}")
	public String delTypeById(Model model,@PathVariable("ttno") int ttno)
	{
		Type type = typeService.delTypeById(ttno);
		List<Type> list = new ArrayList<Type>();
		list.add(type);
		model.addAttribute("types",list);
		return "redirect:/allTypes";
	}
	
	@RequestMapping("/upTypeById")
	public String upTypeById(Model model,@RequestParam("ttno") int ttno,@RequestParam("ttname") String ttname)
	{
		Type type = typeService.upTypeById(ttno,ttname);
		List<Type> list = new ArrayList<Type>();
		list.add(type);
		model.addAttribute("types",list);
		return "redirect:/allTypes";
	}
	
}
