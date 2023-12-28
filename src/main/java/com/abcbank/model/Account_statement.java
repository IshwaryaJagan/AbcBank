package com.abcbank.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account_statement")
public class Account_statement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int account_statement_id;
	@Column(name="DATE", nullable = false)
	private Date DATE;
	@Column(name="description", length = 30, nullable = false)
	private String description;
	@Column(name="credit_amount", nullable = false)
	private Double credit_amount;
	@Column(name="debit_amount", nullable = false)
	private Double debit_amount;
	@Column(name="cheque_ref_no", length = 7, nullable = false)
	private String cheque_ref_no;
	@Column(name="closing_balance", nullable = false)
	private Double closing_balance;
	
}
