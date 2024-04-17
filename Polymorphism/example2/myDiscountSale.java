package polymorphism.example2;

public class myDiscountSale extends mySale {
	private double discount;
	
	public myDiscountSale(String theName, double thePrice, double theDiscount) {
		super(theName, thePrice);
		discount = theDiscount;
	}
	   
	public double bill() {
		double fraction = discount/100;
		return (1 - fraction)*price;
	}
	   
	public String toString() {
		return (name + " Price = $" + price
				+ " Discount = " + discount + "%\n"
				+ " Total cost = $" + bill( ));
	}
}
