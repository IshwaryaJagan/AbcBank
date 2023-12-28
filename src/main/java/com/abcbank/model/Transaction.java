package com.abcbank.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "transaction_status", nullable = false)
    private int transaction_status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTransaction_status() {
		return transaction_status;
	}
	public void setTransaction_status(int transaction_status) {
		this.transaction_status = transaction_status;
	}
    
    
}
