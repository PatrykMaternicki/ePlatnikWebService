package domain.Profile;

import java.util.Date;

public interface iEmployee  {
	public String getName();
	public String getSurName();
	public Date getDateOfBirth();
	public String getPlaceOfBirth();
	public int getOld();
	public String getPostalCode();
	public String getPesel();
	public String getCity();
	public int getFlatNumber();
	public String getStreet();
	public String getCountry();
	public void setName(String name);
	public void setSurName (String surName);
	public void setOld(int Old);
	public void setPesel (String Pesel);
	public void setPlaceOfBirth (String placeOfBirth);
	public void setPostalCode (String postalCode);
	public void setCity (String City);
	public void setCountry (String country);
	public void setFlatNumber(int flatNumber);
	public void setStreet (String street);

}
