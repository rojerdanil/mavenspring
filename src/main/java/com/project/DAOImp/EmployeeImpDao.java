package com.project.DAOImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.DAO.EmployeeDAO;
import com.project.module.EmployeeTest;
import org.hibernate.Session;  
@Service
public class EmployeeImpDao implements EmployeeDAO {
	
	
    
	private SessionFactory sessionFactory;  
	EmployeeImpDao(SessionFactory sessionf)
	{
		this.sessionFactory=sessionf;
	}
	
	
	public void addEmployee(EmployeeTest emp) {
		// TODO Auto-generated method stub
		  
		
	}
	
	

	public void updateEmpoyee(EmployeeTest emp) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<EmployeeTest> getEmployeeList() {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.getCurrentSession();
		List<EmployeeTest> ls=session.createQuery("from EmployeeTest").list();
		
		session.close(); 
		  return ls;
	}

	public List<EmployeeTest> getEmployeeListById() {
		// TODO Auto-generated method stub
		return null;
	}

}
