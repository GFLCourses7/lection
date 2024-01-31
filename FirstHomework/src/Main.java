package src;

import src.repositories.PersonRepository;
import src.services.PersonService;

public class Main {
	public static void main(String[] args) {
		PersonService personService = new PersonService(new PersonRepository());
		
		personService.findAll().forEach(p -> System.out.println(p.getName() + ", " + p.getAge() + " from " + p.getCountry()));
	}
}