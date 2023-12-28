package com.abcbank.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Biller_menu;
import com.abcbank.repository.Biller_menuRepo;
import com.abcbank.service.Biller_menuService;

@Service
public class Biller_menuServiceImplementation implements Biller_menuService {
	@Autowired
	private Biller_menuRepo biller_menuRepo;
	  
	@Override
	public Object biller_menu(Biller_menu biller_menu) {
		Map<String ,Object> map = new HashMap<String ,Object>();
		if(biller_menu.getBiller_name().isEmpty()) {
			map.put("status","error");
			map.put("msg","Please Enter Your Name");
		}
		else if(biller_menu.getBiller_ifsc_code().isEmpty()){
			map.put("status","error");
			map.put("msg", "Please Enter Your ifsc code");
		}
		else if(biller_menu.getBranch_name().isEmpty()){
			map.put("status","error");
			map.put("msg", "Please Enter Your Branch Name");
		}
		else if(biller_menu.getBiller_account_no()==null){
			map.put("status", "error");
			map.put("msg", "please Enter Your Account Number");
		}
		else if(biller_menu.getBiller_acc_type().isEmpty()){
			map.put("status", "error");
			map.put("msg", "Please Enter Your Account Type");
		}
		else if(biller_menu.getPay_now_status().isEmpty()) {
			map.put("status","error");
			map.put("map", "Please Enter Your pay now status");
		}
//		else if(biller_menu.getCategory().getCategory_code() == 0.0) {
//			map.put("status","error");
//			map.put("map", "Please Select Category");
//		}
		else {
//			biller_menuRepo.save(biller_menu);
//           
//            map.put("msg", "Data saved successfully");
			biller_menu.setStatus("Active");
		     biller_menuRepo.save(biller_menu);
	            

	            // Include the status in the response
	            map.put("status", "success");
	            map.put("msg", "Data saved successfully");
	            map.put("biller_status", biller_menu.getStatus());
		}
		return map;

	}

	@Override
	public Object getAllBiller_menu() {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		List<Biller_menu> biller_menu = biller_menuRepo.findAll();
		for(Biller_menu e: biller_menu) {
			Map<String, Object> map1 = new HashMap<String, Object>();
			map1.put("biller_id", e.getBiller_id());
			map1.put("biller_name", e.getBiller_name());
			map1.put("biller_account_no", e.getBiller_account_no());
			map1.put("biller_ifsc_code", e.getBiller_ifsc_code());
			map1.put("biller_acc_type", e.getBiller_acc_type());
			map1.put("branch_name", e.getBranch_name());
			map1.put("Category", e.getCategory().getCategory_desc());			
			map1.put("pay_now_status", e.getPay_now_status());
			map1.put("Status", e.getStatus());
			list.add(map1);
			
		}
		return list;

}  
//	@Override
//	public Object updateBiller_menu(Biller_menu biller_menu) {
//		Map<String ,Object> map = new HashMap<String ,Object>();	
//		 if (biller_menu.getBiller_name() == null || biller_menu.getBiller_name().isEmpty()) {
//
//			map.put("status","error");
//			map.put("msg","Please Enter Your Name");
//		}
//		else if(biller_menu.getBiller_ifsc_code().isEmpty()){
//			map.put("status","error");
//			map.put("msg", "Please Enter Your ifsc code");
//		}
//		else if(biller_menu.getBranch_name().isEmpty()){
//			map.put("status","error");
//			map.put("msg", "Please Enter Your Branch Name");
//		}
//		else if(biller_menu.getBiller_account_no()==null){
//			map.put("status", "error");
//			map.put("msg", "please Enter Your Account Number");
//		}
//		else if(biller_menu.getBiller_acc_type().isEmpty()){
//			map.put("status", "error");
//			map.put("msg", "Please Enter Your Account Type");
//		}
//		else if(biller_menu.getPay_now_status().isEmpty()) {
//			map.put("status","error");
//			map.put("map", "Please Enter Your pay now status");
//		}
//
//		else {
//		     biller_menuRepo.saveAndFlush(biller_menu);
//	            biller_menu.setStatus("Active");
//	            map.put("status", "success");
//	            map.put("msg", "Data Updated successfully");
//	            map.put("biller_status", biller_menu.getStatus());
//		}
//		return map;
	@Override
		public Object updateBiller_menu(Biller_menu biller_menu) {
		    Map<String, Object> map = new HashMap<>();

		    // Check if ID is not provided
		    if (biller_menu.getBiller_id()==0.0) {
		        map.put("status", "error");
		        map.put("msg", "ID is required for updating. Please provide a valid ID.");
		      return map;
		    }

		    if (biller_menu.getBiller_name() == null || biller_menu.getBiller_name().isEmpty()) {
		        map.put("status", "error");
		        map.put("msg", "Please Enter Your Name");
		    } else if (biller_menu.getBiller_ifsc_code().isEmpty()) {
		        map.put("status", "error");
		        map.put("msg", "Please Enter Your ifsc code");
		    } else if (biller_menu.getBranch_name().isEmpty()) {
		        map.put("status", "error");
		        map.put("msg", "Please Enter Your Branch Name");
		    } else if (biller_menu.getBiller_account_no() == null) {
		        map.put("status", "error");
		        map.put("msg", "Please Enter Your Account Number");
		    } else if (biller_menu.getBiller_acc_type().isEmpty()) {
		        map.put("status", "error");
		        map.put("msg", "Please Enter Your Account Type");
		    } else if (biller_menu.getPay_now_status().isEmpty()) {
		        map.put("status", "error");
		        map.put("map", "Please Enter Your pay now status");
		    } else {
		        try {
		            // Save and flush only if the ID is provided
		        	 biller_menu.setStatus("Active");
			            biller_menuRepo.saveAndFlush(biller_menu);

			            map.put("status", "success");
			            map.put("msg", "Data Updated successfully");
			            map.put("biller_status", biller_menu.getStatus());

		            // Set status and message
		           
		        } catch (Exception e) {
		            // Handle exceptions
		            map.put("status", "error");
		            map.put("msg", "Error updating data: " + e.getMessage());
		        }
		    }

		    return map;
		

	}
	
}	

