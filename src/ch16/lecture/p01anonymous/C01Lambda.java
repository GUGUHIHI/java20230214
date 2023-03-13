package ch16.lecture.p01anonymous;

public class C01Lambda {
	public static void main(String[] args) {
		MyInterface02 o1 = () -> System.out.println("재정의한 메소드");
	
		o1.method1();
	}
}
