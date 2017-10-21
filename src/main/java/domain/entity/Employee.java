package domain.entity;

import java.util.Date;

import domain.entity.domainInfo.Person;



public class Employee {
	
	private Person person = new Person();
	private int id;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
