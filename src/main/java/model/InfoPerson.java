package model;

import java.util.Arrays;

public class InfoPerson {

	private String firstName;
	private String lastName;
	private String[] sport;
	private String address;
	private String gender;
	private String phoneNumbers;
	private Integer age;

	public InfoPerson() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getSport() {
		return sport;
	}

	public void setSport(String[] sport) {
		this.sport = sport;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "InfoPerson [firstName=" + firstName + ", lastName=" + lastName + ", sport=" + Arrays.toString(sport)
				+ ", address=" + address + ", gender=" + gender + ", phoneNumbers=" + phoneNumbers + ", age=" + age
				+ "]";
	}

	
}
