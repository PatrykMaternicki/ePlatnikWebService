package domain.entity.PersonInfo;

public class Course {
	private String nameCourse;
	private String expiredTime;
	private boolean isRequiredToWork;
	public String getNameCourse() {
		return nameCourse;
	}
	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}
	public String getExpiredTime() {
		return expiredTime;
	}
	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}
	public boolean isRequiredToWork() {
		return isRequiredToWork;
	}
	public void setRequiredToWork(boolean isRequiredToWork) {
		this.isRequiredToWork = isRequiredToWork;
	}
	
	
}
