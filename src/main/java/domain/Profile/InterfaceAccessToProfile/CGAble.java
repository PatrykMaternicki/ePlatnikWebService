package domain.Profile.InterfaceAccessToProfile;

import domain.Profile.iEmployee;
import domain.Profile.infoProfile.Address;
import domain.Profile.infoProfile.PersonInformation;

public interface CGAble {

	public iEmployee getAllOnEmployee();
	public void constructEmployee(Address address, PersonInformation personInformation);
}
