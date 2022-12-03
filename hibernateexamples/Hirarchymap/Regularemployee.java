package com.hirarchy.Hirarchymap;

import javax.persistence.Entity;

@Entity
public class Regularemployee extends Employee {
	private float salary;  
	private int bonus;
	 
	public float getSalary() {
		return salary;
	}
	 
	public void setSalary(float salary) {
		this.salary = salary;
	}
	 
	public int getBonus() {
		return bonus;
	}
	 
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}  

}
