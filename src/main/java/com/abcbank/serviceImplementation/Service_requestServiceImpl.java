package com.abcbank.serviceImplementation;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.abcbank.DTO.ServiceDTO;
//import com.abcbank.model.Chequebook_request;
//import com.abcbank.model.Service_request;
//import com.abcbank.repository.Service_requestRepo;
//import com.abcbank.service.Service_requestService;

//@Service
//public class Service_requestServiceImpl implements Service_requestService{
//
//	@Autowired
//	private Service_requestRepo serviceRepo;

//	@Override
//	public List<ServiceDTO> getfetchRequest() {
//		
//		 List<ServiceDTO> serviceDTOList = new ArrayList<>();
//	     List<Service_request> serviceRequests = serviceRepo.findAll();
//
//	        for (Service_request serviceRequest : serviceRequests) {
//	            ServiceDTO serviceDTO = new ServiceDTO();
//	            serviceDTO.setRequest_type(serviceRequest.getRequest_type());
//	            
//	            List<Chequebook_request> cq = new ArrayList<Chequebook_request>();   
//	            List<Service_request> serviceRequests = serviceRepo.findAll();
//	      
//	        }
//
//       return serviceDTOList;
//	}
//}
