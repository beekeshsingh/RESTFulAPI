package com.glaucus.api.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.glaucus.api.exception.DataNotFoundException;
import com.glaucus.api.model.Employee;
import com.hibernate.utility.HibernateUtil;

public class EmployeeServices {

	 
	public Session beginSession() throws HibernateException {
		// Create session factory object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		return session;
	}

	public Employee addEmployee(Employee employee) {
		Session session = beginSession();
		session.save(employee);
		session.getTransaction().commit();
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		Session session = beginSession();
		session.update(employee);
		session.getTransaction().commit();
		return employee;
	}

	public List<Employee> getAllEmployee() {
		Session session = beginSession();
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.list();
		session.getTransaction().commit();
		return employees;
	}

	public Employee getEmployee(long id) {
		Employee employee;
		Session session = beginSession();
        String queryString = "from Employee where ID = :id";
        Query query = session.createQuery(queryString);
        query.setLong("id", id);
        employee = (Employee) query.uniqueResult(); 
        if (employee == null) {
        	throw new DataNotFoundException("Employee with id "+id+" not found!");
		}
        
		session.getTransaction().commit();
		return employee;
	}

	public String deleteEmployee(long id) {
		Session session = beginSession();
		String hql = "delete from Employee where ID = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		int rowsAffected = query.executeUpdate();
		if (rowsAffected == 0) {
			System.out.println("Deleted " + rowsAffected + " rows.");
			return Boolean.FALSE.toString();
		}
		session.getTransaction().commit();
		return Boolean.TRUE.toString();
	}

	public String countEmployee() {
		int count = 0;
		Session session = beginSession();
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.list();
		for (Employee employee : employees) {
			count++;
		}
		String total = Integer.toString(count);
		session.getTransaction().commit();
		return total;
	}
}
