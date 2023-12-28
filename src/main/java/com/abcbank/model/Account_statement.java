package com.abcbank.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Account_statement")
public class Account_statement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int account_statement_id;
	@Column(name="date", nullable=false)
 private Date date;
	@Column(name="description",length=30,nullable=false)
 private String description;
	@Column(name="credit_amount",nullable = false)
 private double credit_amount;
	@Column(name="debit_amount",nullable = false)
	 private double debit_amount;
	@Column(name="cheque_ref_no",length = 7,nullable = false)
 private String cheque_ref_no;
	@Column(name="closing_balance",nullable = false)
 private double closing_balance;
	public int getAccount_statement_id() {
		return account_statement_id;
	}
	public void setAccount_statement_id(int account_statement_id) {
		this.account_statement_id = account_statement_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCredit_amount() {
		return credit_amount;
	}
	public void setCredit_amount(double credit_amount) {
		this.credit_amount = credit_amount;
	}
	public double getDebit_amount() {
		return debit_amount;
	}
	public void setDebit_amount(double debit_amount) {
		this.debit_amount = debit_amount;
	}
	public String getCheque_ref_no() {
		return cheque_ref_no;
	}
	public void setCheque_ref_no(String cheque_ref_no) {
		this.cheque_ref_no = cheque_ref_no;
	}
	public double getClosing_balance() {
		return closing_balance;
	}
	public void setClosing_balance(double closing_balance) {
		this.closing_balance = closing_balance;
	}
 
}
