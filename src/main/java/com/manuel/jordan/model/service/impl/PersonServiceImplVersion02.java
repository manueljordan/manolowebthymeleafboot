package com.manuel.jordan.model.service.impl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.manuel.jordan.domain.Person;
import com.manuel.jordan.model.service.PersonService;
import com.manuel.jordan.model.repository.PersonRepository;

/**
 * <p>Service class working with a Repository.</p>
 *
 * @author Manuel Jordan - dr_pompeii
 *
 */
@Transactional
@Service("personService02")
public class PersonServiceImplVersion02 implements PersonService {

	private static final Logger logger = LoggerFactory.getLogger(PersonServiceImplVersion02.class);
	
	private PersonRepository personRepository;
	
	public PersonServiceImplVersion02(){
		logger.info("PersonServiceImplVersion02 no-arg constructor");
	}
	
	@Autowired
	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public void insertPerson(Person person) {
		this.personRepository.insertPerson(person);
	}

	@Override
	public Person getPersonById(String id) {
		return this.personRepository.getPersonById(id);
	}

	@Override
	public Set<Person> getAllPerson() {
		return this.personRepository.getAllPerson();
	}

	@Override
	public Person updatePerson(Person person) {
		return this.personRepository.updatePerson(person);
	}

	@Override
	public void deletePersonById(String id) {
		this.personRepository.deletePersonById(id);
	}

}
