package domain.Profile;

import java.util.Date;

import domain.Profile.infoProfile.Address;
import domain.Profile.infoProfile.PersonInformation;

public class Employee extends Person implements iEmployee {

	public Employee(Address address, PersonInformation personInformation) {
		super.setInformation(personInformation);
		super.setAdress(address);
	}

	@Override
	public String getName() {
		return super.getInformation().getName();
	}

	@Override
	public String getSurName() {
		return super.getInformation().getSurName();
	}

	@Override
	public String getPostalCode() {
		return super.getAdress().getPostalCode();
	}

	@Override
	public String getPesel() {
		return super.getInformation().getPesel();
	}

	@Override
	public Date getDateOfBirth() {
		return super.getInformation().getDateOfBirth();
	}

	@Override
	public String getPlaceOfBirth() {
		return super.getInformation().getPlaceOfBirth();
	}

	@Override
	public int getOld() {
		return super.getInformation().getOld();
	}

	@Override
	public void setName(String name) {
		super.getInformation().setName(name);
		
	}

	@Override
	public void setSurName(String surName) {
		super.getInformation().setSurName(surName);
	}

	@Override
	public void setOld(int Old) {
		super.getInformation().setOld(Old);		
	}

	@Override
	public void setPesel(String Pesel) {
		super.getInformation().setPesel(Pesel);
		
	}

	@Override
	public void setPlaceOfBirth(String placeOfBirth) {
		super.getInformation().setPlaceOfBirth(placeOfBirth);
		
	}

	@Override
	public void setPostalCode(String postalCode) {
		super.getAdress().setPostalCode(postalCode);
		
	}

	@Override
	public void setCity(String City) {
		super.getAdress().setCity(City);
		
	}

	@Override
	public void setCountry(String country) {
		super.getAdress().setCountry(country);
		
	}

	@Override
	public void setFlatNumber(int flatNumber) {
		super.getAdress().setFlatNumber(flatNumber);
		
	}

	@Override
	public void setStreet(String street) {
		super.getAdress().setStreet(street);
		
	}

	@Override
	public String getCity() {
		return super.getAdress().getCity();
	}

	@Override
	public int getFlatNumber() {
		return super.getAdress().getFlatNumber();
	}

	@Override
	public String getStreet() {
		return super.getAdress().getCity();
	}

	@Override
	public String getCountry() {
		return super.getAdress().getCountry();
	}
	
}
