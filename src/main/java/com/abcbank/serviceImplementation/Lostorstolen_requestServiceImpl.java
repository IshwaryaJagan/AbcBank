package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Creditordebit_request;
import com.abcbank.model.Lostorstolen_request;
import com.abcbank.repository.Lostorstolen_requestRepo;
import com.abcbank.service.Lostorstolen_requestService;

@Service
public class Lostorstolen_requestServiceImpl implements Lostorstolen_requestService {

	@Autowired
	private Lostorstolen_requestRepo stolenRepo;
	@Override
	public Object getalldetails() {
		
		List<Map<String,Object>>list=new ArrayList<Map<String,Object>>();
		List<Lostorstolen_request> cb =stolenRepo.findAll();
		for(Lostorstolen_request sl:cb) {
		Map<String,Object>map=new HashMap<String,Object>();
		map.put("account_number", sl.getAccountlost().getAccount_number());
		map.put("acount_type", sl.getAccountlost().getAccount_type());
		map.put("user_name",  sl.getAccountlost().getCustomer().getName());
		map.put("request_date",    sl.getRequest_date());
		map.put("card_type",   sl.getCard_type());
		map.put("response_status",    sl.getResponse_status());
	    map.put("response_message",sl.getResponse_message());

		list.add(map);
		}
		return list;
	}
	@Override
	public Object getById(int lost_stolen_request_id) {
		
		 Map<String,Object> map=new HashMap<String,Object>();
	        Lostorstolen_request sol= stolenRepo.findById(lost_stolen_request_id).orElse(null);
	        if(sol!=null){
			map.put("account_number", sol.getAccountlost().getAccount_number());
			map.put("acount_type", sol.getAccountlost().getAccount_type());
			map.put("user_name",  sol.getAccountlost().getCustomer().getName());
			map.put("request_date",    sol.getRequest_date());
			map.put("card_type",   sol.getCard_type());
			map.put("response_status",         sol.getResponse_status());
		    map.put("response_message",sol.getResponse_message());
			}
			else {
			map.put("status", "error");
			map.put("Message","enter valid id");
			}
			return map;
		}

}
