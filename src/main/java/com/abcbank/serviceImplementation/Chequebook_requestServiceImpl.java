package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abcbank.DTO.ChequeDTO;
import com.abcbank.model.Chequebook_request;
import com.abcbank.repository.Chequebook_requestRepo;
import com.abcbank.service.Chequebook_requestService;


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
			map.put("Account Number", e.getAccountforCheque().getAccount_number());
			map.put("Account Type", e.getAccountforCheque().getAccount_type());
			map.put("Customer Name",  e.getAccountforCheque().getCustomer().getName());
			map.put("Request Date",    e.getRequest_date());
			map.put("Number of Leaves",   e.getNumber_of_cheque_leaves());
			map.put("Status",         e.getResponse_status());
		    map.put("Reason For Rejection",e.getResponse_message());
			list.add(map);
			}
			return list;
	}

	@Override
	public Object getChequeBookRequestid(int chequebook_request_id) {
        Map<String,Object> map=new HashMap<String,Object>();
        Chequebook_request cheque= chequeRepo.findById(chequebook_request_id).orElse(null);
	if(cheque!=null){
		map.put("Account Number", cheque.getAccountforCheque().getAccount_number());
		map.put("Account Type", cheque.getAccountforCheque().getAccount_type());
		map.put("Customer Name",  cheque.getAccountforCheque().getCustomer().getName());
		map.put("Request Date",    cheque.getRequest_date());
		map.put("Number of Leaves",   cheque.getNumber_of_cheque_leaves());
		map.put("Status",         cheque.getResponse_status());
	    map.put("Reason For Rejection",cheque.getResponse_message());
		}
		else {
		map.put("Status", "Error");
		map.put("Message","Enter valid Chequebook Request Id");
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
			
			 map.put("Status", "Success");
		     map.put("Message", "Chequebook request updated successfully");
			
		}
		else 
		{
			map.put("Status", "Error");
	        map.put("Message", "Invalid Chequebook Request ID");
		}
		return map;
	}
}
