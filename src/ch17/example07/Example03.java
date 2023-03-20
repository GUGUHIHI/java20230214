package ch17.example07;

import java.util.*;
import java.util.stream.*;

public class Example03 {
	public static void main(String[] args) {
		List<Member> list = List.of(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));
		
		List<Member> developers = list.stream()
					.filter(member -> member.getJob().equals("개발자"))
					.collect(Collectors.toList());
		
		developers.stream()
			.forEach(m -> System.out.println(m.getName()));
	}
}