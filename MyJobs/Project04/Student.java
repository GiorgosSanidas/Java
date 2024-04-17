package erg4;

import java.util.Scanner;

public class Student extends Person {

    protected int a_m;
    protected Department depart;
    protected int etosEisagoghs;
    protected double grade1;
    protected double grade2;
    protected double grade3;
    protected double me_o;

    public void setA_m(int am) {
        this.a_m = am;
    }

    public int getA_m() {
        return a_m;
    }

    public void setDepartment(Department department) {
        this.depart = department;
    }

    public Department getDepart() {
        return depart;
    }

    public void setEtosEisagoghs(int etos) {
        this.etosEisagoghs = etos;
    }

    public int getEtosEisagoghs() {
        return etosEisagoghs;
    }

    public void setGrade1(int grade) {
        this.grade1 = grade;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade2(int grade) {
        this.grade2 = grade;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade3(int grade) {
        this.grade2 = grade;
    }

    public double getGrade3() {
        return grade3;
    }

    public double getMe_o() {
        return me_o;
    }

    public String toString() {
        return String.format(
                "Student: Name = %s, Surname = %s, Age = %d, Address = %s, AM = %d, EtosEisagoghs = %d, Grades = (%f, %f, %f), M.O. = %f, Department(name) = %s",
                this.name, this.surname, this.age, this.address, this.a_m, this.etosEisagoghs, this.grade1, this.grade2,
                this.grade3, this.me_o, this.depart.getName());
    }

    public Student() {
    }

    public Student(String name, String surname, int age, String address, int a_m, Department depart, int etosEisagoghs,
            double grade1, double grade2, double grade3, double me_o) {
        super(name, surname, age, address);
        this.a_m = a_m;
        this.etosEisagoghs = etosEisagoghs;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.me_o = me_o;

        if (depart == null) {
            this.depart = new Department();
        } else {
            this.depart = depart;
        }
    }

}
