package vehiclechain;

public class Truck extends Vehicle implements VehicleInterface {

	// Attribute
	private int numberofAxels;

	// Constructor
	public Truck(String name, String color, int weight, Person owner,
			int numberofAxels) {
		super(name, color, weight, owner);
		this.numberofAxels = numberofAxels;
	}

}
