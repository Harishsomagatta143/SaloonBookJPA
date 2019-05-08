
/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is saloonserviceimpl class which implements bussiness logic
*/

package com.cg.saloon.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cg.saloon.dao.SaloonDao;
import com.cg.saloon.dao.SaloonDaoImpl;
import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;

public class SaloonServiceImpl implements SaloonService {
	//static int cust_id=1;
	SaloonDao dao;
public SaloonServiceImpl() {
	dao=new SaloonDaoImpl();
}
public Saloon addSaloon(Saloon sal) throws SaloonNotFoundException {
	  
	return dao.save(sal);
}

public List<Saloon> searchByName(String name) throws SaloonNotFoundException {
	
	return dao.findByName(name);
}
public Saloon assignCustomer(String name, Customer customer) throws SaloonNotFoundException {
	List<Saloon> saloon=dao.findByName(name);
	//customer.setId(cust_id++);
	for (Saloon saloon2 : saloon) {
		if(saloon2.getName().equals(name)) {
			
		List<Customer> customerList=saloon2.getCustomerList();
		customerList.add(customer);
		saloon2.setCustomerList(customerList);
		return saloon2;}}
	if(saloon.isEmpty())
		throw new SaloonNotFoundException("saloon not found exception");
	
	return null;
}	

}
