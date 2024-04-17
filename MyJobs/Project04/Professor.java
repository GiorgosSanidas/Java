package erg4;

import java.util.Scanner;

public class Professor extends Employee {

	protected String bathmida;
	protected int xronosDidaktorikou;
	protected int arithmosDimososieyseon;
	protected int metaptixiakaEpivlepi;
	protected String[] mathimataDidaski = null;

	public void setBathmida(String bathmida) {
		this.bathmida = bathmida;
	}

	public String getBathmida() {
		return bathmida;
	}

	public void setXronosDidaktorikou(int xronos) {
		this.xronosDidaktorikou = xronos;
	}

	public int getXronosDidaktorikou() {
		return xronosDidaktorikou;
	}

	public void setArithmosDimososieyseon(int dimosieusis) {
		this.arithmosDimososieyseon = dimosieusis;
	}

	public int getArithmosDimososieyseon() {
		return arithmosDimososieyseon;
	}

	public void setMetaptixiakaEpivlepi(int metaptixiaka) {
		this.metaptixiakaEpivlepi = metaptixiaka;
	}

	public int getMetaptixiakaEpivlepi() {
		return metaptixiakaEpivlepi;
	}

	public void setMathimata(String[] mathimata) {
		this.mathimataDidaski = mathimata;
	}

	public String[] getMathimataDidaski() {
		return mathimataDidaski;
	}

	public String toString() {
		String mathimataStr = "";

		if (this.mathimataDidaski != null) {
			mathimataStr = String.join(", ", this.mathimataDidaski);
		}

		return String.format(
				"Professor: Name = %s, Surname = %s, Age = %d, Address = %s, AFM = %d, Salary = %f, XroniaProyphresias = %d, Department(name) = %s, Bathmida = %s, XronosDidaktorikou = %d, ArithmosDimososieyseon = %d, MetaptixiakaEpivlepi = %d, Mathimata = %s",
				this.name, this.surname, this.age, this.address, this.afm, this.salary, this.xroniaProyphresias,
				this.depart.getName(), this.bathmida, this.xronosDidaktorikou, this.arithmosDimososieyseon,
				this.metaptixiakaEpivlepi, mathimataStr);

	}

	public Professor() {
	}

	public Professor(String name, String surname, int age, String address, long afm, float salary,
			int xroniaProyphresias, Department depart, String bathmida, int xronosDidaktorikou,
			int arithmosDimososieyseon, int metaptixiakaEpivlepi,
			String[] mathimataDidaski) {

		super(name, surname, age, address, afm, salary, xroniaProyphresias, depart);
		this.bathmida = bathmida;
		this.xronosDidaktorikou = xronosDidaktorikou;
		this.arithmosDimososieyseon = arithmosDimososieyseon;
		this.metaptixiakaEpivlepi = metaptixiakaEpivlepi;
		this.mathimataDidaski = mathimataDidaski;

	}

}
