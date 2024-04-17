package abstracts.example1;

import java.util.Date;

public class AbstractExample {

	public static void main(String[] args) {
		HourlyEmployee A = new HourlyEmployee("Alice", new Date(4,18,2013), 10, 100);
		SalariedEmployee B = new SalariedEmployee("Bob", new Date(4,17,2013), 12000);
		System.out.println(A.getPay());
		System.out.println(B.getPay());
		if (A.samePay(B)){
			System.out.println("The two employees take the same amount per month");
		}
		else{
			System.out.println("The two employees do NOT take the same amount per month");
		}
	}

}
