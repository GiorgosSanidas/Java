package composition;

import java.util.ArrayList;

public class CompositionExample {

	public static void main(String[] args) {
		Store store1 = new Store("�������� 156", 10, "�����������");
		Store store2 = new Store("����� 18", 15, "�����");
		Store store3 = new Store("��. ������� 27", 5, "���������");
		ArrayList<Store> al = new ArrayList<Store>();
		al.add(store1);
		al.add(store2);
		al.add(store3);
		Company myCompany = new Company("� ������� ���", 423991123, al);
		
		System.out.println("����� ��������="+myCompany.getName());
		System.out.println("��� ��������="+myCompany.getAfm());
		System.out.println("����������� ��������="+myCompany.getStores());
	}

}
