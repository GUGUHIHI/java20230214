package ch14.lecture.p04name;

public class C03Name {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			Thread t1 = new Thread(() -> {
				Thread t = Thread.currentThread();
				System.out.println(t.getName());
			});
			t1.setName("작업쓰레드");
			t1.start();
		}
	}
}
