package ch02.lecture.p05print;

public class C07Print {
	// 백준 3003번
	public static void main(String[] args) {
		int age = 24;
		String name = "Gu";
				
		System.out.printf("이름은 %s이고 나이는 %d입니다.%n", name, age);
		System.out.printf("나이는 %d이고 이름은 %s입니다.%n", age, name);
		
		System.out.printf("이름은 %2$s이고 나이는 %1$d입니다.%n", age, name);
	}
}
