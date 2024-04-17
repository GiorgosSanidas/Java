package arraylists;

import java.util.ArrayList;

public class ArrayListTest1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(10);
		// Προσθήκη με τη μέθοδο add(T x)
		al.add(Integer.valueOf(13));
		al.add(Integer.valueOf(25));
		System.out.println("al="+al.toString());
		// Προσθήκη με τη μέθοδο add(T x)
		al.add(1, Integer.valueOf(84));
		System.out.println("al="+al.toString());
		// Λήψη αντικειμένου με τη μέθοδο get(int i)
		Integer anInt = al.get(0);
		System.out.println(anInt);
		// Διαγραφή αντικειμένου από τη θέση i με τη μέθοδο remove(int i)
		al.remove(2);
		System.out.println("al="+al.toString());
		// Διαγραφή αντικειμένου x με τη μέθοδο remove(T x)
		al.remove(Integer.valueOf(13));
		System.out.println("al="+al.toString());
		// Έλεγχος εάν υπάρχει ένα αντικείμενο στη λίστα με τη μέθοδο contains(T x)
		System.out.println("has al the object 84? "+al.contains(Integer.valueOf(84)));
		// Μεταβολή αντικειμένου x στη θέση i με τη μέθοδο set(int i, T x)
		al.set(1, Integer.valueOf(99));
		System.out.println("al="+al.toString());
		// Μέγεθος. Πλήθος στοιχείων.
		System.out.println("size="+al.size());
	}
}
