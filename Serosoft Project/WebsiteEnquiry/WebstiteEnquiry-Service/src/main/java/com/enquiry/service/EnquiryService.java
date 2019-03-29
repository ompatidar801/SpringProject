package com.enquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enquiry.model.UsersQueries;
import com.enquiry.repo.EnquiryRepository;


@Service
public class EnquiryService {

	
	@Autowired
	private EnquiryRepository enquiryRepository;
	
	public void submitQueries(UsersQueries usersQueries )
	{
		System.out.println("hello submitQueries Service");
		enquiryRepository.submitQueries(usersQueries);
	}
	
}
