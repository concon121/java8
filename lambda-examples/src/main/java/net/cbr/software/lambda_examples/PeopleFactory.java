package net.cbr.software.lambda_examples;

import java.util.ArrayList;
import java.util.List;

public class PeopleFactory {

	public static List<Person> getPeople() {
		
		Person p1 = new Person(23, "Male", "abc@123.com");
		Person p2 = new Person(40, "Feale", "123@123.com");
		Person p3 = new Person(65, "Male", "abcdef@123.com");
		Person p4 = new Person(18, "Feale", "cba@123.com");

		List<Person> roster = new ArrayList<>();
		roster.add(p1);
		roster.add(p2);
		roster.add(p3);
		roster.add(p4);

		return roster;
		
	}
	
}
