package com.malabargold.router.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.malabargold.router.entities.Person;

public class PersonDAO {
	private SessionFactory sessionFactory;	
	
	

	protected Session getSession() {
	  return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void savePerson(Person person) {
		Session session = getSession();
		Transaction trans=session.beginTransaction();		
		getSession().persist(person);
		trans.commit();
	}

}
