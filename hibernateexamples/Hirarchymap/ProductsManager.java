package com.hirarchy.Hirarchymap;

 import java.util.List;
	 import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.service.ServiceRegistry;
 public class ProductsManager {
public static void main(String[] args) {
 	        Configuration con = new Configuration().configure("hibernate.cfg1.xml");
 	         
	        SessionFactory sessionFactory = con.buildSessionFactory();
	         
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	         
	        Product product = new Product();
	        product.setName("BENZ");
	        product.setDescription("Comfortable, fuel-saving car");
	        product.setPrice(20000);
	         
	        ProductDetail detail = new ProductDetail();
	        detail.setPartNumber("123456");
	        detail.setDimension("2,5m x 1,4m x 1,2m");
	        detail.setWeight(1000);
	        detail.setManufacturer("Honda Automobile");
	        detail.setOrigin("Japan");
	         
 	        product.setProductDetail(detail);
	        detail.setProduct(product);
	         
 	        session.save(product);
	        List<Product> l = session.createQuery("from Product").list();
	        for (Product a : l) {
	              a.getName();
	              a.getDescription();  
	              a.getPrice();
	          ProductDetail d = a.getProductDetail();
	            d.getPartNumber();
	            d.getDimension();
	            d.getWeight();
	             d.getManufacturer();
	            d.getOrigin();
	             
	            System.out.println(a);
	            System.out.println(d);
	        }
	         
	        session.getTransaction().commit();
	        session.close();       
	    }
}
