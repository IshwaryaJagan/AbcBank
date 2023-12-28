package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Account;
import com.abcbank.repository.AccountRepo;
import com.abcbank.service.AccountService;

@Service
public class AccountServiceImplementation implements AccountService{

	@Autowired
	private AccountRepo accountRepo;
	
	@Override
	public Object getAccountsById(int custId) {
		
		List<Map<String, Object>> list = new ArrayList<>();
		List<Account> accounts = accountRepo.findAll();

		for (Account a : accounts) {

		Map<String, Object> map = new HashMap<>();
		map.put("Accounts: ", a.getAccount_number());

		list.add(map);
		}
		return list;
	}
}
