package ePlatnikWebServiceTest.domain.entityTest.ContractInfoTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import ePlatnikWebService.domain.entity.ContractInfo.ContractProperties;
import ePlatnikWebServiceTest.domain.testBuilders.ContextTestBuilder;

public class ContractPropertiesTest {

	private ContractProperties contractProperties;
	private ContextTestBuilder testBuilder;
	
	@Before
	public void setUp(){
		contractProperties = new ContractProperties();
		contractProperties.setHadInvalidStatus(testBuilder.testBoolean);
		contractProperties.setHadRetiredStatus(testBuilder.testBoolean);
		contractProperties.setHadStudentStatus(testBuilder.testBoolean);
	}

	@Test
	public void isHadInvalidStatus_should_be_return_boolean(){
		assertThat("isHadInvaidStatus is not boolean", contractProperties.isHadInvalidStatus(), is(Boolean.class));
	}
	@Test
	public void isHadRetiredStatus_should_be_return_boolean(){
		assertThat("isHadRetiredStatus is not boolean", contractProperties.isHadRetiredStatus(), is(Boolean.class));
	}
	@Test
	public void isHadStudentStatus(){
		assertThat("isHadStudentStatus is not boolean", contractProperties.isHadStudentStatus(), is(Boolean.class));
	}
}
