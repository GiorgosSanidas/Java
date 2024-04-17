package linkedlists;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(); 
        
        ll.add("John"); 
        ll.add("Jim"); 
        ll.add(1, "Jack"); 
        System.out.println("Initial LinkedList " + ll); 
        
        // ������ ����� �� ������������ ����
        ll.set(1, "Nick");
        
        // �������� ��� ������ (������ 1)
        for (int i = 0; i < ll.size(); i++) { 
            System.out.print(ll.get(i) + " "); 
        } 
        System.out.println(); 
    
        // �������� ��� ������ (������ 2) 
        for (String str : ll) 
            System.out.print(str + " ");         
        
        // �������� �� ���� �� Index
        ll.remove(1); 
        System.out.println("\nAfter the Index Removal " + ll); 
    
        // �������� �� ���� �� ����
        ll.remove("John"); 
        System.out.println("After the Object Removal " + ll); 
	}

}
