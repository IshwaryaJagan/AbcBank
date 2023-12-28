package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.DTO.ChequeDTO;
import com.abcbank.model.Chequebook_request;
import com.abcbank.repository.Chequebook_requestRepo;
import com.abcbank.service.Chequebook_requestService;

import jakarta.transaction.Transactional;

@Service
public class Chequebook_requestServiceImpl implements Chequebook_requestService {

	@Autowired 
	Chequebook_requestRepo chequeRepo;
	
	@Override
	public Object getAllChequeBookRequest() {
			List<Map<String,Object>>list=new ArrayList<Map<String,Object>>();
			List<Chequebook_request>cheque=chequeRepo.findAll();
			for(Chequebook_request e:cheque) {
			Map<String,Object>map=new HashMap<String,Object>();
			map.put("account_number", e.getAccountforCheque().getAccount_number());
			map.put("acounttype", e.getAccountforCheque().getAccount_type());
			map.put("user name",  e.getAccountforCheque().getCustomer().getName());
			map.put("request date",    e.getRequest_date());
			map.put("number of cheque leaves",   e.getNumber_of_cheque_leaves());
			map.put("Status",         e.getResponse_status());
		    map.put("response_message",e.getResponse_message());
			list.add(map);
			}
			return list;
	}

	@Override
	public Object getChequeBookRequestid(int chequebook_request_id) {
        Map<String,Object> map=new HashMap<String,Object>();
        Chequebook_request cheque= chequeRepo.findById(chequebook_request_id).orElse(null);
	if(cheque!=null){
		map.put("account_number", cheque.getAccountforCheque().getAccount_number());
		map.put("acount_type", cheque.getAccountforCheque().getAccount_type());
		map.put("user_name",  cheque.getAccountforCheque().getCustomer().getName());
		map.put("request_date",    cheque.getRequest_date());
		map.put("number_of_cheque_leaves",   cheque.getNumber_of_cheque_leaves());
		map.put("response_status",         cheque.getResponse_status());
	    map.put("response_message",cheque.getResponse_message());
		}
		else {
		map.put("status", "error");
		map.put("Message","enter valid id");
		}
		return map;
		}
	
	


	@Override
	public Object updateById(ChequeDTO chequeBookRequest) {
		
		Map<String,Object>map=new HashMap<String, Object>();
	
		Chequebook_request chequebook_request = chequeRepo.findById(chequeBookRequest.getId()).orElse(null);
		
		if(chequebook_request!=null)
		{
			chequebook_request.setResponse_status(chequeBookRequest.getResponse_status());
			chequebook_request.setResponse_message(chequeBookRequest.getResponse_message());
			
			chequeRepo.saveAndFlush(chequebook_request);
			
			 map.put("status", "success");
		     map.put("message", "Chequebook request updated successfully");
			
		}
		else 
		{
			map.put("status", "error");
	        map.put("message", "Invalid Chequebook Request ID");
		}
		return map;
	}
}
