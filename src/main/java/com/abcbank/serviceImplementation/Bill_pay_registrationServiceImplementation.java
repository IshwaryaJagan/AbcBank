package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Bill_pay_registration;
import com.abcbank.model.Customer;
import com.abcbank.repository.Bill_pay_registrationRepo;
import com.abcbank.service.Bill_pay_registrationService;


@Service
public class Bill_pay_registrationServiceImplementation implements Bill_pay_registrationService{

	@Autowired
	private Bill_pay_registrationRepo bill_pay_registrationRepo;
	
	@Override
	public Object getCustomerNameById(int custId) {
		Map<String, Object> map = new HashMap<String, Object>();
		Bill_pay_registration customer = bill_pay_registrationRepo.findById(custId).orElse(null);
		if(customer != null) {
			map.put("Customer Name: ", customer.getCustomer().getName());
			return map;
		}
		
		return null;
	}

	@Override
	public Object saveCustomerAccount(Customer customer) {
		
		
		return null;
	}



//	@Override
//	public Object getAccountById(int custId) {
//		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
//		List<Account> accounts = bill_pay_registrationRepo.findAll();
//		
//		for(Bill_pay_registration b: bill_pay_registrationRepo) {
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put("Accounts: ", b.get);
//		}
//		
//		return null;
//	}
	
	

}
