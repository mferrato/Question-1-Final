package vehiclechain;

import java.util.HashMap;
import java.util.UUID;

public class TestVehicle {

	public static void main(String[] args) {

		// Makes an instance of a HashMap that can take any Vehicle object
		HashMap<UUID, Vehicle> HMap = new HashMap<UUID, Vehicle>();

		// Makes instances of person
		Person a = new Person("Mauricio", "Ferrato");
		Person b = new Person("Bert", "Gibbons");

		// Makes an instance of a car
		Car car = new Car("Ferrari", "Red", 2844, a, 4);

		// Makes an instance of a truck
		Truck truck = new Truck("Jeep", "Black", 3091, a, 2);

		// Transfers truck from person a to person b
		truck.transferOwner(b);

		// Makes an instance of a motorcycle
		MotorCycle motorcycle = new MotorCycle("Ducati", "Silver", 164, null,
				false);

		// Adds the instances of vehicle created above with their respective IDs
		// on the HashMap
		HMap.put(a.getPersonID(), car);
		HMap.put(b.getPersonID(), truck);
		HMap.put(UUID.randomUUID(), motorcycle);
	}

}
