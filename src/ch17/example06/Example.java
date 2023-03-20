package ch17.example06;

import java.util.*;
import java.util.stream.*;

import ch17.sec06.exam01.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26));
		
		System.out.println("for 사용 ####");
		double sum = 0;
		for (Member member : list) {
			sum += member.getAge();
		}
		double avg = sum / list.size();
		
		System.out.println(avg);
		
		System.out.println("stream, collect 사용 ####");
		Double avg2 = list.stream()
			.collect(Collectors.averagingDouble(Member::getAge));
		
			System.out.println(avg2);
		
			System.out.println("IntSteram, average 사용 ####");
		double avg3 = list.stream()
			.mapToInt(Member::getAge)
			.average()
			.getAsDouble();
		System.out.println(avg3);
		
	}
}
