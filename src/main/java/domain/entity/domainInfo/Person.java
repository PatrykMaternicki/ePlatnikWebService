package domain.entity.domainInfo;


public class Person {

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
	private Address adress = new Address();
	private PersonInformation information = new PersonInformation();
	
	
}
