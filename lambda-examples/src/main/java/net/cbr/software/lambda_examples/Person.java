package net.cbr.software.lambda_examples;

public class Person {

	private int age;
	private String gender;
	private String email;

	public Person(int age, String gender, String email) {
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
