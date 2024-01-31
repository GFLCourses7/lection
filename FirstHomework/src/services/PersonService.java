package src.services;

import java.util.List;
import java.util.ArrayList;

import src.entities.Person;
import src.repositories.PersonRepository;


public class PersonService {
	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public List<Person> findAll() {
		return personRepository.findAll();
	}
}