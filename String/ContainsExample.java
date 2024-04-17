package string;

import java.util.Scanner;

public class ContainsExample {

	public static void main(String[] args) {
		String str = "Object oriented programming in Java";
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        while (!input.equals("exit")) {
        	System.out.println(str.contains(input));
        	input = reader.next();
        }
	}
}
