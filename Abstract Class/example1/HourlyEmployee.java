package abstracts.example1;

import java.util.Date;

public class HourlyEmployee extends Employee {
    private double wageRate; 
    private double hours; //for the month

    public HourlyEmployee() { }

    public HourlyEmployee(String theName, Date theDate,
                       double theWageRate, double theHours) { 
    	super(theName, theDate);
    	wageRate=theWageRate;
    	hours=theHours;
    }

    public HourlyEmployee(HourlyEmployee originalObject) { }

    public double getRate() { return wageRate; }
    public void setRate(double newWageRate) { wageRate = newWageRate; }

    public double getHours() { return hours; }
    public void setHours(double hoursWorked) { hours = hoursWorked; }

    public double getPay() {
        return wageRate*hours;
    }

    public String toString() {
    	return "wageRate: "+wageRate+" hours: "+hours;
    }
}
