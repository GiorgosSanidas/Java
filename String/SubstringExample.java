package string;

public class SubstringExample {

	public static void main(String args[]){  
	      String s1="java example";  
	      String str = s1.substring(s1.indexOf("a"), s1.lastIndexOf("p"));
	      System.out.println(str);
	      System.out.println(s1.substring(2,4));
	      System.out.println(s1.substring(2)); 
	}
}
