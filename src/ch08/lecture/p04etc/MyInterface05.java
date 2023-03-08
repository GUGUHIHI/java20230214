package ch08.lecture.p04etc;

public interface MyInterface05 {
	// public static final field
	
	// public static method
	static void method1() {
		System.out.println("공통된 코드");
		System.out.println("method1 code...");
	}
	static void method2() {
		System.out.println("공통된 코드");
		System.out.println("method2 code...");
	}
	// private
	private static void commom() {
		System.out.println("공통된 코드");
	}
	
	// public abstract instance method
	// public default instance method
	// private instance method
}	
