package abstracts.example2;

public class Car extends Vehicle {
	private int gas;
	public Car(int pos, int gas){
		//super(pos);
		position = pos;
		this.gas = gas;
	}

	public void move(){
		position += 10;
		gas -= 10;
	}
	public void print(){
		super.print();
		System.out.println("gas =" + gas);
	}
}