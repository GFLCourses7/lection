package src.repositories;

import java.util.List;
import java.util.ArrayList;

import src.entities.Person;

public class PersonRepository {
	private static Long COUNT = 0L;
	private List<Person> personList;
	
	{
		personList = new ArrayList<>();
		
		personList.add(new Person(++COUNT, "John", 28, "USA"));
		personList.add(new Person(++COUNT, "Tomas", 38, "Germany"));
		personList.add(new Person(++COUNT, "Dmytro", 30, "Ukraine"));
	}
	
	public List<Person> findAll() {
		return personList;
	}
}