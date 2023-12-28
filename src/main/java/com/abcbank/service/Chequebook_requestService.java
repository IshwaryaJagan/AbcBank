package com.abcbank.service;

import com.abcbank.DTO.ChequeDTO;
import com.abcbank.model.Chequebook_request;

public interface Chequebook_requestService {

	public Object getAllChequeBookRequest();

	public Object getChequeBookRequestid(int id);

	public Object updateById(ChequeDTO chequeBookRequest);

	
}
