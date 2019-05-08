
/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is saloon class where set saloon details
*/
package com.cg.saloon.dto;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cg.saloon.dto.Saloon;
@Entity
@Table(name="saloon")
public class Saloon {
	@Id
	@GeneratedValue
	@Column(name="saloon_id")
	private int id;
	@Column(name="saloon_name")
	private String name;

	@Column(name="phonenumber")
	private BigInteger phoneNumber; 
	@OneToMany(cascade=CascadeType.ALL )
	@JoinColumn(name="saloon_id")
	private  List<Customer> customerList;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address; 
	public Saloon(String name, Address address, BigInteger phoneNumber,List<Customer> customerList) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.customerList = customerList;
	}

	public Saloon() {

	}

	public Saloon(int saloonId, String name2, String address2, String phnumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	@Override
	public String toString() {
		return "Saloon [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ",customerList=" + customerList + "]";
	}
	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
