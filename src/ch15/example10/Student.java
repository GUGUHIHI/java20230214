package ch15.example10;

import java.util.*;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student (String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}
}
