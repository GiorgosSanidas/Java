package abstracts.example3;

public class Circle extends Shape {

	private double radius;
	
	public void setradius(double r) {
		radius = r;
	}
	
	public double area() {
		return 2 * Math.PI * radius * radius;
	}
	
	public String toString() {
		return super.toString() + ": Circle(" + radius + ")";
	}

}
