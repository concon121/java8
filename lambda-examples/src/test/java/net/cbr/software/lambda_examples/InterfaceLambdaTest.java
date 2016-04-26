package net.cbr.software.lambda_examples;

import org.junit.Test;

public class InterfaceLambdaTest {

	@Test
	public void test() {

		PersonMatcher matcher = new PersonMatcher();

		PeopleFactory.getPeople().stream().forEach(p -> matcher.process(p, pe -> pe.getAge() == 23));

	}

}
