package com.abcbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.abcbank.DTO.CustomerDTO;
import com.abcbank.model.Creditordebit_request;
import com.abcbank.model.Customer;
import com.abcbank.repository.CustomerRepo;

import jakarta.transaction.Transactional;


public interface CustomerService {

	public Object validateUser(Customer customer);
	
	public Object getAllCustomer();

//	public Object updateCustomer(int customer_id, Customer cus);

	

//	public Object updatebyid(int customer_id, Customer cus);

//	public Object updatebyid(CustomerDTO customerDTO);

	//public Object Updatebyid(CustomerDTO customerDTO);

	public Object updateById(CustomerDTO customerDTO);

	
	
	
	

	
	
	

	


	
	
}






































//{

//	@Service
//	public class ProfileService {
//	    @Autowired
//	    private CustomerRepository customerRepository;
//
//	    public ResponseEntity<Customer> getMyProfile() {
//	        return customerRepository.findById(1)
//	                .map(ResponseEntity::ok)
//	                .orElse(ResponseEntity.notFound().build());
//	    }
//
//	    public ResponseEntity<Profile> updateMyProfile(@RequestBody Profile profile) {
//	        return profileRepository.findById(1)
//	                .map(record -> {
//	                    record.setDoorNumber(profile.getDoorNumber());
//	                    record.setStreet(profile.getStreet());
//	                    record.setCity(profile.getCity());
//	                    record.setPinCode(profile.getPinCode());
//	                    record.setEmail(profile.getEmail());
//	                    return ResponseEntity.ok().body(profileRepository.save(record));
//	                })
//	                .orElse(ResponseEntity.notFound().build());
//	    }
//	}
//	
//}

	
//	public Object getCustomer(CustomerService customerservice);
//	public Object updateCustomer(Customer customer);
	
	
	


//	public interface CustomerService {

//	    public static final CustomerRepo customerRepo = null;

//	    public static List<Customer> getAllCustomers() {
//	        return customerRepo.findAll();
//	    }
//
//	    public static Optional<Customer> getCustomerById(int id) {
//	        return customerRepo.findById(id);
//	    }
//
//	    public static Customer saveOrUpdateCustomer(Customer customer) {
//	        return customerRepo.save(customer);
//	    }
//
//	    public static  void deleteCustomer(int id) {
//	    	customerRepo.deleteById(id);
//	    }

//		public Object getCustomer(CustomerService customerservice);

//		public ResponseEntity<Customer> updateCustomer(Customer customer);
		
		
	




//@Service
//public class CustomerService {
//
//    private final CustomerRepo customerRepo;
//
//    @Autowired
//    public CustomerService(CustomerRepo customerRepo) {
//        this.customerRepo = customerRepo;
//    }
//
//    // ... other methods ...
//
//    @Transactional
//    public Customer updateCustomer(Integer id, Customer updatedCustomer) {
//        Customer existingCustomer = customerRepo.findById(id)
//            .orElseThrow(() -> new CustomerNotFoundException("Customer not found"));
//
//        if (existingCustomer.getCustomer_id().equals(updatedCustomer.getCustomer_id())) {
//            return customerRepo.save(updatedCustomer);
//        } else {
//            throw new ConcurrentModificationException("Concurrent modification detected");
//        }
//    }
//}


		
		


	
	
