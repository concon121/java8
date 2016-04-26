package net.cbr.software.lambda_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public List<Person> comsumePerson(Person person) {
		
		final List<Person> accepted = new ArrayList<>();
		
		Consumer<Person> copyPerson = (p) -> {
			System.out.println("adding person");
			accepted.add(p);
		};
		
		Consumer<Person> modAge = (p) -> {
			System.out.println("modding age");
			p.setAge(Integer.MAX_VALUE);
		};
		
		modAge.andThen(copyPerson).accept(person);
		
		return accepted;
		
	}
	
}
