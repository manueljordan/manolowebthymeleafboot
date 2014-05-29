package com.manuel.jordan.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Simple Domain class.</p>
 *
 * @author Manuel Jordan - dr_pompeii
 *
 */
public class Person {

	private static final Logger logger = LoggerFactory.getLogger(Person.class);
	
	private String id;
	private String firstName;
	private String lastName;

	public Person(){
		logger.info("Person no-arg constructor");
	}

	public Person(String id, String firstName, String lastName) {
		super();
		logger.info("Person arg constructor");
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append("]");
		return builder.toString();
	}

}
