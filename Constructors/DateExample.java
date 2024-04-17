package constructors;

class Date
{
	private int day = 1;
	private int month = 1;
	private int year = 2014;
	private String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
				     "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	public Date(int day, int month, int year)
	{
		if (day <= 0 || day > 31 || month <= 0 || month >12 ){
			return;
		}
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void printDate(){
		System.out.println(day + " " + monthNames[month-1] + " " + year);
	}
}

public class DateExample
{
	public static void main(String args[])
	{
		Date myDate1 = new Date(7,3,2013);
		myDate1.printDate();
		Date myDate2 = new Date(7,13,2013);
		myDate2.printDate();

	}
}