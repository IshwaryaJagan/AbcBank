package com.abcbank.service;

import org.springframework.stereotype.Service;

import com.abcbank.DTO.StolenDTO;

@Service
public interface Lostorstolen_requestService {

	public Object getalldetails();

	public Object getById(int lost_stolen_request_id);

	public Object updateById(StolenDTO dto);


}
