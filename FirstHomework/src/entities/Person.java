package src.entities;

public class Person {
	private Long id;
	private String name;
	private Integer age;
	private String country;

	public Person(Long id, String name, Integer age, String country) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
}