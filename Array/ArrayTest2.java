package arrays;

class Student {
	private String aem;
	private String name;
	private double[] grades;
	
	public Student() { }

	public Student(String aem, String name, double[] grades) {
		super();
		this.aem = aem;
		this.name = name;
		this.grades = grades;
	}

	public String getAem() {
		return aem;
	}

	public void setAem(String aem) {
		this.aem = aem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	
	public double getMinGrade() {
		double lowGrade = grades[0];
		for (double grade : grades) {
			if (grade < lowGrade)
				lowGrade = grade;
		} 
		return lowGrade;
	}

	public double getMaxGrade() {
		double maxGrade = grades[0];
		for (int i=0; i < grades.length; i++) {
			if (grades[i] > maxGrade)
				maxGrade = grades[i];
		} 
		return maxGrade;
	}
}

public class ArrayTest2 {
	
	public static void main(String[] args) {
		double[] student1Grades = {6.5, 5.5, 5, 9, 7.5, 8};
		Student student1 = new Student("2101","John",student1Grades);
		System.out.println("Μέγιστος βαθμός φοιτητή1: "+student1.getMaxGrade());
		
		double[] student2Grades = {5, 2, 3.5, 4, 8.5, 7.5};
		Student student2 = new Student("1897","George",student2Grades);
		System.out.println("Μέγιστος βαθμός φοιτητή2: "+student2.getMaxGrade());

		if (student1.getMinGrade() < student2.getMinGrade()) {
			System.out.println("Ο φοιτητής 1 έχει το μικρότερο βαθμό");
		}
		else {
			System.out.println("Ο φοιτητής 2 έχει το μικρότερο βαθμό");
		}
	}
}
