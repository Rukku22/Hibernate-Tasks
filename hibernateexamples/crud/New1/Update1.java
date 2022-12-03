package com.crud.New1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javatpoint.mypackage.Book;
public class Update1 {
public static void main(String[] args) {
		   Book student = new Book();
		  student.setRollno(100);
		  student.setName("ruk");
		  student.setGroup("mpc");
		  Configuration con=new Configuration().configure();
		   SessionFactory sessionFactory = con.buildSessionFactory();
		   Session session = sessionFactory.openSession();
		   session.beginTransaction();
		  
		  session.update(student);
 		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();
	}

}
