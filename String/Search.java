package string;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		String name = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Δώσε ένα κείμενο: ");
		String line = input.nextLine();
		String[] words = line.split(" ");
		
		System.out.print("Δώσε μία λέξη για αναζήτηση: ");
		name = input.next();
		int i = 0;
		for (i = 0; i < words.length; i++) {
			if (name.equals(words[i])) {
				System.out.println(name + " found it at " + i + "-th word");
			}
		}
		input.close();
	}
}
