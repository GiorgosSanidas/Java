package abstracts.example1;

import java.util.Date;

public class SalariedEmployee extends Employee {
    private double salary; //annual

    public SalariedEmployee() { }

    public SalariedEmployee(String theName, 
			Date theDate, double theSalary) { 
    	super(theName, theDate);
    	salary=theSalary;
    }

    public SalariedEmployee(SalariedEmployee originalObject ) { }

    public double getSalary( ) { return salary; }
    public void setSalary(double newSalary) { salary=newSalary; }

    public double getPay( ) {
        return salary/12;
    }

    public String toString( ) {
    	return "salary: "+salary;
    }
}
