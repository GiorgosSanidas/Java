package string;

import java.util.Scanner;

public class SplitExample {

	public static void main(String[] args) {
		String str = "Object oriented programming in Java";
		int a = Integer.parseInt("1521");
		System.out.println("a="+a);
		String[] array = str.split(" ");
		for (int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}
}
