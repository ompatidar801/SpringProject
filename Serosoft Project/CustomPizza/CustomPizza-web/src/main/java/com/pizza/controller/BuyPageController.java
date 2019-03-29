package com.pizza.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pizza.service.BuyPageService;

@Controller
public class BuyPageController 
{
	@Autowired
	private BuyPageService buyPageService; 
	
	@RequestMapping(value = "/buyPizza" ,method = RequestMethod.POST)  
	public String buyScreen(@RequestParam String action)
	{
		System.out.println("hello Buy Controller");
		buyPageService.showBuyPage();

	    if( action.equals("Orders") ){
	    	System.out.println("italian");
	    	return "order";
	    }
	    
		return "home";
	}
		
	/*
	 * @RequestMapping(value = "/buyPizza" ,method = RequestMethod.POST)  
	public String buyScreen(@ModelAttribute("registrationUser") @Validated IndianPizza indianPizza user,Model model)
	{
		System.out.println("hello Buy Controller");
		buyPageService.showBuyPage(indianPizza);
	   
		return "home";
	}
	 * 
	 * 
	 * System.out.println("hello buyScreen Controller");
		return "buyPage"; 
	}
	
	@RequestMapping(value= "ItalianPizza" ,method = RequestMethod.POST)  
	public String italian(){

		return "italian";
		
		 
	}
	
	@RequestMapping(value = "IndianPizza" ,method = RequestMethod.POST)  
	public String indian(HttpServletRequest request)
	{
		System.out.println("hello indian Controller");
		return "indian"; 
	}*/
}
