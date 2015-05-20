package vehiclechain;

public abstract class Vehicle {
	
	//Attributes
	private String name;
	private String color;
	private double weight;
    private Person owner;
    
    // Constructor
 	public Vehicle(String name, String color, int weight, Person owner) {
 		this.name = name;
 		this.color = color;
 		this.weight = weight;
 		this.owner = owner;
 	}
    
    //Sets a new owner on to the car
    public void transferOwner(Person newOwner){
    	this.owner = newOwner;
    }
}
 