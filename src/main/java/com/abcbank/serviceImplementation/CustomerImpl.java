package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.abcbank.DTO.CustomerDTO;
import com.abcbank.model.Creditordebit_request;
import com.abcbank.model.Customer;
import com.abcbank.repository.CustomerRepo;
import com.abcbank.service.CustomerService;

@Service
public class CustomerImpl implements CustomerService{
    

	@Autowired
    private CustomerRepo customerRepo;
	
	
	public Object getAllCustomer() {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		List<Customer> customers = customerRepo.findAll();
		
		for(Customer c:customers) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("Customer Id", c.getCustomer_id());
			map.put("Customer Name", c.getName());
			map.put("Customer UserName", c.getUserName());
			map.put("Customer Password", c.getPassword());
			map.put("Customer Dob", c.getDob());
			map.put("Customer phone_nO", c.getPhone_no());
			map.put("Customer Door_Street", c.getDoor_street());
			map.put("Customer City", c.getCity());
			map.put("Customer Pincode", c.getPincode());
			map.put("Customer Pan_No", c.getPan_no());
			map.put("Customer Email", c.getEmail());
			map.put("Customer State", c.getState());
			list.add(map);
		}
		return list;
	}


	public Object updateCustomer(Customer customer) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(customer.getName().isEmpty()) {
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The Customer Name :");
		}
		else if(customer.getUserName().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The  UserName :");
		}
		else if(customer.getPassword().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The Password :");
		}
		else if(customer.getDob() == null){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please enter the DOB :");
		}
		else if(customer.getPhone_no().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The Phone_No :");
		}
		else if(customer.getDoor_street().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The Door_street :");
		}
		else if(customer.getCity().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The City :");
		}
		else if(customer.getPincode().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The Pincode :");
		}
		else if(customer.getPan_no().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The Pan_no :");
		}
		else if(customer.getEmail().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The Email :");
		}
		else if(customer.getState().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg :", "Please Enter The State :");
		}
		else {
			customerRepo.save(customer);
			map.put("Status", "Success");
			map.put("Msg", "Data Update successfully");
		}
		return map;
		
	}

	@Override
	public Object validateUser(Customer customer) {
		Map<String, Object> map = new HashMap<String, Object>();
        String username = customer.getUserName();
        String password = customer.getPassword();


            Customer login = customerRepo.find(username);

            if(login != null) {
                if(login.getPassword().equals(password)) {
                    map.put("Status", "Success");
                    map.put("Message", "Login Successful");
                }
                else {
                    map.put("Status", "Error!!!");
                    map.put("Message", "Invalid Password");
                }
            }
            else {
                map.put("Status", "Error!!!");
                map.put("Message", "Invalid Username");
            }
        return map;
    }


//	@Transactional
//	@Override
//	public Object updatebyid(int customer_id, Customer cus) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		Customer  cus1 = customerRepo.findById(customer_id).orElse(null);
//		
//			    if (cus1 != null) {
//
//			        // Update the existing Customer with new data
//
//			    	cus1.setName(cus.getName());
//			    	cus1.setUserName(cus.getUserName());
//			    	cus1.setPassword(cus.getPassword());
//			    	cus1.setDob(cus.getDob());
//			    	cus1.setPhone_no(cus.getPhone_no());
//			    	cus1.setDoor_street(cus.getDoor_street());
//			    	cus1.setCity(cus.getCity());
//			    	cus1.setPincode(cus.getPincode());
//			    	cus1.setPan_no(cus.getPan_no());
//			    	cus1.setEmail(cus.getEmail());
//			    	cus1.setState(cus.getState());
//
//			        // Save the updated 
//
//			    	customerRepo.saveAndFlush(cus1);
//			    	map.put("status", "success");
//			    	map.put("message", "Chequebook request updated successfully");
//			    } 
//			    else {
//			    	map.put("status", "error");
//			    	map.put("message", "Invalid Chequebook Request ID");
//			    }
//		return map;
//	}

//
//	@Override
//	public Object updatebyid(CustomerDTO customerDTO) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		Optional<Customer> cus =customerRepo.findById(customerDTO.getCustomer_id());
//		if(cus != null) {
//			cus.se
//		}
//		
//		
//		return null;
//	}


//	@Override
//	public Object Updatebyid(CustomerDTO customerDTO) {
//		
//		return null;
//	}


	@Override
	public Object updateById(CustomerDTO customerDTO) {
		Map<String, Object> map = new HashMap<String, Object>();
		Customer customer = customerRepo.findById(customerDTO.getId()).orElse(null);
		if(customer!=null) {
			customer.setDoor_street(customerDTO.getDoor_street());
			customer.setCity(customerDTO.getCity());
			customer.setPincode(customerDTO.getPincode());
			customer.setEmail(customerDTO.getEmail());
			
			customerRepo.saveAndFlush(customer);
			map.put("Status", "Succuess");
			map.put("Message", "Customer ID Update Successfully");
		}else {
			map.put("Status", "Error!!!");
			map.put("Message", "Invalid Customer ID");
		}
		return map;
	}

}
	
	
	
	
	
	

	
	
	
	
	
	
	