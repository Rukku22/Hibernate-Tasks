package Mapping;
import java.util.Set;
public class Customer {
	 private int id;
	 private String name;
	 private Set<Orders> order;
	 
	    public Customer() {
	    }
	 public Customer(String name) {
	        this.name = name;
	    }
	  
	public int getId() {
		return id;
	}
	 
	public void setId(int id) {
		this.id = id;
	}
	 
	public String getName() {
		return name;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	public void setOrders(Set<Orders> or) {
 		
	}
	 
 	 
	    
}
