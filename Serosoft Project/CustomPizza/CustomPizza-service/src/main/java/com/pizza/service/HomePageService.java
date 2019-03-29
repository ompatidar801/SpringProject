package com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.repository.HomePageRepository;

@Service
public class HomePageService 
{
	@Autowired
	private HomePageRepository homePageRepo;
	
	public void showHomePage()
	{
		System.out.println("hello Service");
		homePageRepo.showHomePage();
	}
}
