package com.pizza.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HomePageRepository 
{
	public void showHomePage()
	{
		System.out.println("hello Repository");
	}
}
