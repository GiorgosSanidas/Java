package string;

public class StringFormatExample {

	public static void main(String args[]) {  
		float floatVar = 5.333F; 
		int intVar = 100;
		String stringVar = "Python";
		String fs = String.format("The value of the float variable is " + 
				"%f, while the value of the integer " +  
				"variable is %d, and the string " + 
				"is \"%s\"", floatVar, intVar, stringVar);  
		System.out.println(fs);
	}
}
