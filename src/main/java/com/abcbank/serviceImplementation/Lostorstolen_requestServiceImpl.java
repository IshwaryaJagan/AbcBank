package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.DTO.StolenDTO;
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
		map.put("Card Number", sl.getCard_number());
		map.put("Card Type",   sl.getCard_type());
		map.put("Status",    sl.getResponse_status());
	    map.put("Response Message",sl.getResponse_message());

		list.add(map);
		}
		return list;
	}
	@Override
	public Object getById(int lost_stolen_request_id) {
		
		 Map<String,Object> map=new HashMap<String,Object>();
	  Lostorstolen_request sol= stolenRepo.findById(lost_stolen_request_id).orElse(null);
	        if(sol!=null){
	        map.put("Card Number", sol.getCard_number());
			map.put("Card Type",   sol.getCard_type());
			map.put("Status",         sol.getResponse_status());
		    map.put("Response Message",sol.getResponse_message());
			}
			else {
			map.put("Status", "Error");
			map.put("Message","Enter Valid Id");
			}
			return map;
		}
	@Override
	public Object updateById(StolenDTO dto) {
		 Map<String,Object> map=new HashMap<String,Object>();
		 Lostorstolen_request lsr=stolenRepo.findById(dto.getId()).orElse(null);
		 if(lsr!=null) {
			 lsr.setResponse_status(dto.getResponse_status());
			 lsr.setResponse_message(dto.getResponse_message());
			 stolenRepo.saveAndFlush(lsr);
			 map.put("Status", "Success");
			 map.put("Message","Update Sucessfully");
		 }else
		 {
		 map.put("Status", "Error");
		 map.put("Message","Invailed Lostorstolen Request Id");
		 }
		return map;
	}

}
