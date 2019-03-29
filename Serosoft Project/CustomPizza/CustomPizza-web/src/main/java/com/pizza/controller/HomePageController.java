package com.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pizza.service.HomePageService;

@Controller
public class HomePageController 
{
	@Autowired
	private HomePageService homePageService;
	
	@RequestMapping("/showPage")  
	public String showHomePage()
	{
		System.out.println("hello Controller");
		homePageService.showHomePage();
		return "home"; 
	}
	
	@RequestMapping(value = "/home" ,method = RequestMethod.POST)  
	public String buyScreen(@RequestParam String action){

		 if( action.equals("ItalianPizza") ){
		    	System.out.println("italian");
		    	return "italian";
		    }
		 
		 if( action.equals("IndianPizza") ){
		    	System.out.println("indian");
		    	return "indian";
		    }
		
		if( action.equals("Orders") ){
	    	System.out.println("order");
	    	return "orders";
	    }
	    
		return "buyPage";
	}

}
