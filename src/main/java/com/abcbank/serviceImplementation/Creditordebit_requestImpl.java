package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Creditordebit_request;
import com.abcbank.model.Customer;
import com.abcbank.repository.Creditordebit_requestRepo;
import com.abcbank.service.Creditordebit_requestService;

@Service
public class Creditordebit_requestImpl implements Creditordebit_requestService{
	@Autowired
	private Creditordebit_requestRepo creditordebit_requestRepo;
	
	@Override
	public Object saveCreditordebit(Creditordebit_request creditordebit_request) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(creditordebit_request.getCard_number()==null) {
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Card Number");
		}
		else if(creditordebit_request.getCard_type().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Card Type");
		}
		else if(creditordebit_request.getResponse_status().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg", "OnGoing");
		}
		else if(creditordebit_request.getResponse_message().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg", "Doing");
		}
		else if(creditordebit_request.getService_request_id()==0){
			map.put("Status", "Error!!!");
			map.put("msg", "Please Enter The Service_Request_Id : ");
		}
		else if(creditordebit_request.getProcees_id()==0){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Process_Id :");
		}
		else if(creditordebit_request.getRequest_date()==null){
			map.put("Status", "Error!!!");
			map.put("Msg", "2012-09-02");
		}
		else if(creditordebit_request.getRequest_message().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg", "Request Granted");
		}
		else if(creditordebit_request.getResponse_date()==null){
			map.put("Status", "Error!!!");
			map.put("Msg", "2021-10-02");
		}
		else if(creditordebit_request.getCss_request_id()== 0){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Css_request_id");
		}
		else if(creditordebit_request.getCredit_debit_request_id()== 0){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Credit_debit_request_id");
		}
		else {
			creditordebit_requestRepo.save(creditordebit_request);
			map.put("Status", "Success");
			map.put("Msg", "Data Saved Successfully");
		}
		
		return map;
	}

	@Override
	public Object getAllCreditordebit_request() {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		List<Creditordebit_request> creditordebit =creditordebit_requestRepo.findAll();
		for(Creditordebit_request CD:creditordebit) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("Credit_debit_request_Id", CD.getCredit_debit_request_id());
			map.put("Card_Number", CD.getCard_number());
			map.put("Card_Type", CD.getCard_type());
			map.put("Response_Status", CD.getResponse_status());
			map.put("Response_Message", CD.getResponse_message());
			map.put("Response_Message", CD.getService_request_id());
			map.put("Response_Message", CD.getProcees_id());
			map.put("Response_Message", CD.getRequest_date());
			map.put("Response_Message", CD.getRequest_message());
			map.put("Response_Message", CD.getResponse_date());
			map.put("Response_Message", CD.getCss_request_id());
			
			list.add(map);
		}
		return list;
	}

	@Override
	public Object getbyid(int CDid) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Creditordebit_request CD1 = creditordebit_requestRepo.findById(CDid).orElse(null);
		if(CD1 != null) {
			map.put("Credit_debit_request_Id", CD1.getCredit_debit_request_id());
			map.put("Card_Number", CD1.getCard_number());
			map.put("Card_Type", CD1.getCard_type());
			map.put("Response_Status", CD1.getResponse_status());
			map.put("Response_Message", CD1.getResponse_message());
			map.put("Service_request_id", CD1.getService_request_id());
			map.put("Procees_id", CD1.getProcees_id());
			map.put("Request_date", CD1.getRequest_date());
			map.put("Request_Message", CD1.getRequest_message());
			map.put("Response_date", CD1.getResponse_date());
			map.put("Css_request_id", CD1.getCss_request_id());
			return map;
		}
		return null;
	}
//
//	@Override
//	public Object updatebyid(int credit_debit_request_id, Creditordebit_request cord) {
//		
//		
//		
//		
//		return null;
//	}

	
	
}
