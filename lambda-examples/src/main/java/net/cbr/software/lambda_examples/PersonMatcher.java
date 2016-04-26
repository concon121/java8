package net.cbr.software.lambda_examples;

public class PersonMatcher {

	public void process(Person p, Matcher<Person> m) {
		boolean matched = m.match(p);
		System.out.println("Matched: " + matched);
	}

}
