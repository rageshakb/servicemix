package com.malabargold.router.handlers;

import org.apache.camel.Exchange;

import com.malabargold.router.entities.Person;
import com.malabargold.router.services.PersonService;

public class RegistrationHandler {
	private PersonService personService;
	
	
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}



	public void register(Exchange exchange) throws Exception {
        // Grab the booked header value
        //String bookId = (String) exchange.getIn().getHeader("bookid");
		Person p = new Person("Ragesh" );
		personService.savePerson(p);
        // send a html response
        exchange.getOut().setBody("<html><body>Book " + 1 + " is Camel in Action.</body></html>");
    }

}
