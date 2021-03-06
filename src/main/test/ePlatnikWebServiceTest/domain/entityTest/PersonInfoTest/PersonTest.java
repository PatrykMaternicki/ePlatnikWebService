package ePlatnikWebServiceTest.domain.entityTest.PersonInfoTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import ePlatnikWebService.domain.entity.PersonInfo.Address;
import ePlatnikWebService.domain.entity.PersonInfo.Person;
import ePlatnikWebService.domain.entity.PersonInfo.PersonInformation;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
@RunWith(MockitoJUnitRunner.class)
public class PersonTest extends Mockito {
	
	
	private PersonInformation personInformation;
	private Address address;
	@Mock
	Person person;
	
	
	@Before
	public void setUp(){
		personInformation = new PersonInformation();
		address = new Address();
	}
	@Test
	public void should_be_return_personInformation_when_called_super_method_getInformation(){
		when(person.getInformation()).thenReturn(personInformation);
	}
	@Test
	public void should_be_return_address_when_called_super_method_getAddress(){
		when(person.getAdress()).thenReturn(address);
	}

	

}
