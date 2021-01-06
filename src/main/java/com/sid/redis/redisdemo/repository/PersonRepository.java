package com.sid.redis.redisdemo.repository;

import com.sid.redis.redisdemo.model.Person;

public interface PersonRepository {

	public Person savePerson(Person person);
	
}
