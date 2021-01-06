package com.sid.redis.redisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sid.redis.redisdemo.model.Person;
import com.sid.redis.redisdemo.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository personRepositoryimpl;
	
	@PostMapping(path = "/addPerson")
	private Person addPerson(@RequestBody Person person) {
		
		Person returnPerson = personRepositoryimpl.savePerson(person);
		
		return returnPerson;
	}
	
	
}
