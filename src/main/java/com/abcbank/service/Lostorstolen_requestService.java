package com.abcbank.service;

import org.springframework.stereotype.Service;

@Service
public interface Lostorstolen_requestService {

	public Object getalldetails();

	public Object getById(int lost_stolen_request_id);


}
