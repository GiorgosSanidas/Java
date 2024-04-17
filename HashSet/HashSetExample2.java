package hashsets;

/*
 *  �������� (��� �� ������), ���������� ��� ��������� ��������� ������
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExample2 {

	public static void main(String args[]) {
		HashSet<String> mySet = new HashSet<String>();
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] words = text.split(" ");
		for (String word : words) {
			mySet.add(word);
		}
		
		// �������� HashSet (������ 1)
		for (String word : mySet) {
			System.out.println(word);
		}
		System.out.println();
		// �������� HashSet (������ 2)
		Iterator it = mySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}