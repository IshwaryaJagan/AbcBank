package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Lostorstolen_request;
import com.abcbank.repository.Lostorstolen_requestRepo;
import com.abcbank.service.Lostorstolen_requestService;
@Service
public class Lostorstolen_requestImpl implements Lostorstolen_requestService{
	
	@Autowired
	private Lostorstolen_requestRepo lostorstolen_requestRepo;

	public Object saveRequ(Lostorstolen_request lostorstolen_request) {
		int lost_stolen_request_id = lostorstolen_request.getLost_stolen_request_id();
		Map<String, Object> map=new HashMap<String, Object>();
		
		if(lostorstolen_request.getRequest_date()== null) {
			map.put("status", "error");
			map.put("msg", "Please enter the Request date :");
		}
		else if(lostorstolen_request.getResponse_message().isEmpty()) {
			map.put("status", "error");
			map.put("msg", "Please enter the Response Message :");
		}
		else if(lostorstolen_request.getResponse_status().isEmpty()) {
			map.put("status", "error");
			map.put("msg", "Please enter the Request Status:");
		}
		
		else if (lostorstolen_request.getProcess_id()== 0) {
			map.put("status", "error");
			map.put("msg", "Please enter the Process ID  :");
		}
		else if(lostorstolen_request.getStolen_date()==null) {
			map.put("status", "error");
			map.put("msg", "Please enter the stolen Date :");
		}	
		
		else if(lostorstolen_request.getService_request_id()==0) {
			map.put("status", "error");
			map.put("msg", "Please enter the service_request_id :");
		}
		else if(lostorstolen_request.getCard_number()==null) {
			map.put("status", "error");
			map.put("msg", "Please enter the card_number:");
		}
		else if(lostorstolen_request.getCard_type().isEmpty()) {
			map.put("status", "error");
			map.put("msg", "Please enter the card_type :");
		}
		else if(lostorstolen_request.getRequest_message().isEmpty()) {
			map.put("status", "error");
			map.put("msg", "Please enter the request_message:");
		}
		
		else {
			lostorstolen_requestRepo.save(lostorstolen_request);
			map.put("status", "Success");
			map.put("msg", "Data saved Successfully :");
		}
		return map;
	}

	

	public Object getAllRequ() {
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		List <Lostorstolen_request> lostorstolen_requests  = lostorstolen_requestRepo.findAll();
		for(Lostorstolen_request e:lostorstolen_requests) {
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("request_date", e.getRequest_date());
			map.put("response_message", e.getResponse_message());
			map.put("response_status", e.getResponse_status());
			map.put("process_id", e.getProcess_id());
			map.put("stolen_date", e.getStolen_date());
			map.put("service_request_id", e.getService_request_id());
			map.put("card_number", e.getCard_number());
			map.put("card_type", e.getCard_type());
			map.put("request_message", e.getRequest_message());
			
			list.add(map);

		}
		return list;
		
	}

	public Object getrequById(int id) {
		Map<String, Object> map=new HashMap<String, Object>();
		Lostorstolen_request lostorstolen_request = lostorstolen_requestRepo.findById(id).orElse(null);
		if(lostorstolen_request!=null) {
			map.put("request_date", lostorstolen_request.getRequest_date());
			map.put("response_message", lostorstolen_request.getResponse_message());
			map.put("response_status", lostorstolen_request.getResponse_status());
			map.put("process_id", lostorstolen_request.getProcess_id());
			map.put("stolen_date", lostorstolen_request.getStolen_date());
			map.put("service_request_id", lostorstolen_request.getService_request_id());
			map.put("card_number", lostorstolen_request.getCard_number());
			map.put("card_type", lostorstolen_request.getCard_type());
			map.put("request_message", lostorstolen_request.getRequest_message());
			return map;
		}
		return null;
	}

	

	
}
