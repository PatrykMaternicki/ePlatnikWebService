package ePlatnikWebServiceTest.domain.entityTest;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import ePlatnikWebService.domain.entity.Employee;
import ePlatnikWebService.domain.entity.ContractInfo.Contract;
import ePlatnikWebService.domain.entity.ContractInfo.RaportOfWork;
import ePlatnikWebService.domain.entity.PersonInfo.BeforeEmployers;
import ePlatnikWebService.domain.entity.PersonInfo.Course;
import ePlatnikWebService.domain.entity.PersonInfo.Person;
@RunWith(MockitoJUnitRunner.class)
public class employeeTest extends Mockito {

	private Person person;
	private Contract contract;
	private ArrayList<BeforeEmployers> list;
	private ArrayList<Course> courseList;
	private ArrayList<RaportOfWork> raportList;
	@Mock
	private Employee employee;
	
	@Before
	public void setUp(){
		person = new Person();
		contract = new Contract();
		list = new ArrayList<BeforeEmployers>();
		courseList=  new ArrayList<Course>();
	}
	@Test
	public void when_call_method_in_employee_getPerson_then_return_Person(){
		when(employee.getPerson()).thenReturn(person);
		assertThat("Employee doesnt return Person",employee.getPerson(),is(Person.class));
	}
	@Test
	public void when_call_method_in_employee_getContract_then_return_contract(){
		when(employee.getContract()).thenReturn(contract);
		assertThat("Employee doesnt return contract",employee.getContract(),is(Contract.class));

	}
	@Test
	public void when_call_method_in_empployee_getBeforeEmloyeeList_then_return_beforeEmployersList(){
		when(employee.getAfterEmployersList()).thenReturn(list);
		assertThat("Before Employers list doesnt return",employee.getAfterEmployersList(),is(ArrayList.class));
	}
	
	@Test
	public void when_call_method_in_empployee_getBeforeEmloyeeList_then_return_courseList(){
		when(employee.getCourseList()).thenReturn(courseList);
		assertThat("Course list doesnt return",employee.getCourseList(),is(ArrayList.class));
	}
	
}
