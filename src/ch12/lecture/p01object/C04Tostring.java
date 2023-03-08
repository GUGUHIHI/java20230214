package ch12.lecture.p01object;

public class C04Tostring {
	public static void main(String[] args) {
		Object o1 = "java";
		Object o2 = new String("java");
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
	}
}
