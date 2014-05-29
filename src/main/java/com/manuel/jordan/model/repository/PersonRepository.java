package com.manuel.jordan.model.repository;

import java.util.Set;

import com.manuel.jordan.domain.Person;

/**
 * <p>Persistent Methods for the Repository.</p>
 *
 * @author Manuel Jordan - dr_pompeii
 *
 */
public interface PersonRepository {
	
	void insertPerson(Person person);
	
	Person getPersonById(String id);
	Set<Person> getAllPerson();
	
	Person updatePerson(Person person);
	
	void deletePersonById(String id);
	
}
