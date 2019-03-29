package com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.repository.BuyPageRepository;

@Service
public class BuyPageService 
{
	@Autowired
	private BuyPageRepository buyPageRepo;
	
	public void showBuyPage()
	{
		System.out.println("hello Buy Service");
		buyPageRepo.showBuyPage();
	}
	
	/*public void showBuyPage(IndianPizza indianPizza)
	{
		System.out.println("hello Buy Service");
		buyPageRepo.showBuyPage(indianPizza);
	}*/
}
