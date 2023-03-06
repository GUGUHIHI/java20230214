package ch07.lecture.p03cast;

import ch06.sec13.exam01.package1.*;

public class C07Instanceof {
	public static void main(String[] args) {
		action(new Animal());
		action(new Horse());
		action(new Fish());
	}
	
	public static void action(Animal a) {
		a.breath();
		
		if(a instanceof Horse) {
			Horse h = (Horse)a;
			h.run();
		} else if(a instanceof Fish) {
			Fish f = (Fish)a;
			f.swim();
		} else {
			System.out.println("둘 중 아무것도 해당하지 않음.");
		}
	}
}
