package string;

public class EqualsExample {

	public static void main(String args[]) {  
		String str1 = "Hello";
		String str2 = "hello";
		boolean eq = str1.equals(str2);
		//μην γράφετε ποτέ str1 == str2;
		System.out.println(eq);
	}
}
