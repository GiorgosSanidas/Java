package abstracts.example2;

public class VehicleExample {
	
	public static void main(String[] args){
		Vehicle[] V = new Vehicle[2];
		V[0] = new Car(0,100);
		V[1] = new Bike();
		V[0].move(); V[0].print();
		V[1].move(); V[1].print();
		// V[2] = new Vehicle(0);
		
		Vehicle aVehicle;
	}
}