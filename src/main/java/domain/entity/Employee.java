package domain.entity;

import java.util.ArrayList;
import java.util.Date;

import domain.entity.ContractInfo.Contract;
import domain.entity.PersonInfo.AfterEmployers;
import domain.entity.PersonInfo.Course;
import domain.entity.PersonInfo.Person;



public class Employee {
	
	private Person person = new Person();
	private Contract contract = new Contract();
	private ArrayList<AfterEmployers> afterEmployersList = new ArrayList<AfterEmployers>();
	private ArrayList<Course> courseList = new ArrayList<Course>();
	private int id;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
