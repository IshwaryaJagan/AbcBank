package com.abcbank.service;

import com.abcbank.model.Creditordebit_request;
import com.abcbank.model.Customer;

public interface Creditordebit_requestService {

	public Object saveCreditordebit(Creditordebit_request creditordebit_request);

	public Object getAllCreditordebit_request();


	public Object getbyid(int cDid);

	//public Object updatebyid(int credit_debit_request_id, Creditordebit_request cord);



	

}
