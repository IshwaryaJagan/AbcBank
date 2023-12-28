package com.abcbank.model;

import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Lostorstolen_request")
public class Lostorstolen_request {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lost_stolen_request_id")
	private int lost_stolen_request_id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "request_date", nullable= false)
	private Date request_date;
	
	@Column(name = "response_message",length = 75, nullable= false)
	private String response_message;
	
	@Column(name = "response_status",length = 10, nullable= false)
	private String response_status;
	
	@Column(name = "process_id", nullable= false)
	private int process_id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "stolen_date", nullable= false)
	private Date stolen_date;
	
	@Column(name = "service_request_id", nullable= false)
	private int service_request_id;
	
	@Column(name = "card_number",length = 16, nullable= false)
	private BigInteger card_number;
	
	@Column(name = "card_type",length = 10, nullable= false)
	private String card_type;
	
	@Column(name = "request_message",length = 75, nullable= false)
	private String request_message;
//start lost or stolen - account 
	@ManyToOne
	 @JoinColumn(name = "account_number") // Adjust the column name accordingly
	    private Account accountlost;
	
	public Account getAccountlost() {
		return accountlost;
	}

	public void setAccountlost(Account accountlost) {
		this.accountlost = accountlost;
	}
//end lost or stolen - account 
	//start LostorStolen Request to service Request.....
	@ManyToOne
	@JoinColumn(name = "service_request_id",insertable = false, updatable = false)
	private Service_request serviceLostorstolen;
	
	public Service_request getServiceLostorstolen() {
			return serviceLostorstolen;
		}

	public void setServiceLostorstolen(Service_request serviceLostorstolen) {
			this.serviceLostorstolen = serviceLostorstolen;
		}
//end LostorStolen Request to service Request.....

	
	public int getLost_stolen_request_id() {
		return lost_stolen_request_id;
	}

	public void setLost_stolen_request_id(int lost_stolen_request_id) {
		this.lost_stolen_request_id = lost_stolen_request_id;
	}

	public Date getRequest_date() {
		return request_date;
	}

	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}

	public String getResponse_message() {
		return response_message;
	}

	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}

	public String getResponse_status() {
		return response_status;
	}

	public void setResponse_status(String response_status) {
		this.response_status = response_status;
	}

	public int getProcess_id() {
		return process_id;
	}

	public void setProcess_id(int process_id) {
		this.process_id = process_id;
	}

	public Date getStolen_date() {
		return stolen_date;
	}

	public void setStolen_date(Date stolen_date) {
		this.stolen_date = stolen_date;
	}

	public int getService_request_id() {
		return service_request_id;
	}

	public void setService_request_id(int service_request_id) {
		this.service_request_id = service_request_id;
	}

	public BigInteger getCard_number() {
		return card_number;
	}

	public void setCard_number(BigInteger card_number) {
		this.card_number = card_number;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getRequest_message() {
		return request_message;
	}

	public void setRequest_message(String request_message) {
		this.request_message = request_message;
	}
}
