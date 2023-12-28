package com.abcbank.service;

import com.abcbank.model.Chequebook_request;

public interface Chequebook_requestService {

	public Object getAllCards();
    public Object getcardById(int id);
//    public Object updateCard(Chequebook_request chequebookRequest);
    public Object saveCheque(Chequebook_request chequebookRequest);


}
