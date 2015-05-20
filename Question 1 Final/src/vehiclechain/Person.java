package vehiclechain;

import java.util.UUID;

public class Person {
	
	//Attributes
	private String firstName;
	private String lastName;
	private UUID personID;
	
	// Constructor
	public Person(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.setPersonID();
	}
	
	//Getters and Setters for the attributes
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
	public UUID getPersonID() {
		return personID;
	}
	
	// Generates a new UUID
	public void setPersonID() {
		this.personID = UUID.randomUUID();
	}

}
