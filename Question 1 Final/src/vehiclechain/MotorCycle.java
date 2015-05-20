package vehiclechain;

public class MotorCycle extends Vehicle implements VehicleInterface {

	// Attribute
	private boolean hasSideCar;

	// Constructor
	public MotorCycle(String name, String color, int weight, Person owner,
			boolean hasSideCar) {
		super(name, color, weight, owner);
		this.hasSideCar = hasSideCar;
	}

}
