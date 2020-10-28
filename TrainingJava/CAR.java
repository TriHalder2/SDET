
public class CAR {
	String Color;
	String Transmission;
	int make;
	int tyres;
	int doors;
	
// Constructor
	public CAR() {
		this.tyres = 4;
		this.doors = 4;
		
	}

//Method
	public void displayCharacteristics() {
		System.out.println("color of the Car" + Color);
		System.out.println("Make of the Car " + make);
		System.out.println("Transmission of the Car" + Transmission);
	}
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}
	

}
