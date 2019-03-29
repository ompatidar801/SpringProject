package com.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.enquiry.model.UsersQueries;
import com.enquiry.service.EnquiryService;
import com.enquiry.validator.EnquiryValidator;


@Controller
public class EnquiryController 
{
	@Autowired
	private EnquiryService enquiryService;
	
	@Autowired
	private EnquiryValidator ev;
	
	@RequestMapping(value = "/showPage" ,method=RequestMethod.GET)  
	public String showHomePage(Model model)
	{
		System.out.println("hello Controller");
		model.addAttribute("UsersQueries",new UsersQueries());
		//enquiryService.showPage();
		return "enquiry"; 
	}
	
	@RequestMapping(value = "/hello" ,method = RequestMethod.POST)  
	public String submitQueries(@RequestParam String action, @ModelAttribute("UsersQueries") UsersQueries usersQueries ,BindingResult result ,Model model){
	 
		ev.validate(usersQueries, result);
		if(result.hasErrors()){
			return "enquiry";
		}
		if (action.equals("Submit")) {
			System.out.println("hello submitQueries Controller");
			//model.addAttribute("UserQueries", usersQueries); 
			enquiryService.submitQueries(usersQueries);
			return "enquiry";
		}
		return "enquiry";
		
	}
}
