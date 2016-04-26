package net.cbr.software.lambda_examples;

import org.junit.Test;

public class PersonExampleTest {
	
	@Test
	public void test() {
		PersonExample ex = new PersonExample();
		ex.printEmailsForWomenBetween18to25();
	}
}
