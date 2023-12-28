package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.abcbank.model.Bill_pay_registration;

@Repository
public interface Bill_pay_registrationRepo extends JpaRepository<Bill_pay_registration, Integer>{

}
