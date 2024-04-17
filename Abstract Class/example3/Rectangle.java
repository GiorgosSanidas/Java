package abstracts.example3;

public class Rectangle extends Shape {
	private double height, width;
	
	public void setdimensions(double h, double w) {
		height = h;
		width = w;
	}
	
	public double area() {
		return height * width;
	}
	
	public String toString() {
		return super.toString() + ": Rectangle(" + height + " x " + width + ")";
	}

}
