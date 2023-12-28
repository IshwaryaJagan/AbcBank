package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Chequebook_request;
import com.abcbank.model.Creditordebit_request;
import com.abcbank.repository.Creditordebit_requestRepo;
import com.abcbank.service.Creditordebit_requestService;

@Service
public class Creditordebit_requestServiceImpl implements Creditordebit_requestService{

	@Autowired
	private Creditordebit_requestRepo creditorDebitRequestRepo;

	@Override
	public Object getAlldetails() {
		List<Map<String,Object>>list=new ArrayList<Map<String,Object>>();
		List<Creditordebit_request> cb =creditorDebitRequestRepo.findAll();
		for(Creditordebit_request cr:cb) {
		Map<String,Object>map=new HashMap<String,Object>();
		map.put("account_number", cr.getAccountCreditordebit().getAccount_number());
		map.put("acount_type", cr.getAccountCreditordebit().getAccount_type());
		map.put("user_name",  cr.getAccountCreditordebit().getCustomer().getName());
		map.put("request_date",    cr.getRequest_date());
		map.put("card_type",   cr.getCard_type());
		map.put("response_status",    cr.getResponse_status());
	    map.put("response_message",cr.getResponse_message());

		list.add(map);
		}
		return list;
	}

	@Override
	public Object getById(int credit_debit_request_id) {
		 Map<String,Object> map=new HashMap<String,Object>();
	        Creditordebit_request cb= creditorDebitRequestRepo.findById(credit_debit_request_id).orElse(null);
	        if(cb!=null){
			map.put("account_number", cb.getAccountCreditordebit().getAccount_number());
			map.put("acount_type", cb.getAccountCreditordebit().getAccount_type());
			map.put("user_name",  cb.getAccountCreditordebit().getCustomer().getName());
			map.put("request_date",    cb.getRequest_date());
			map.put("card_type",   cb.getCard_type());
			map.put("response_status",         cb.getResponse_status());
		    map.put("response_message",cb.getResponse_message());
			}
			else {
			map.put("status", "error");
			map.put("Message","enter valid id");
			}
			return map;
			}
}
