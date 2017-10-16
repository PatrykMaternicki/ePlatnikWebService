package domain.Profile;

import domain.Profile.infoProfile.Address;
import domain.Profile.infoProfile.PersonInformation;

abstract class Person {

	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public PersonInformation getInformation() {
		return information;
	}
	public void setInformation(PersonInformation information) {
		this.information = information;
	}
	private Address adress;
	private PersonInformation information;
	
	
}
