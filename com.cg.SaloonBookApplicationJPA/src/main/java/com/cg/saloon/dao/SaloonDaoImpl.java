
/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is saloondaoimpl class
*/
package com.cg.saloon.dao;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;
import com.cg.saloon.util.DBUtil;

public class SaloonDaoImpl implements SaloonDao{

	EntityManager em=null;


	public Saloon save(Saloon sal) {
		em=DBUtil.getConnection();
		em.persist(sal);
		em.getTransaction().commit();

		return sal;
		

	}
		public List<Saloon> findByName(String name) {
			em=DBUtil.getConnection();
		
			List<Saloon> myList = new ArrayList<Saloon>();
			Saloon sal=new Saloon();
			//Getting saloon details based on name
			String qu ="select s from Saloon s where name=?";
			TypedQuery<Saloon> query=em.createQuery(qu,Saloon.class);
		
			query.setParameter(1, name);
		
			myList = query.getResultList();
			System.out.println("asdfgh"+myList);
			//myList.add(sal);
			return myList;
		}
		
}
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	
////		Connection conn=DBUtil.getConnection();
//		
//		/*try {
//			Connection connection = null;
//			pstm = connection.prepareStatement("INSERT INTO address (city,state,postalcode) VALUES (?,?,?)");
//			int addressId = 0;
//			
//				pstm.setString(1, sal.getAddress().getCity());
//				pstm.setString(2, sal.getAddress().getState());
//				pstm.setLong(3, sal.getAddress().getPostalcode());
//				pstm.executeUpdate();
//
//				pstm = connection.prepareStatement("select max(address_id) from address");
//				ResultSet result = pstm.executeQuery();
//				if (result.next()) {
//					addressId = result.getInt(1);
//				}			
//			int saloonId = 0;
//			try {
//				
//				pstm = connection.prepareStatement("INSERT INTO saloon(name,address_id) VALUES (?,?)");
//				pstm.setString(1,sal.getName());
//				pstm.setInt(2,addressId);
//				pstm.executeUpdate();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		} catch (SQLException e) {
//
//		}
//		
//		return sal;
//		
//	}*/
//	
////		try {
//		// TODO Auto-generated method stub
////		PreparedStatement pstm = conn.prepareStatement("insert into address (city,state,postalcode)VALUES (?,?,?)");
//		//System.out.println(sal);
////		int addressId=0;
//		try {
//			pstm.setString(1,sal.getAddress().getCity());
//			pstm.setString(1,sal.getAddress().getState());
//			pstm.setLong(1,sal.getAddress().getPostalcode());
//			pstm.executeUpdate();
//			/*pstm=conn.prepareStatement("select max(id) from address");
//			ResultSet result=pstm.executeQuery();
//			if(result.next()) {
//				addressId=result.getInt(1);*/
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			
//		}
//		/*try (PreparedStatement pstm1=Connection.prepareStatement
//				("INSERT INTO saloon(saloon_id,saloon_name,saloon_address,saloon_phonenumber,address_id)VALUES(?,?,?,?,?)")){
//			pstm1.setInt(1, sal.getId());
//			pstm1.setString(2, sal.getString());
//			pstm1.setString(3, sal.getString());
//			pstm1.setString(4, sal.getPhoneNumber().toString());
//			pstm1.setInt(5, addressId());
//			pstm1.executeUpdate();
//		}
//		int saloonId=0;
//		try {
//			pstm=Connection.prepareStatement("select max(saloon_id) from saloon");
//		
//		ResultSet result=pstm.executeQuery();
//		if(result.next()) {
//			saloonId=result.getInt(1);
//		
//		}
//		pstm=Connection.prepareStatement
//				("INSERT INTO customer(customer_id,customer_name,customer_emailid,customer_mobilenumber,saloon_id)VALUES(?,?,?,?,?)");
//		for(Customer customers : saloon.getCustomer()) {
//			pstm.setInt(1, customers.getId());
//			pstm.setString(2, customers.getName());
//			pstm.setString(3, customers.getEmailId());
//			pstm.setString(4, customers.getMobileNumber().toString());
//			pstm.setInt(5, saloonId());
//			pstm.executeUpdate();
//		}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return conn;
//		
////			DBUtil.sal.add(sal);
////			DBUtil.sal.add(sal);
////			DBUtil.sal.add(sal);
////			DBUtil.sal.add(sal);
////		DBUtil.sal.add(sal);
////		 return sal;
//			*/
//	
//
//	@Override
//	public List<Saloon> findByName(String name) {
//		List<Saloon> saloonList = new ArrayList<>();
//		for (Saloon saloon :DBUtil.sal) {
//			if(saloon.getName().equals(name))
//			{
//				saloonList.add(saloon);
//		}
//		
//	}
//		return saloonList;
//	
//	}
//	private int saloonId() {
//	// TODO Auto-generated method stub
//	return 0;
//}
//	private int addressId() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}
//
//

