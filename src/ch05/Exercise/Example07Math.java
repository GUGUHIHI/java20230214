package ch05.Exercise;

public class Example07Math {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		
		int max = Integer.MIN_VALUE;
		
		for (int n : array) {
			max = Math.max(max, n);
		}
		
		System.out.println(max);
	}
}
