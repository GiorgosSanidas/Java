package erg4;

import java.util.Scanner;

public class Person {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = -1;
            System.out.println("Invalid Person's age!");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return String.format(
                "Person: Name = %s, Surname = %s, Age = %d, Address = %s",
                this.name, this.surname, this.age, this.address);
    }

    public Person() {
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        setAge(age);
        this.address = address;
    }
}

    

