package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Chequebook_request;
import com.abcbank.repository.Chequebook_requestRepo;
import com.abcbank.service.Chequebook_requestService;

@Service
public class Chequebook_requestImpl implements Chequebook_requestService{
	@Autowired
	private Chequebook_requestRepo chequebook_requestRepo;

	@Override
	public Object saveCheque(Chequebook_request chequebook_request) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(chequebook_request.getNumber_of_cheque_leaves().isEmpty()) {
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Number_of_cheque_leaves");
		}
		else if(chequebook_request.getRequest_date()== null ){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Request_Date : ");
		}
		else if(chequebook_request.getResponse_date() == null){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Response_Date :");
		}
		else if(chequebook_request.getResponse_message().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Response_Message :");
		}
		else if(chequebook_request.getRequest_message().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Request_Message :");
		}
		else if(chequebook_request.getResponse_status().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Response_Status :");
		}
		else if(chequebook_request.getService_request_id()==0){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Service_Request_id :");
		}
		else if(chequebook_request.getProcess_id()==0){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Process_id :");
		}
		else if(chequebook_request.getCss_request_id()==0){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Css_Request_id :");
		}
		else {
			chequebook_requestRepo.save(chequebook_request);
			map.put("Status", "Success....");
			map.put("Msg", "Data Saved Successfully");
		}
		return map;
	}
	
	
	@Override
	public Object getAllCards() {
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		List <Chequebook_request> chequebookRequest  = chequebook_requestRepo.findAll();
		for(Chequebook_request e:chequebookRequest) {
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("chequebook_request_id", e.getChequebook_request_id());
			map.put("number_of_cheque_leaves", e.getNumber_of_cheque_leaves());
			map.put("request_date", e.getRequest_date());
			map.put("response_date", e.getResponse_date());
			map.put("response_message", e.getResponse_message());
			map.put("request_message", e.getRequest_message());
			map.put("response_status", e.getResponse_status());
			map.put("service_request_id", e.getService_request_id());
			map.put("process_id", e.getProcess_id());
			map.put("css_request_id", e.getCss_request_id());
			
			list.add(map);

		}
		return list;
	}

	@Override
	public Object getcardById(int id) {
		Map<String, Object> map=new HashMap<String, Object>();
		Chequebook_request chequebookRequest = chequebook_requestRepo.findById(id).orElse(null);
		if(chequebookRequest!=null) {
			map.put("chequebook_request_id", chequebookRequest.getChequebook_request_id());
			map.put("number_of_cheque_leaves", chequebookRequest.getNumber_of_cheque_leaves());
			map.put("request_date", chequebookRequest.getRequest_date());
			map.put("response_date", chequebookRequest.getResponse_date());
			map.put("response_message", chequebookRequest.getResponse_message());
			map.put("request_message", chequebookRequest.getRequest_message());
			map.put("response_status", chequebookRequest.getResponse_status());
			map.put("service_request_id", chequebookRequest.getService_request_id());
			map.put("process_id", chequebookRequest.getProcess_id());
			map.put("css_request_id", chequebookRequest.getCss_request_id());
			return map;
		}
		return null;
	}
//	@Override
//	public Object updateCard(Chequebook_request chequebookRequest) {
//		int Chequebook_request_id = chequebookRequest.getChequebook_request_id();
//		Map<String, Object> map=new HashMap<String, Object>();
//		
//		if(chequebookRequest.getRequest_message().isEmpty()) {
//			map.put("status", "error");
//			map.put("msg", "Please enter the Request message :");
//		}
//		else if (chequebookRequest.getNumber_of_cheque_leaves().isEmpty()) {
//			map.put("status", "error");
//			map.put("msg", "Please enter the Number of Leaves in chequeBook :");
//		}
//		
//		else {
//			chequebook_requestRepo.saveAndFlush(chequebookRequest);
//			map.put("status", "Success");
//			map.put("msg", "Data saved Successfully :");
//		}
//		return map;
//	
//		
//}
		}
