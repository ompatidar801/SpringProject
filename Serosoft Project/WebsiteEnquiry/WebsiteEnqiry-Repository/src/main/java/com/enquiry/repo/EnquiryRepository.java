package com.enquiry.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.enquiry.model.UsersQueries;

@Repository
public class EnquiryRepository {
	
	@Autowired
	public HibernateTemplate ht;
	
	public void submitQueries(UsersQueries usersQueries)
	{
		System.out.println("hello submitQueries Repository");
		ht.save("UsersQueries", usersQueries);
		System.out.println("Registered Successfully.");
	}
	
}
