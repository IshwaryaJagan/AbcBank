package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.Service_request;

@Repository
public interface Service_requestRepo extends JpaRepository<Service_request, Integer>{

	
}
