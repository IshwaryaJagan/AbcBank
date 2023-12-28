package com.abcbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.DTO.CustomerDTO;
import com.abcbank.model.Creditordebit_request;
import com.abcbank.model.Customer;
import com.abcbank.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerservice;

   
    @PostMapping("/validateUser")
    public Object login(@RequestBody Customer customer) {
        return customerservice.validateUser(customer);
    }
    
    
    @GetMapping("/getall")
	public Object getCustomer() {
		return (customerservice.getAllCustomer());
	}
    
//    @PutMapping("/updatecus/{id}")
//    public Object updatetbyid(@PathVariable("id")int customer_id,@RequestBody Customer cus) {
//    	return customerservice.updatebyid(customer_id,cus);
//	}
//    
//    @PutMapping("/updatecus")
//    public Object Updatebyid(@RequestBody CustomerDTO customerDTO) {
//    	
//		return customerservice.Updatebyid(customerDTO);
    	
    @PutMapping("/update")
    public Object updateById(@RequestBody CustomerDTO customerDTO) {
		return (customerservice.updateById(customerDTO));
    	
    }
    
    
    
}