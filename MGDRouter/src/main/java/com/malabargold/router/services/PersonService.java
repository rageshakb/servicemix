package com.malabargold.router.services;

import com.malabargold.router.dao.PersonDAO;
import com.malabargold.router.entities.Person;

public class PersonService {
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	public void savePerson(Person person) {
		personDAO.savePerson(person);
	}
	

}
