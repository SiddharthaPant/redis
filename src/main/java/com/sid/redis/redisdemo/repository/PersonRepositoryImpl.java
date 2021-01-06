package com.sid.redis.redisdemo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.sid.redis.redisdemo.model.Person;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

	@Autowired
	private RedisTemplate<String, Person> redisTemplate;

	@Override
	public Person savePerson(Person person) {

		redisTemplate.opsForHash().put("Person", person.getId(), person);
		Person returnPerson = (Person) redisTemplate.opsForHash().get("Person", person.getId());
		return returnPerson;
	}

}
