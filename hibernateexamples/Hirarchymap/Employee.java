package com.hirarchy.Hirarchymap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp-Table")
public class Employee {  
@Id
private int lid;  
private String name;
 
public int getId() {
	return lid;
}
 
public void setId(int id) {
	this.lid = id;
}
 
public String getName() {
	return name;
}
 
public void setName(String name) {
	this.name = name;
}  
}
