package com.project.tester;

import com.project.module.EmployeeTest;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.transform.Transformers;  

public class HibernateTester {
	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	    //creating session object  
	    Session session=factory.openSession();  
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	    EmployeeTest e1=new EmployeeTest();  
	    e1.setId(115);  
	    e1.setName("rojer");
	    e1.setDept("mcas");
	    // session.persist(e1);//persisting the object  
	    //calling  stored procedure for getting employee details based on name 
	//   Query query = session.getNamedQuery("callEmpProcedure").setParameter("con", "rojer").setResultTransformer(Transformers.aliasToBean(EmployeeTest.class));
	   /* Query query = session.createSQLQuery(
	    		"CALL emp1(:con)").setParameter("con", "rojer");*/
	    /*  for(int i=0; i< query.list().size(); i++){
	     EmployeeTest et=(EmployeeTest)query.list().get(i);
	      System.out.println("name:"+et.getId());
	   
	    }*/
	  /*  Query query = session.getNamedQuery("callEmpProcedure").setParameter("con", "rojer").setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	    Map<String,Object> row = null;
	   
	    for (Object object : query.list()) {
	         row= (Map<String,Object>)object;
	         System.out.println("date_demande: " + row.get("name"));
	       
	    }*/
	    
	    //updating table
	   //  session.update(e1);
	    
	    //reading all values from table
	    List<EmployeeTest> ls=session.createQuery("from EmployeeTest").list();
	    for(EmployeeTest et:ls)
	    {
	    	System.out.println("name:"+et.getName());
	    	System.out.println("Depart:"+et.getDept());
	    	System.out.println("Id:"+et.getId());
	    }
	    
	    //reading values based on field
	    EmployeeTest ets=(EmployeeTest) session.load(EmployeeTest.class, new Integer(115));
	    System.out.println("load based on valus:"+ets.getName());
	   
	    t.commit();//transaction is commited  
	    session.close();  
	   System.out.println("successfully completed called procedure");  
	      
	}  
	}  


