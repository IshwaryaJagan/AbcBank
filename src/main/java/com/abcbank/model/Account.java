package com.abcbank.model;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="account_number",nullable = false)
    private BigInteger account_number;
    
    @Column(name="account_type", length = 7, nullable = false)
    private String account_type;
    
    @Column(name="account_balance", nullable = false)
    private double account_balance;
    
    @Column(name="branch_name", length = 45, nullable = false)
    private String branch_name;
    
    @Column(name="ifsc_code", length = 11, nullable = false)
    private String ifsc_code;
    
    
    public BigInteger getAccount_number() {
		return account_number;
	}
	public void setAccount_number(BigInteger account_number) {
		this.account_number = account_number;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	
}
