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
@Table(name = "Account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number")
	private BigInteger account_number;
	
	@Column(name = "account_type", length = 7,nullable= false)
	private String account_type;
	
	@Column(name = "account_balance",nullable= false)
	private double account_balance;
	
	@Column(name = "branch_name",length = 45,nullable= false)
	private String branch_name;
	
	@Column(name = "ifsc_code",length = 11,nullable= false)
	private String ifsc_code;

	public BigInteger getAccount_number() {
		return account_number;
	}
	
// RelationShip Start for Account - Account_statement............
	
	@OneToMany(mappedBy = "account",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Account_statement> accountStatement = new ArrayList<Account_statement>();
		
		public List<Account_statement> getAccountStatement() {
		return accountStatement;
	}
	
	public void setAccountStatement(List<Account_statement> accountStatement) {
		this.accountStatement = accountStatement;
	}
// End for Account - Account-statement............	
	
// Start for Account - Service_request............	
	@OneToMany(mappedBy = "accountService",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Service_request> service_requests = new ArrayList<Service_request>();

	public List<Service_request> getService_requests() {
		return service_requests;
	}

	public void setService_requests(List<Service_request> service_requests) {
		this.service_requests = service_requests;
	}
// End for Account - Service_request............	
	
// Start for Account - cheque_request............	
		@OneToMany(mappedBy = "accountforCheque",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
		private List<Chequebook_request> cb  = new ArrayList<Chequebook_request>();

		public List<Chequebook_request> getCb() {
			return cb;
		}

		public void setCb(List<Chequebook_request> cb) {
			this.cb = cb;
		}	
// End for Account - cheque_request........
// start account to customer
		@ManyToOne
		@JoinColumn(name = "customer_id")

	private Customer customer;
		
	public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
//end account to customer
//start account - credit or debit 
	@OneToMany(mappedBy = "accountCreditordebit",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Creditordebit_request> crde = new ArrayList<Creditordebit_request>();
		
    public List<Creditordebit_request> getCrde() {
		return crde;
	}

	public void setCrde(List<Creditordebit_request> crde) {
		this.crde = crde;
	}
// end account - credit or debit /
//start account - lost or stolen 
	@OneToMany(mappedBy = "accountlost",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Lostorstolen_request> lost = new ArrayList<Lostorstolen_request>();
	
	public List<Lostorstolen_request> getLost() {
		return lost;
	}

	public void setLost(List<Lostorstolen_request> lost) {
		this.lost = lost;
	}
//end 
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
