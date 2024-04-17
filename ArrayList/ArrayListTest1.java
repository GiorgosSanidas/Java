package arraylists;

import java.util.ArrayList;

public class ArrayListTest1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(10);
		// �������� �� �� ������ add(T x)
		al.add(Integer.valueOf(13));
		al.add(Integer.valueOf(25));
		System.out.println("al="+al.toString());
		// �������� �� �� ������ add(T x)
		al.add(1, Integer.valueOf(84));
		System.out.println("al="+al.toString());
		// ���� ������������ �� �� ������ get(int i)
		Integer anInt = al.get(0);
		System.out.println(anInt);
		// �������� ������������ ��� �� ���� i �� �� ������ remove(int i)
		al.remove(2);
		System.out.println("al="+al.toString());
		// �������� ������������ x �� �� ������ remove(T x)
		al.remove(Integer.valueOf(13));
		System.out.println("al="+al.toString());
		// ������� ��� ������� ��� ����������� ��� ����� �� �� ������ contains(T x)
		System.out.println("has al the object 84? "+al.contains(Integer.valueOf(84)));
		// �������� ������������ x ��� ���� i �� �� ������ set(int i, T x)
		al.set(1, Integer.valueOf(99));
		System.out.println("al="+al.toString());
		// �������. ������ ���������.
		System.out.println("size="+al.size());
	}
}
