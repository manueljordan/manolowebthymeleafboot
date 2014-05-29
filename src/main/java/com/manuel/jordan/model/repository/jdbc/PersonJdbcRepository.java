package com.manuel.jordan.model.repository.jdbc;

import java.util.Set;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.manuel.jordan.domain.Person;
import com.manuel.jordan.model.repository.PersonRepository;
import com.manuel.jordan.model.repository.jdbc.support.PersonRowMapper;
	   
/**
 * <p>Repository class working with a Persistent Mechanism.
 *    Exists a real interaction with a Database.</p>
 *
 * @author Manuel Jordan - dr_pompeii
 *
 */
@Transactional
@Repository("personRepository")
public class PersonJdbcRepository implements PersonRepository {

	private static final Logger logger = LoggerFactory.getLogger(PersonJdbcRepository.class);
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PersonJdbcRepository(JdbcTemplate jdbcTemplate){
		logger.info("PersonJdbcRepository arg constructor");
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void insertPerson(Person person) {
		String sql = "INSERT INTO person(id, firstName, lastName) VALUES(?, ?, ?)";
		this.jdbcTemplate.update(sql, person.getId(), person.getFirstName(), person.getLastName());	
	}

	@Override
	public Person getPersonById(String id) {
		String sql = "SELECT p.* FROM person p WHERE p.id=?";
		return this.jdbcTemplate.queryForObject(sql, new PersonRowMapper(), id); 
	}

	@Override
	public Set<Person> getAllPerson() {
		String sql = "SELECT p.* FROM person p";		
		return new LinkedHashSet<Person>(this.jdbcTemplate.query(sql, new PersonRowMapper()));
	}

	@Override
	public Person updatePerson(Person person) {
		String sql = "UPDATE person p SET p.firstname=?, p.lastname=? WHERE p.id=?";
		this.jdbcTemplate.update(sql, person.getFirstName(), person.getLastName(), person.getId());
		return person;
	}

	@Override
	public void deletePersonById(String id) {
		String sql = "DELETE FROM person WHERE id=?";
		jdbcTemplate.update(sql, id);
	}
	
}
