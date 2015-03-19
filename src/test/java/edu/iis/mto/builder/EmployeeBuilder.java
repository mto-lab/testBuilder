package edu.iis.mto.builder;

import org.joda.time.DateTime;

public class EmployeeBuilder {
	private int id = 1;
	private String firstname = "first";
	private String lastname = "last";
	private DateTime birthdate = DateTime.now();
	private String street = "street";

	public Employee build() {
		return new Employee(id, firstname, lastname, birthdate, street);
	}

	public EmployeeBuilder withFirstName(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public EmployeeBuilder withLastName(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public EmployeeBuilder withBirthDate(DateTime birthdate) {
		this.birthdate = birthdate;
		return this;
	}

	public EmployeeBuilder withStreet(String street) {
		this.street = street;
		return this;
	}
	
	public static EmployeeBuilder employee() {
		return new EmployeeBuilder();
	}
}
