
/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is DBUtil class which stored all data
*/
package com.cg.saloon.util;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class DBUtil {

	static EntityManager em;
	public static EntityManager getConnection() {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("saloon");
		  em=emf.createEntityManager();
		 em.getTransaction().begin();
		return em;
	}
}
