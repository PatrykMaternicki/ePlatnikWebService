package entityTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import domain.entity.Employee;
import domain.entity.PersonInfo.Person;
@RunWith(MockitoJUnitRunner.class)
public class employeeTest extends Mockito {

	private Person person;
	@Mock
	private Employee employee;
	
	@Before
	public void setUp(){
		person = new Person();
		
	}
	@Test
	public void when_call_method_employee_getPerson_then_return_Person(){
		when(employee.getPerson()).thenReturn(person);
	}
	
}
