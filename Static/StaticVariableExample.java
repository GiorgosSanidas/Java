package statics;

class Student{  
	private int aem;//instance variable  
	private String name;  
	private static String university ="UOWM"; //static variable  
	private static int counter = 0; //static variable  
	private final static String test1 = "testing"; 
	private final String test2;
	
	public Student(int a, String n){  
		aem = a;  
		name = n;
		counter++;
		test2 = "test "+counter;
	}  

	public String toString(){//overriding the toString() method
		return aem+" "+name+" "+university;
	}

	void display() {
		System.out.println(aem+" "+name+" "+university+" "+test1+" "+test2);
	}

	public static String getUniversity() {
		return university;
	}

	public static void setUniversity(String university) {
		Student.university = university;
	}

	public int getAem() {
		return aem;
	}

	public void setAem(int aem) {
		this.aem = aem;
	}  
	
	
}  

public class StaticVariableExample{  
	public static void main(String args[]){  
		Student s1 = new Student(5011,"Nikos Papadopoulos");  
		Student s2 = new Student(5348,"George Papachristos");  
		s1.display();
		s2.display();  
		
		s1.setUniversity("UOC");
		s1.display();
		s2.setUniversity("UOM");
		s2.setAem(2567);
		s1.display();
		// Δεν μπορούμε να έχουμε πρόσβαση σε private πεδία εκτός της κλάσης
		// Πρέπει να έχουμε public μεθόδους για να προσπελάσουμε τα private πεδία
		// s1.name = "testing";  --> Λάθος
	}  
}  