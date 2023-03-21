package ch11.lecture.p02try_catch;

public class C09MutipleException {
	public static void main(String[] args) {
		try {
			// 여러 exeption 발사 가능
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}
