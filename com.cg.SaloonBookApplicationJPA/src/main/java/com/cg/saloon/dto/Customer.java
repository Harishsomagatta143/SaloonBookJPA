
/*@Author hsomagat
*Project name:SaloonBookApplication
*  This customer class where set customer details
*/
package com.cg.saloon.dto;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Customer")
public class Customer {
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private int id ;
	@Column(name="customer_name")
	private String name ;
	@Column(name="emailid")
	private String emailId ;
	@Column(name="mobilenumber")
	private BigInteger mobileNumber ;
	public Customer(String name, String emailId, BigInteger mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public BigInteger getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	public void setCustomerList(List<Customer> myList1) {
		
	}

	
	
}
