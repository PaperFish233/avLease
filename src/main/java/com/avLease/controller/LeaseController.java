package com.avLease.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avLease.pojo.Lease;
import com.avLease.pojo.Tap;
import com.avLease.service.LeaseService;
import com.avLease.service.TapService;

@Controller
public class LeaseController {
	
	@Autowired
	private LeaseService leaseService;
	
	@Autowired
	private TapService tapService;
	
	@RequestMapping("/allLeases")
	public String allLeases(Model model)
	{
		//调用service层返回list
		List<Lease> leases = leaseService.findAllLeases();
		//在模型中添加数据
		model.addAttribute("leases",leases);
		//返回视图名，交给视图解析器处理
		return "admin_allLease";
	}
	
	@RequestMapping("/findLeaseById")
	public String findLeaseById(Model model,@RequestParam("name") String name)
	{
		List<Lease> lease = leaseService.findLeaseById(name);
		List<Lease> list = new ArrayList<Lease>();
		list.addAll(lease);
		model.addAttribute("leases",list);
		return "admin_allLease";
	}
	
	@RequestMapping("/addLease")
	public String addLease(Model model,@RequestParam("name") String name,@RequestParam("tap") String tap,@RequestParam("time") String time)
	{
		Lease lease = leaseService.addLease(name,tap,time);
		
		Tap tap1 = tapService.stateLease(tap);
		
		List<Lease> list = new ArrayList<Lease>();
		list.add(lease);
		model.addAttribute("leases",list);
		return "redirect:/allLeases";
	}
	
	@RequestMapping("/upLeaseById")
	public String upLeaseById(Model model,@RequestParam("no") int no,@RequestParam("name") String name,@RequestParam("tap") String tap,@RequestParam("time") String time)
	{
		Lease lease = leaseService.upLeaseById(no,name,tap,time);
		List<Lease> list = new ArrayList<Lease>();
		list.add(lease);
		model.addAttribute("leases",list);
		return "redirect:/allLeases";
	}
	
	@RequestMapping("/delLeaseById/{no},{tap}")
	public String delLeaseById(Model model,@PathVariable("no") int no,@PathVariable("tap") String tap,HttpSession session)
	{
		Lease lease = leaseService.delLeaseById(no, tap);
		
		Tap tap1 = tapService.leaseState(tap);
		
		session.setAttribute("errorMessage", 5);
		
		List<Lease> list = new ArrayList<Lease>();
		list.add(lease);
		model.addAttribute("leases",list);
		return "errorInfo";
	}
	
	
	
	
	@RequestMapping("/leaseTap")
	public String leaseTap(Model model,@RequestParam("name") String name,@RequestParam("tap") String tap,@RequestParam("time") String time)
	{
		Lease lease = leaseService.addLease(name,tap,time);
		
		Tap tap1 = tapService.stateLease(tap);
		
		List<Lease> list = new ArrayList<Lease>();
		list.add(lease);
		model.addAttribute("leases",list);
		return "redirect:/allTapsUser";
	}
	
	
	@RequestMapping("/findLeaseByIdUser/{name}")
	public String findLeaseByIdUser(Model model,@PathVariable("name") String name)
	{
		List<Lease> lease = leaseService.findLeaseByIdUser(name);
		List<Lease> list = new ArrayList<Lease>();
		list.addAll(lease);
		model.addAttribute("leases",list);
		return "user_allLease";
	}
	
	@RequestMapping("/findLeaseByIdUser2/{name}")
	public String findLeaseByIdUser2(Model model,@RequestParam("tap") String tap,@PathVariable("name") String name)
	{
		List<Lease> lease = leaseService.findLeaseByIdUser2(tap,name);
		List<Lease> list = new ArrayList<Lease>();
		list.addAll(lease);
		model.addAttribute("leases",list);
		return "user_allLease";
	}
	
	@RequestMapping("/delLeaseByIdUser/{no},{tap}")
	public String delLeaseByIdUser(Model model,@PathVariable("no") int no,@PathVariable("tap") String tap,HttpSession session)
	{
		Lease lease = leaseService.delLeaseByIdUser(no, tap);
		
		Tap tap1 = tapService.leaseState(tap);
		
		session.setAttribute("errorMessage", 6);
		
		List<Lease> list = new ArrayList<Lease>();
		list.add(lease);
		model.addAttribute("leases",list);
		return "errorInfo";
	}

}
