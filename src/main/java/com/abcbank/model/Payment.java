package com.abcbank.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
@Table(name = "Payment")
public class Payment {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int pay_request_id;
	    @Column(name = "bill_amount", nullable = false)
	    private double bill_amount;
	    @Column(name = "payment_date", nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date payment_date;
	    @Column(name = "payment_due_date", nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date payment_due_date;    
	    @Column(name = "payment_status", nullable = false)
	    private String payment_status;
	    @Column(name = "remark", nullable = false)
	    private String remark;
	    
	    @ManyToOne
	    @JoinColumn(name="biller_id" ,insertable=false,updatable = false)
	    private Biller_menu biller_menu;
	    
		public Biller_menu getBiller_menu() {
			return biller_menu;
		}
		public void setBiller_menu(Biller_menu biller_menu) {
			this.biller_menu = biller_menu;
		}
		public int getPay_request_id() {
			return pay_request_id;
		}
		public void setPay_request_id(int pay_request_id) {
			this.pay_request_id = pay_request_id;
		}
		public double getBill_amount() {
			return bill_amount;
		}
		public void setBill_amount(double bill_amount) {
			this.bill_amount = bill_amount;
		}
		public Date getPayment_date() {
			return payment_date;
		}
		public void setPayment_date(Date payment_date) {
			this.payment_date = payment_date;
		}
		public Date getPayment_due_date() {
			return payment_due_date;
		}
		public void setPayment_due_date(Date payment_due_date) {
			this.payment_due_date = payment_due_date;
		}
		public String getPayement_status() {
			return payment_status;
		}
		public void setPayement_status(String payement_status) {
			this.payment_status = payement_status;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
	    
}
