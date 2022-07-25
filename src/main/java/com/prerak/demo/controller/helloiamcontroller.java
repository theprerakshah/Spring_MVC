package com.prerak.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class helloiamcontroller {

	@RequestMapping("/")
	public String index() {
		
			
		return "my.jsp";
	}
	@RequestMapping(path="/result", method=RequestMethod.POST)
	public String result(@RequestParam("name") String empname,
			@RequestParam("id") String empid,
			@RequestParam("contact") String empcontact, Model model) {
		
		model.addAttribute("name",empname);
		model.addAttribute("id",empid);
		model.addAttribute("contact",empcontact);
			
		return "result.jsp";
	}
	
}
