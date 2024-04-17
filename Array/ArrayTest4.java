package arrays;

import java.util.Scanner;

class Foititis {
	private String name;
	private double[] grades;
	
	public Foititis() { }

	public Foititis(String name, double[] grades) {
		super();
		this.name = name;
		this.grades = grades;
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
	
	public double getAvgGrade() {
		double sum = 0.0;
		for (double grade : grades) {
			sum += grade;
		} 
		return sum/grades.length;
	}
}

public class ArrayTest4 {
	
	public static void main(String[] args) {
		Foititis[] students = new Foititis[3]; 
		double[] student1Grades = {2,4,6,8,10};
		double[] student2Grades = {1,3,5,7,9};
		double[] student3Grades = {5,6,7,8,9};
		
		students[0] = new Foititis("John", student1Grades);
		students[1] = new Foititis("George", student2Grades);
		students[2] = new Foititis("Nick", student3Grades);

		if (students[0].getAvgGrade() > students[1].getAvgGrade()) {
			if (students[0].getAvgGrade() > students[2].getAvgGrade()) {
				System.out.println("Ο φοιτητής 1 έχει το μεγαλύτερο μέσο όρο βαθμολογίας");
			}
			else {
				System.out.println("Ο φοιτητής 3 έχει το μεγαλύτερο μέσο όρο βαθμολογίας");
			}
		}
		else {
			if (students[1].getAvgGrade() > students[2].getAvgGrade()) {
				System.out.println("Ο φοιτητής 2 έχει το μεγαλύτερο μέσο όρο βαθμολογίας");
			}
			else {
				System.out.println("Ο φοιτητής 3 έχει το μεγαλύτερο μέσο όρο βαθμολογίας");
			}
		}
	}
}
