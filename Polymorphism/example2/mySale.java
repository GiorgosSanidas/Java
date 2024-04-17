package polymorphism.example2;

public class mySale {
	protected String name;
	protected double price;

	public mySale(String theName, double thePrice) {
		name = theName;
		price = thePrice;
	}
	
	public String toString( ) {
		return (name + " Price and total cost = $" + price);
	}
	
	public double bill() {
		return price;
	}
	
	public boolean equalDeals(mySale otherSale) {
		return (name.equals(otherSale.name) && bill() == otherSale.bill());
	}
	
	public boolean lessThan (mySale otherSale) {
		return (bill() < otherSale.bill());
	}
}
