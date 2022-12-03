package Mapping;

public class Orders {
	 private long id;
	 private String title;
	 private String description;
	 private Customer customer;
	  public Orders() {
	    }
	 
	    public Orders(String title, String description,long id, Customer customer)
	           {
	        this.title = title;
	        this.description = description;
	       this.id=id;
	       this.customer=customer;
	    }

		 
		public long getId() {
			return id;
		}
 
		public void setId(long id) {
			this.id = id;
		}
 
		public String getName() {
			return title;
		}
 
		public void setName(String name) {
			this.title = name;
		}

		 
		public String getDescription() {
			return description;
		}

	 
		public void setDescription(String description) {
			this.description = description;
		}
	    
}
