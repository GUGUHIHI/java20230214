package ch17.lecture.p03intermediate;

import java.util.*;

import ch17.sec07.exam01.*;

public class C17Sorted {
	public static void main(String[] args) {
		List<Movie> movie = List.of(
				new Movie("avatar", 10000),
				new Movie("slamdunk", 9000),
				new Movie("avengers", 7000),
				new Movie("titanic", 15000));
		
		movie.stream()
				.sorted((a, b) -> a.getPrice() - b.getPrice())
				.forEach(System.out::println);
		
		System.out.println();
		movie.stream()
				.sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
				.forEach(System.out::println);
	}
}

// 생성자, getter
class Movie {
	public Movie(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String title;
	private int price;
}
