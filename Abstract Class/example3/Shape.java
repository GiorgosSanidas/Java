package abstracts.example3;

public abstract class Shape {
	private double x, y;           // Position

	protected double getX() { return x; }
	
	protected double getY() { return y; }

	public void setposition(double px, double py) {
		x = px;
		y = py;
	}
	
	public abstract double area();
	
	public String toString() {
		return "Shape(x=" + x + ", y=" + y + ", area=" + area() + ")";
	}
}