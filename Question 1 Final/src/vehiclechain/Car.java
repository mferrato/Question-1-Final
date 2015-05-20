package vehiclechain;

public class Car extends Vehicle implements VehicleInterface {

	// Attribute
	private int numberOfDoors;

	// Constructor
	public Car(String name, String color, int weight, Person owner,
			int numberOfDoors) {
		super(name, color, weight, owner);
		this.numberOfDoors = numberOfDoors;
	}

}
