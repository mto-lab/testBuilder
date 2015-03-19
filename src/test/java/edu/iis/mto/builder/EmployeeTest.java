package edu.iis.mto.builder;

import static org.junit.Assert.*;
import static edu.iis.mto.builder.EmployeeBuilder.employee;
import static org.hamcrest.Matchers.*;
import org.joda.time.DateTime;
import org.junit.Test;

public class EmployeeTest {

	@Test
	public void getFullNameReturnsCombination() {
		// given
		Employee emp = new Employee(1, "Kenneth", "Truyers",
				DateTime.parse("2002-01-15"), "My Street");

		// when
		String fullname = emp.getFullName();

		// then
		assertThat(fullname, is(equalTo("Kenneth Truyers")));
	}

	@Test
	public void getFullNameReturnsCombinationUsingBuilder() {
		// given
		Employee emp = new EmployeeBuilder().withFirstName("Kenneth")
				.withLastName("Truyers").build();

		// when
		String fullname = emp.getFullName();

		// then
		assertThat(fullname, is(equalTo("Kenneth Truyers")));
	}

	@Test
	public void getFullNameReturnsCombinationUsingDeclarativeSyntax() {
	
		Employee emp = given(employee().withFirstName("Kenneth").withLastName(
				"Truyers"));

		// when
		String fullname = emp.getFullName();

		// then
		assertThat(fullname, is(equalTo("Kenneth Truyers")));
	}

	private Employee given(EmployeeBuilder builder) {
		return builder.build();
	}

}
