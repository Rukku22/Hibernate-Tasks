package com.hirarchy.Hirarchymap;
import org.hibernate.Session;    

import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  

public class Storedata {    
	public static void main(String[] args) {    
	      
	    
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction t = session.beginTransaction();
	            
	    Employee e1=new Employee();  
	    e1.setId(21);
	    e1.setName("prabha");    
	        
	    Regularemployee e2=new Regularemployee();    
	    e2.setName("kohli");    
	    e2.setSalary(50000);    
	    e2.setBonus(5);    
	        
	    Contract_Employee e3=new Contract_Employee();    
	    e3.setName("Arjun ");    
	    e3.setPrice(1000);    
	    e3.setContract("15 hours");    
	        
	    session.save(e1);    
	    session.save(e2);    
	    session.save(e3);    
	        
	    t.commit();    
	    session.close();    
	    System.out.println("success");    
	}    
	}    
