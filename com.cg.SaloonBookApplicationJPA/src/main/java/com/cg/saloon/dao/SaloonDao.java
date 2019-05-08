
/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is saloondao interface where put methods
*/
package com.cg.saloon.dao;

import java.util.List;

import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;

public interface SaloonDao {

	public Saloon save(Saloon sal) throws SaloonNotFoundException ;
	public List<Saloon> findByName(String name) ;
}
