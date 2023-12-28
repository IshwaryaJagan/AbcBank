package com.abcbank.serviceImplementation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.HashMap;
//import java.util.Map;

import com.abcbank.model.Customer;
import com.abcbank.repository.CustomerRepo;
import com.abcbank.service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService{
	
	@Autowired
	private CustomerRepo repo;
	
	@Override
	public Object validateUser(Customer customer) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		String username = customer.getUserName();
		String password = customer.getPassword();
		
		
			Customer login = repo.find(username);
			
			if(login != null) {
				if(login.getPassword().equals(password)) {
					map.put("status", "success");
					map.put("message", "Login successful");
				}
				else {
					map.put("status", "error");
					map.put("message", "Invalid password");
				}
			}
			else {
				map.put("status", "error");
				map.put("message", "Invalid username");
			}
		return map;
	}

	

}
