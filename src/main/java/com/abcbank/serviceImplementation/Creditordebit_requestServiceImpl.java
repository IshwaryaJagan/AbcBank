package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abcbank.DTO.CreditorDebitDTO;
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
		map.put("Account Number", cr.getAccountCreditordebit().getAccount_number());
		map.put("Account Type", cr.getAccountCreditordebit().getAccount_type());
		map.put("Customer Name",  cr.getAccountCreditordebit().getCustomer().getName());
		map.put("Request Date",    cr.getRequest_date());
		map.put("Card Type",   cr.getCard_type());
		map.put("Status",    cr.getResponse_status());
	    map.put("Reason For Rejection",cr.getResponse_message());

		list.add(map);
		}
		return list;
	}

	@Override
	public Object getById(int credit_debit_request_id) {
		 Map<String,Object> map=new HashMap<String,Object>();
	        Creditordebit_request cb= creditorDebitRequestRepo.findById(credit_debit_request_id).orElse(null);
	        if(cb!=null){
			map.put("Account Number", cb.getAccountCreditordebit().getAccount_number());
			map.put("Account Type", cb.getAccountCreditordebit().getAccount_type());
			map.put("Customer Name",  cb.getAccountCreditordebit().getCustomer().getName());
			map.put("Request Date",    cb.getRequest_date());
			map.put("Card Type",   cb.getCard_type());
			map.put("Status",         cb.getResponse_status());
		    map.put("Reason For Rejection",cb.getResponse_message());
			}
			else {
			map.put("Status", "Error");
			map.put("Message","Enter valid CreditorDebit Id");
			}
			return map;
			}

	@Override
	public Object updateById(CreditorDebitDTO cbDTO) {
		Map<String,Object> map=new HashMap<String,Object>();
		Creditordebit_request cbrq=creditorDebitRequestRepo.findById(cbDTO.getId()).orElse(null);
		
		if(cbrq!=null) {
		cbrq.setResponse_status(cbDTO.getResponse_status());
		cbrq.setResponse_message(cbDTO.getResponse_message());
		
		creditorDebitRequestRepo.saveAndFlush(cbrq);
		
		map.put("Status", "Success");
		map.put("Message", "CreditorDebit Request Update Sucessfully");
		}else
		{
			map.put("Status", "Error");
			map.put("Message", "Invalid CreditorDebit Request Id");
		}
		return map;
	}
}
