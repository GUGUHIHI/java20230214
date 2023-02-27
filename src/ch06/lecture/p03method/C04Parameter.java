package ch06.lecture.p03method;

public class C04Parameter {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		o1.method01();
		
		// 메소드 실행시 정의된 파라미터 타입과 순서, 개수에 맞춰서
		// 아규먼트 입력(전달)
//		o1.method1(3); // 안됨
		
		o1.method02(5);
//		o1.method02(); // 안됨
		
		o1.method03("hello");
		
		String s1 = "java";
		
		o1.method03(s1);
		
		o1.method03(null);
		
		String s2 = null;
		
		o1.method03(s2);
		
		// method4, method5, method6, method7 호출 코드 작성
		
		o1.method04(1, 2);
		
		o1.method05("a", "b");
		
		o1.method06(1, "b");
		
		o1.method07("a", 2);
	}
}
