package abstracts.example3;

public class ShapesExample {
	static public void main(String args[]) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Shape s[] = new Shape[2];

		s[0] = r;
		r.setposition(1, 2);
		r.setdimensions(50, 50);

		s[1] = c;
		c.setposition(3, 4);
		c.setradius(10);
		for (int i = 0; i < s.length; i++)
			System.out.println(s[i]);
	}

}
