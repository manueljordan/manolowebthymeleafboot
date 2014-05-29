package com.manuel.jordan.model.service;

import java.util.Set;

import com.manuel.jordan.domain.Person;

/**
 * <p>Business Methods for the Service.</p>
 *
 * @author Manuel Jordan - dr_pompeii
 *
 */
public interface PersonService {

	void insertPerson(Person person);
	
	Person getPersonById(String id);
	Set<Person> getAllPerson();
	
	Person updatePerson(Person person);
	
	void deletePersonById(String id);
	
}
