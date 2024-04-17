package abstracts.example1;

import java.util.Date;

public abstract class Employee {
    private String name;
    private Date hireDate;

    public abstract double getPay();    

    public boolean samePay(Employee other){
         return (this.getPay() == other.getPay());
    }

    public Employee() { }

    public Employee(String theName, Date theDate) { 
    	name=theName;
    	hireDate=theDate;
    }

    public Employee(Employee originalObject) { }

    public String getName( ) { return name; }
    public void setName(String newName) { name=newName; }
    
    public Date getHireDate( ) { return hireDate; }
    public void setHireDate(Date newDate) { hireDate=newDate; }

    public String toString() {
    	return "name: "+name+" hireDate: "+hireDate;
    }
}
