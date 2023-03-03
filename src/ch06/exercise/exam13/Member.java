package ch06.exercise.exam13;

public class Member {

	private String name;
	private String id;
	private String password;
	private int age;
	private boolean married;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void getName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void getId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void getPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void getAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
