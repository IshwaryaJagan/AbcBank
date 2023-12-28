package com.abcbank.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Biller_menu")
public class Biller_menu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int biller_id;
	@Column(name = "biller_account_no", nullable = false)
	private BigInteger biller_account_no;
	@Column(name = "biller_ifsc_code", length = 20, nullable = false)
	private String biller_ifsc_code;
	@Column(name = "biller_name", length = 20, nullable = false)
	private String biller_name;
	@Column(name = "biller_acc_type", length = 20, nullable = false)
	private String biller_acc_type;
	@Column(name = "pay_now_status", length = 3, nullable = false)
	private String pay_now_status;
	@Column(name = "status", length = 8, nullable = false)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@ManyToOne
	@JoinColumn(name = "category_code")
	private Category category;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@OneToMany(mappedBy = "biller_menu", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Payment> list = new ArrayList<Payment>();
	
	public List<Payment> getList() {
		return list;
	}
	public void setList(List<Payment> list) {
		this.list = list;
	}
	public int getBiller_id() {
		return biller_id;
	}
	public void setBiller_id(int biller_id) {
		this.biller_id = biller_id;
	}
	public BigInteger getBiller_account_no() {
		return biller_account_no;
	}
	public void setBiller_account_no(BigInteger biller_account_no) {
		this.biller_account_no = biller_account_no;
	}
	public String getBiller_ifsc_code() {
		return biller_ifsc_code;
	}
	public void setBiller_ifsc_code(String biller_ifsc_code) {
		this.biller_ifsc_code = biller_ifsc_code;
	}
	public String getBiller_name() {
		return biller_name;
	}
	public void setBiller_name(String biller_name) {
		this.biller_name = biller_name;
	}
	public String getBiller_acc_type() {
		return biller_acc_type;
	}
	public void setBiller_acc_type(String biller_acc_type) {
		this.biller_acc_type = biller_acc_type;
	}
	public String getPay_now_status() {
		return pay_now_status;
	}
	public void setPay_now_status(String pay_now_status) {
		this.pay_now_status = pay_now_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
