package drengineer.jdk8.lambda.step4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1_solution_java8_1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(//
				new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Mattew", "Arnold", 39));

		// step1
		// : Sort list by last name
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		// Step2
		printSeperateLine("Create a method that prints all elements in the list");
		printConditionaly(people, person -> true);

		// Step3
		printSeperateLine("Create a method that prints all people that have last name beginning with C");
		printConditionaly(people, person -> person.getLastName().startsWith("C"));

		printSeperateLine("Create a method that prints all people that have first name beginning with C");
		printConditionaly(people, person -> person.getFirstName().startsWith("C"));
	}

	private static void printSeperateLine(String statement) {
		System.out.println();
		System.out.println(statement);

	}

	private static void printConditionaly(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person))
				System.out.println(person);
		}
	}

	interface Condition {
		boolean test(Person person);
	}
}
