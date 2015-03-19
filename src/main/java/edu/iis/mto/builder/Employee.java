package edu.iis.mto.builder;

import org.joda.time.DateTime;

public class Employee {
	public Employee(int id, String firstName, String lastName,
			DateTime birthDate, String street) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.street = street;
	}

	private int id;

	private String firstName;

	private String lastName;

	private DateTime birthDate;

	private String street;

	public String getStreet() {
		return street;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public int getAge() {
		DateTime today = DateTime.now();
		int age = today.getYear() - birthDate.getYear();
		if (birthDate.isAfter(today.minusYears(age))) {
			age--;
		}
		return age;
	}
}
