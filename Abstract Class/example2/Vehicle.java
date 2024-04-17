package abstracts.example2;

public abstract class Vehicle {
	protected int position = 0;
	
	public Vehicle() { }
	
	public Vehicle(int pos){
		position = pos;
	}

	public abstract void move();
	public void print() {
		System.out.println("position = " + position);
	}
}