package arrays;

public class ArrayTest1 {
	
	public static void main(String[] args) {
		int[] arr0;
		int[] arr1 = {1, 2, 3, 4};
		for (int i = 0; i < arr1.length; i ++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		int[] arr2 = new int [10];
		arr0 = arr2;		
		for (int i = 0; i < arr2.length; i ++) {
			arr2[i] = i+1;
		}
		for (int x: arr0) {
			System.out.println(x);
		}
	}
}
