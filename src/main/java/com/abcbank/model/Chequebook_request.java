package com.abcbank.model;

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
@Table(name = "Chequebook_request")
public class Chequebook_request {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="chequebook_request_id")
	private int chequebook_request_id;

	@Column(name="number_of_cheque_leaves",length = 3,nullable = false)
	private String number_of_cheque_leaves;

	@Temporal(TemporalType.DATE)
	@Column(name="request_date",nullable = false)
	private Date request_date;

	@Temporal(TemporalType.DATE)
	@Column(name="response_date",nullable = false)
	private Date response_date;

	@Column(name="response_message",length = 75,nullable = false)
	private String response_message;

	@Column(name="request_message",length = 75,nullable = false)
	private String request_message;

	@Column(name="response_status",length = 10,nullable = false)
	private String response_status;

	@Column(name="service_request_id",nullable = false)
	private int service_request_id;

	@Column(name="process_id",nullable = false)
	private int process_id;

	@Column(name="css_request_id",nullable = false)
	private int css_request_id;
	
// start account to chequebook.....
	 @ManyToOne
	 @JoinColumn(name = "account_number") // Adjust the column name accordingly
	    private Account accountforCheque;
	
	 public Account getAccountforCheque() {
		return accountforCheque;
	}

	public void setAccountforCheque(Account accountforCheque) {
		this.accountforCheque = accountforCheque;
	}

//start Checkbook Request to service Request.....
	@ManyToOne
	@JoinColumn(name = "service_request_id",insertable = false, updatable = false)
	private Service_request serviceChequebook;

	public Service_request getServiceChequebook() {
		return serviceChequebook;
	}

	public void setServiceChequebook(Service_request serviceChequebook) {
		this.serviceChequebook = serviceChequebook;
	}
//end Checkbook Request to service Request.....

	public int getChequebook_request_id() {
		return chequebook_request_id;
	}

	public void setChequebook_request_id(int chequebook_request_id) {
		this.chequebook_request_id = chequebook_request_id;
	}

	public String getNumber_of_cheque_leaves() {
		return number_of_cheque_leaves;
	}

	public void setNumber_of_cheque_leaves(String number_of_cheque_leaves) {
		this.number_of_cheque_leaves = number_of_cheque_leaves;
	}

	public Date getRequest_date() {
		return request_date;
	}

	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}

	public Date getResponse_date() {
		return response_date;
	}

	public void setResponse_date(Date response_date) {
		this.response_date = response_date;
	}

	public String getResponse_message() {
		return response_message;
	}

	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}
	
	public String getRequest_message() {
		return request_message;
	}

	public void setRequest_message(String request_message) {
		this.request_message = request_message;
	}

	public String getResponse_status() {
		return response_status;
	}

	public void setResponse_status(String response_status) {
		this.response_status = response_status;
	}

	public int getService_request_id() {
		return service_request_id;
	}

	public void setService_request_id(int service_request_id) {
		this.service_request_id = service_request_id;
	}

	public int getProcess_id() {
		return process_id;
	}

	public void setProcess_id(int process_id) {
		this.process_id = process_id;
	}

	public int getCss_request_id() {
		return css_request_id;
	}

	public void setCss_request_id(int css_request_id) {
		this.css_request_id = css_request_id;
	}

}
