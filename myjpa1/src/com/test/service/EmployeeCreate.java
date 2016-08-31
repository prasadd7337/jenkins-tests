package com.test.service;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.test.jpa.Employee;

public class EmployeeCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "myjpa1" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Employee employee = new Employee( ); 
	      employee.setEid( 1202 );
	      employee.setEname( "Buddy" );
	      employee.setSalary( 40000 );
	      employee.setDeg( "Technical Manager" );
	      
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );
	      Query query = entitymanager.createNamedQuery("find employee by id");
	      
	      query.setParameter("id", 1201);
	      List<Employee> list = query.getResultList( );
	      
	      for( Employee e:list ){
	         System.out.print("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee Name :" + e.getEname( ));
	      }
	      entitymanager.close( );
	      emfactory.close( );
	}

}
