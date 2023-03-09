package ch13.lecture.p01generic;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02<String>();
		o1.setItem("java");
		String s1 = o1.getItem();
		System.out.println(s1.length());
	}
}

// generic type
// T : type parameter
// type parameter 명 작성 관습 : 대문자 한글자
class MyClass02<T> {
	private T item;

	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}
