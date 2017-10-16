package domain.Profile.SpecificProfile;

import java.util.Date;

import domain.Profile.Employee;
import domain.Profile.iEmployee;
import domain.Profile.InterfaceAccessToProfile.CGAble;
import domain.Profile.InterfaceAccessToProfile.NormalDataReadable;
import domain.Profile.InterfaceAccessToProfile.PersonDataConfigurable;
import domain.Profile.InterfaceAccessToProfile.SimpleDataConfigable;
import domain.Profile.InterfaceAccessToProfile.SimpleDataReadable;
import domain.Profile.InterfaceAccessToProfile.SpecificDataReadable;
import domain.Profile.infoProfile.Address;
import domain.Profile.infoProfile.PersonInformation;

public class Worker implements PersonDataConfigurable,SpecificDataReadable,NormalDataReadable, SimpleDataReadable, SimpleDataConfigable, CGAble{

	
	private iEmployee employee;
	
	
	
	@Override
	public void setName(String name) {
		employee.setName(name);
		
	}

	@Override
	public void setSurName(String surName) {
		employee.setSurName(surName);
		
	}

	@Override
	public void setOld(int Old) {
		employee.setOld(Old);
		
	}

	@Override
	public void setPesel(String Pesel) {
		employee.setPesel(Pesel);
		
	}

	@Override
	public void setPlaceOfBirth(String placeOfBirth) {
		employee.setPlaceOfBirth(placeOfBirth);
		
	}

	@Override
	public void setPostalCode(String postalCode) {
		employee.setPostalCode(postalCode);
		
	}

	@Override
	public void setCity(String City) {
		employee.setCity(City);
		
	}

	@Override
	public void setCountry(String country) {
		employee.setCountry(country);
		
	}

	@Override
	public void setFlatNumber(int flatNumber) {
		employee.setFlatNumber(flatNumber);
		
	}

	@Override
	public void setStreet(String street) {
		employee.setStreet(street);
		
	}

	@Override
	public String getName() {
		return employee.getName();
	}

	@Override
	public String getSurName() {
		return employee.getSurName();
	}

	@Override
	public Date getDateOfBirth() {
		return employee.getDateOfBirth();
	}

	@Override
	public String getPlaceOfBirth() {
		return employee.getPlaceOfBirth();
	}

	@Override
	public int getOld() {
		return employee.getOld();
	}

	@Override
	public String getPostalCode() {
		return employee.getPostalCode();
	}

	@Override
	public String getPesel() {
		return employee.getPesel();
	}

	@Override
	public String getCity() {
		return employee.getCity();
	}

	@Override
	public int getFlatNumber() {
		return employee.getFlatNumber();
	}

	@Override
	public String getStreet() {
		return employee.getStreet();
	}

	@Override
	public String getCountry() {
		return employee.getCountry();
	}

	@Override
	public iEmployee getAllOnEmployee() {
		return employee;
	}

	@Override
	public void constructEmployee(Address address, PersonInformation personInformation) {
		employee = new Employee(address,personInformation);
		
	}
	
}
