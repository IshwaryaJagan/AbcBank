package com.abcbank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Service_request")
public class Service_request {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="service_request_id",nullable = false)
	private int service_request_id;
	
	@Column(name="request_type",length = 45,nullable = false)
	private String request_type;
	
	public int getService_request_id() {
		return service_request_id;
	}

	public void setService_request_id(int service_request_id) {
		this.service_request_id = service_request_id;
	}

	public String getRequest_type() {
		return request_type;
	}

	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}

	

}
