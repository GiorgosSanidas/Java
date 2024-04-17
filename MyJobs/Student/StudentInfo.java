package erg2;
import java.util.HashMap;
import java.util.Map;
public class StudentInfo {
    
    private Map<Integer, Student> students;
    
    public StudentInfo() {
        this.students = new HashMap<Integer, Student>();
    }
    
    public void addStudent(int id, String name, String department, int age, String[] courses, double[] grades) {
        Student student = new Student(id, name, department, age, courses, grades);
        this.students.put(id, student);
    }
    
    public double getMaxGrade(int id) {
        Student student = this.students.get(id);
        return student.getMaxGrade();
    }
    
    public double getAverageGrade(int id) {
        Student student = this.students.get(id);
        return student.getAverageGrade();
    }
    
    public double getAverageGrade(String name) {
        for (Student student : this.students.values()) {
            if (student.getName().equals(name)) {
                return student.getAverageGrade();
            }
        }
        return 0;
    }
    
    public String getDepartmentWithMaxAverageGrade() {
        String department = "";
        double maxAverageGrade = 0;
        Map<String, Double> departmentGrades = new HashMap<String, Double>();
        for (Student student : this.students.values()) {
            String departmentName = student.getDepartment();
            double averageGrade = student.getAverageGrade();
            if (departmentGrades.containsKey(departmentName)) {
                double currentAverageGrade = departmentGrades.get(departmentName);
                double newAverageGrade = (currentAverageGrade + averageGrade) / 2;
                departmentGrades.put(departmentName, newAverageGrade);
                if (newAverageGrade > maxAverageGrade) {
                    maxAverageGrade = newAverageGrade;
                    department = departmentName;
                }
            } else {
                departmentGrades.put(departmentName, averageGrade);
                if (averageGrade > maxAverageGrade) {
                    maxAverageGrade = averageGrade;
                    department = departmentName;
                }
            }
        }
        return department;
    }
}