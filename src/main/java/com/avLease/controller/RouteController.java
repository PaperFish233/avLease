package com.avLease.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {
	@RequestMapping("/route/{page}")
	public String route(@PathVariable("page") String page)
	{
		return page;
	}
}
