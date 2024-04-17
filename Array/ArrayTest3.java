package arrays;

class Department {
	private String[] courseName;
	private double[][] grades;
	
	public Department() { }
	
	public Department(String[] courseName, double[][] grades) {
		super();
		this.courseName = courseName;
		this.grades = grades;
	}

	public String[] getCourseName() {
		return courseName;
	}

	public void setCourseName(String[] courseName) {
		this.courseName = courseName;
	}

	public double[][] getGrades() {
		return grades;
	}

	public void setGrades(double[][] grades) {
		this.grades = grades;
	}

	public double[] getAvgGradeByCourse() {
		double[] avg = new double[grades.length];
		System.out.println("grades length = "+grades.length);
		for (int i=0; i < grades.length; i++) {
			System.out.println("grades "+i+" length = "+grades[i].length);
			double sum = 0.0;
			for (int j=0; j < grades[i].length; j++) {
				sum += grades[i][j];
			}
			avg[i] = sum / grades[i].length;
		}
		return avg;
	}
}

public class ArrayTest3 {
	
	public static void main(String[] args) {
		String[] courseNames = {"CS100","CS101","CS102"};
		double[][] grades = {{2,4,6,8,10},{1,3,7,9},{5,6,7,8,9}};
		Department department = new Department(courseNames,grades);

		double[] avgGrades = department.getAvgGradeByCourse();
		for (int i=0; i<avgGrades.length; i++) {
			System.out.println((department.getCourseName())[i]+ " average grade is "+avgGrades[i]);
		}
	}
}
