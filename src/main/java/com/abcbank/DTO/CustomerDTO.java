package com.abcbank.DTO;

public class CustomerDTO {
		private int id;
	 	public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		private String door_street;
	    private String city;
	    private String pincode;
	    private String email;
		
		public String getDoor_street() {
			return door_street;
		}
		public void setDoor_street(String door_street) {
			this.door_street = door_street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	 
 	 
}
