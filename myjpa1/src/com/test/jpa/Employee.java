package com.test.jpa;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Table
@NamedQuery(query = "Select e from Employee e where e.eid = :id", name = "find employee by id")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int eid;
	
	private String ename;
	private double salary;
	private String deg;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}   
	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}   
	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}   
	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}   
	public String getDeg() {
		return this.deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}
	 @Override
	   public String toString() {
	      return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
	   }
   
}
