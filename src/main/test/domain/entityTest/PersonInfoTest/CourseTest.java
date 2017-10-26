package domain.entityTest.PersonInfoTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import domain.entity.PersonInfo.Course;

public class CourseTest {

	private Course course;
	private String textContext = "TEST";
	@Before
	public void setUp(){
		course = new Course();
		course.setNameCourse(textContext);
		course.setExpiredTime(2);
		course.setRequiredToWork(true);
		
	}
	@Test
	public void nameCourse_should_be_string(){
		assertThat("nameCourse is not String",course.getNameCourse(),is(String.class));
	}
	@Test
	public void expiredTime_should_be_integer(){
		assertThat("expiredTime is not Integer",course.getExpiredTime(),is(Integer.class));

	}
	@Test
	public void required_work_should_be_boolean(){
		assertThat("Required is not boolean",course.isRequiredToWork(),is(Boolean.class));

	}
	
}
