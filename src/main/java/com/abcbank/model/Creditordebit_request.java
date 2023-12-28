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

@Entity
@Table(name="Creditordebit_request")
public class Creditordebit_request{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="credit_debit_request_id")
	private int credit_debit_request_id;

	@Column(name="card_number",length=16,nullable=false)
	private BigInteger card_number;

	@Column(name="card_type",length=10,nullable=false)
	private String card_type;

	@Column(name="response_status",length=10,nullable=false)
	private String response_status;

	@Column(name="response_message",length=75,nullable=false)
	private String response_message;

	@Column(name="service_request_id",nullable=false)
	private int service_request_id;

	@Column(name="procees_id",nullable=false)
	private int procees_id;

	@Column(name="request_date",nullable=false)
	private Date request_date;

	@Column(name="request_message",length=75,nullable=false)
	private String request_message;

	@Column(name="response_date",nullable=false)
	private Date response_date;

	@Column(name="css_request_id",nullable=false)
	private int css_request_id;
//start Creditordebit to account.....
	 @ManyToOne
	 @JoinColumn(name = "account_number") // Adjust the column name accordingly
	    private Account accountCreditordebit;
	 
		 public Account getAccountCreditordebit() {
			return accountCreditordebit;
		 	}
	
		 public void setAccountCreditordebit(Account accountCreditordebit) {
			this.accountCreditordebit = accountCreditordebit;
			}
//start Creditordebit Request to service Request.....
	@ManyToOne
	@JoinColumn(name = "service_request_id",insertable = false, updatable = false)
    private Service_request serviceCreditordebit;
	
	public Service_request getServiceCreditordebit() {
		return serviceCreditordebit;
	}

	public void setServiceCreditordebit(Service_request serviceCreditordebit) {
		this.serviceCreditordebit = serviceCreditordebit;
	}
//end Creditordebit Request to service Request.....

	public int getCredit_debit_request_id() {
		return credit_debit_request_id;
	}

	public void setCredit_debit_request_id(int credit_debit_request_id) {
		this.credit_debit_request_id = credit_debit_request_id;
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

	public String getResponse_status() {
		return response_status;
	}

	public void setResponse_status(String response_status) {
		this.response_status = response_status;
	}

	public String getResponse_message() {
		return response_message;
	}

	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}
	
	public int getService_request_id() {
		return service_request_id;
	}

	public void setService_request_id(int service_request_id) {
		this.service_request_id = service_request_id;
	}

	public int getProcees_id() {
		return procees_id;
	}

	public void setProcees_id(int procees_id) {
		this.procees_id = procees_id;
	}

	public Date getRequest_date() {
		return request_date;
	}

	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}
	
	public String getRequest_message() {
		return request_message;
	}

	public void setRequest_message(String request_message) {
		this.request_message = request_message;
	}

	public Date getResponse_date() {
		return response_date;
	}

	public void setResponse_date(Date response_date) {
		this.response_date = response_date;
	}

	public int getCss_request_id() {
		return css_request_id;
	}

	public void setCss_request_id(int css_request_id) {
		this.css_request_id = css_request_id;
	}
}