package mudrak.patel.asgn1.dto;

import java.io.Serializable;

import mudrak.patel.asgn1.exceptions.ImproperInputException;

public class Professor implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName = null;
	private String middleName = null;
	private String lastName = null;

	public Professor( String firstName, String lastName)
			throws ImproperInputException {
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public Professor( String firstName, String middleName, String lastName)
			throws ImproperInputException {
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws ImproperInputException {
		if (firstName == null || firstName.isEmpty()) {
			throw new ImproperInputException("Proressor must have a first name");
		}
		this.firstName = firstName;
	}

	public String getmiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) throws ImproperInputException {
		// middle name can be null or empty String
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws ImproperInputException {
		if (lastName == null || lastName.isEmpty()) {
			throw new ImproperInputException("Proressor must have a last name");
		}
		this.lastName = lastName;
	}
	
	/*
	 * equals(Professor professor): boolean
	 * */
	public boolean equals(Professor professor) {
		if(firstName.equals(professor.getFirstName())
				&& lastName.equals(professor.getLastName())
				&& middleName.equals(professor.getmiddleName())) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * toString(): String
	 * */
	public String toString() {
		System.out.println("First name: " + getFirstName());
		System.out.println("Last name: " + getLastName());
		System.out.println("Middle name: " + getmiddleName());
		return getFirstName() + " " + getmiddleName() + " " + getLastName() + "\n";
	}

}
