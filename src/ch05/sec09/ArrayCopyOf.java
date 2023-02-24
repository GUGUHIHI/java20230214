package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyOf {
	public static void main(String[] args) {
		String[] arr1 = {"java", "array", "copy"};
		String[] arr2 = new String[5];
		
		arr2 = Arrays.copyOf(arr1, 5);
		
		System.out.println(Arrays.toString(arr2));
	}
}
