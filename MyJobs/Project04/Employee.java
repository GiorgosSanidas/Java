package erg4;

import java.util.Scanner;

public class Employee extends Person {

    public long afm;
    public float salary;
    public int xroniaProyphresias;
    public Department depart;

    public void setAfm(long afm) {
        this.afm = afm;
    }

    public long getAfm() {
        return afm;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setXroniaProyphresias(int xronia) {
        this.xroniaProyphresias = xronia;
    }

    public int getXroniaProyphresias() {
        return xroniaProyphresias;
    }

    public void setDepartment(Department department) {
        this.depart = department;
    }

    public Department getDepart() {
        return depart;
    }

    public String toString() {
        return String.format(
                "Employee: Name = %s, Surname = %s, Age = %d, Address = %s, AFM = %d, Salary = %f, XroniaProyphresias = %d, Department(name) = %s",
                this.name, this.surname, this.age, this.address, this.afm, this.salary, this.xroniaProyphresias,
                this.depart.getName());
    }

    public Employee() {
    }

    public Employee(String name, String surname, int age, String address, long afm, float salary,
            int xroniaProyphresias, Department depart) {
        super(name, surname, age, address);
        this.afm = afm;
        this.salary = salary;
        this.xroniaProyphresias = xroniaProyphresias;

        if (depart == null) {
            this.depart = new Department();
        } else {
            this.depart = depart;
        }
    }
}
