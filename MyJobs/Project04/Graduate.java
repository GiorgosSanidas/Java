package erg4;

import java.util.Scanner;

public class Graduate extends Student {

    protected String titloPtixiou;
    protected float bathmoPtixiou;
    protected Professor epivlepontaKathigiti;
    protected String titloErgasias;

    public void setTitloPtixiou(String titlos) {
        this.titloPtixiou = titlos;
    }

    public String getTitloPtixiou() {
        return titloPtixiou;
    }

    public void setBathmoPtixiou(float grade) {
        this.bathmoPtixiou = grade;
    }

    public float getBathmoPtixiou() {
        return bathmoPtixiou;
    }

    public void getEpivlepontaKathigiti(Professor professor) {
        this.epivlepontaKathigiti = professor;
    }

    public Professor getEpivlepontaKathigiti() {
        return epivlepontaKathigiti;
    }

    public void setTitloErgasias(String titlos) {
        this.titloErgasias = titlos;
    }

    public String getTitloErgasias() {
        return titloErgasias;
    }

    public String toString() {
        return String.format(
                "Graduate: Name = %s, Surname = %s, Age = %d, Address = %s, AM = %d, EtosEisagoghs = %d, Grades = (%f, %f, %f), M.O. = %f, Department(name) = %s, TitloPtixiou = %s, BathmoPtixiou = %f, EpivlepontaKathigiti(Name) = %s %s, TitloErgasias = %s",
                this.name, this.surname, this.age, this.address, this.a_m, this.etosEisagoghs, this.grade1, this.grade2,
                this.grade3, this.me_o, this.depart.getName(), this.titloPtixiou, this.bathmoPtixiou,
                this.epivlepontaKathigiti.getName(), this.epivlepontaKathigiti.getSurname(), this.titloErgasias);
    }

    public Graduate() {
    }

    public Graduate(String name, String surname, int age, String address, int a_m,
            Department depart, int etosEisagoghs, double grade1, double grade2, double grade3, double me_o,
            String titloPtixiou, float bathmoPtixiou, Professor epivlepontaKathigiti, String titloErgasias) {
        super(name, surname, age, address, a_m, depart, etosEisagoghs, grade1, grade2, grade3, me_o);
        this.titloPtixiou = titloPtixiou;
        this.bathmoPtixiou = bathmoPtixiou;
        this.titloErgasias = titloErgasias;

        if (epivlepontaKathigiti == null) {
            this.epivlepontaKathigiti = new Professor();
        } else {
            this.epivlepontaKathigiti = epivlepontaKathigiti;
        }

    }
}

