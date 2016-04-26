package net.cbr.software.lambda_examples;

public class PersonExample {

	public void printEmailsForWomenBetween18to25() {

		PeopleFactory.getPeople().stream().filter(p -> p.getAge() >= 18 && p.getAge() <= 25).map(p -> p.getEmail())
				.forEach(email -> System.out.println(email));

	}

}
