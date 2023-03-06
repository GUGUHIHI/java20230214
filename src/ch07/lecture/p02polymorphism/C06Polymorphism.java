package ch07.lecture.p02polymorphism;

public class C06Polymorphism {
	public static void main(String[] args) {
		
	}
	
	public static Gun getGun() {
		
		return new Gun();
	}
	
	public static Bow getBow() {
		
		return new Bow();
	}
	
	public static Weapon getWeapon() {
		Bow bow = new Bow();
		return bow;
	}
}
