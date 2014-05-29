package com.manuel.jordan.model.repository.jdbc.support;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.manuel.jordan.domain.Person;

/**
 * <p>Custom RowMapper implementation for the Person Domain class.</p>
 *
 * @author Manuel Jordan - dr_pompeii
 *
 */
public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Person person = new Person();
		
		person.setId(rs.getString("id"));
		person.setFirstName(rs.getString("firstname"));
		person.setLastName(rs.getString("lastname"));
		
		return person;
		
	}

}
