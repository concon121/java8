package net.cbr.software.lambda_examples;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ConsumerExampleTest {

	@Test
	public void test() {
		
		ConsumerExample ex = new ConsumerExample();
		
		List<Person> people = PeopleFactory.getPeople();
		
		people.stream().forEach(p -> assertEquals(1, ex.comsumePerson(p).size()));
		
	}
	
}
