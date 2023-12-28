package com.abcbank.service;

import org.springframework.stereotype.Service;

import com.abcbank.DTO.CreditorDebitDTO;

@Service
public interface Creditordebit_requestService {

	public Object getAlldetails();

	public Object getById(int credit_debit_request_id);

	public Object updateById(CreditorDebitDTO cbDTO);


	

}
