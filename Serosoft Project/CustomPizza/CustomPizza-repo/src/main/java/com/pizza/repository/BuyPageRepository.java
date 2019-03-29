package com.pizza.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BuyPageRepository {
	
	public void showBuyPage()
	{
		System.out.println("hello Buy Repository");
	}
	
	/*public void showBuyPage(IndianPizza indianPizza)
	{
		System.out.println("hello Buy Repository");
		ht.save("IndianPizza", indianPizza);
		System.out.println("Registered Successfully.");
	}*/
	
}
