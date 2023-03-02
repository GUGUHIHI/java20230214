package ch06.lecture.p07constructor;

public class C08Overloading {
	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("Gu", 33, "01-02", false);
		MyClass08 o2 = new MyClass08("Ug", 33, null, false);
		o2.birthDate = "02-03";
				
		MyClass08 o3 = new MyClass08("So", 77, false);
		o3.birthDate = "02-25";
	}
}
