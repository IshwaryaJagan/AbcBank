package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abcbank.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
