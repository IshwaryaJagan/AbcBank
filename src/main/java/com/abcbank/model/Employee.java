package com.abcbank.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int employee_id;
	    @Column(name = "password", length = 25, nullable = false)
	    private String password;
	    @Column(name = "username", length = 25, nullable = false)
	    private String username;
		public int getEmployee_id() {
			return employee_id;
		}
		public void setEmployee_id(int employee_id) {
			this.employee_id = employee_id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}

	
}
