package erg2;

public class Student {
    private int id;
    private String name;
    private String department;
    private int age;
    private String[] courses;
    private double[] grades;
    
    public Student(int id, String name, String department, int age, String[] courses, double[] grades) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.courses = courses;
        this.grades = grades;
    }
    
    public double getMaxGrade() {
        double max = Double.MIN_VALUE;
        for (double grade : this.grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
    
    public double getAverageGrade() {
        double sum = 0;
        for (double grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.length;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDepartment() {
        return this.department;
    }
}
