package com.crud.New1;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javatpoint.mypackage.Book;

public class Read1 {

	public static void main(String[] args) {
		  Configuration con=new Configuration().configure();
		   SessionFactory sessionFactory = con.buildSessionFactory();
		   Session session = sessionFactory.openSession();
		   session.beginTransaction();
		   long rollno=100;
		    Book book = session.get(Book.class,rollno);
		 
		    System.out.println("rollno: " + book.getRollno());
		     System.out.println("name: " + book.getName());
		     System.out.println("group: " +book.getGroup());
 		    session.close();
	}
}
