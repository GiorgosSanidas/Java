package string;

public class ReplaceExample {

	public static void main(String args[]) {  
		String str = "Object oriented programming in Java";
		str = str.replace("in", "with");
		System.out.println(str);
		str = str.replace("e", null);
		System.out.println(str);
	}
}
