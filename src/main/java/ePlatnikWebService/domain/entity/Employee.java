package ePlatnikWebService.domain.entity;

import java.util.ArrayList;
import java.util.Date;

import ePlatnikWebService.domain.entity.ContractInfo.*;
import ePlatnikWebService.domain.entity.PersonInfo.BeforeEmployers;
import ePlatnikWebService.domain.entity.PersonInfo.Course;
import ePlatnikWebService.domain.entity.PersonInfo.Person;




public class Employee {
	
	private Person person = new Person();
	private Contract contract = new Contract();
	private ArrayList<BeforeEmployers> BeforeEmployersList = new ArrayList<BeforeEmployers>();
	private ArrayList<Course> courseList = new ArrayList<Course>();
	private int id;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public ArrayList<BeforeEmployers> getAfterEmployersList() {
		return getAfterEmployersList();
	}

	public void setAfterEmployersList(ArrayList<BeforeEmployers> afterEmployersList) {
		this.BeforeEmployersList = afterEmployersList;
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	
	
	
	
}
