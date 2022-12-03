package Mapping;
import java.util.HashSet;
import java.util.Set;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
   
public class Storedata {
	  public static void main(String[] args) {
	        Configuration con = new Configuration();
	        con.configure("hibernate.cfg.xml");
	        SessionFactory sessionFactory = con.buildSessionFactory();
	         Session session = sessionFactory.openSession();
	        Transaction transaction=session.beginTransaction();
	 
	        Customer c = new Customer("mani");
	        Orders one = new Orders("pac1","powder",1,c);
	        Orders two = new Orders("pac2","powder1",2,c);
 	       Set<Orders> or = new HashSet<Orders>();
 	        or.add(one);
	        or.add(two);
	        c.setOrders(or);
	        session.save(c);
	        transaction.commit();
	        System.out.print("success");
	        session.close();
	    }
}
