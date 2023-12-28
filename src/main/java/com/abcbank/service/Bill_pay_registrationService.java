package com.abcbank.service;

import com.abcbank.model.Bill_pay_registration;
import com.abcbank.model.Customer;

public interface Bill_pay_registrationService {


	public Object getCustomerNameById(int custId);

	public Object saveCustomerAccount(Customer customer);

//	public Object getAccountById(int custId);

}
