package statics;

class UniversityStudent{  
	int aem;//instance variable  
	String name;  
	static String university ="UOWM";//static variable  
	static int counter = 0;//static variable  
	
	UniversityStudent(int a, String n){  
		this.aem = a;  
		this.name = n;
		this.counter++;
	}  

	void display() {
		System.out.println(aem+" "+name+" "+university);
	}  
	
	public static int getCounter() {
		return counter;
	}
	
	public static void modifyUniversity(String u) {
		university = u;
	}
}  

public class StaticMethodExample{  
	public static void main(String args[]){  
		UniversityStudent s1 = new UniversityStudent(5011,"Nikos Papadopoulos");  
		UniversityStudent s2 = new UniversityStudent(5348,"George Papachristos");  
		System.out.println("Number of students: "+UniversityStudent.getCounter());
		s1.display();
		s2.display();  
		UniversityStudent.modifyUniversity("AUTH");
		s1.display();  
		s2.display();
	}  
}  