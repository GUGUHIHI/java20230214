package ch02.sec05;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if (true) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		int x = 1;
		
		boolean result1 = (x == 2);
		System.out.println("result1: " + result1);
		boolean result2 = (x != 2);
		System.out.println("result2: " + result2);
	}
}
