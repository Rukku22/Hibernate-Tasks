package com.crud.New1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javatpoint.mypackage.Book;
public class Delete1 {
public static void main(String[] args) 
{
		   Configuration con=new Configuration().configure();
		   SessionFactory sessionFactory = con.buildSessionFactory();
		   Session session = sessionFactory.openSession();
		   session.beginTransaction();
		  Book book = new Book();
		   book.setRollno(100);
		 session.delete(book);
		 session.getTransaction().commit();
		    session.close();
		 }
 	}


