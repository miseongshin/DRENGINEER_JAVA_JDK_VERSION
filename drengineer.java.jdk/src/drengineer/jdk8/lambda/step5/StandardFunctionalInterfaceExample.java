package drengineer.jdk8.lambda.step5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import drengineer.jdk8.lambda.step4.Person;

public class StandardFunctionalInterfaceExample {
	/*	Package java.util.function   >> 인터페이스 새로 생성없이 이것이용하면됨. 
	 * url : //https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
	 * 
	 * - Interface Predicate<T>    
	 * - Interface Supplier<T>
	 * - Interface Function<T,R>
	 * - Interface Consumer<T>
	 * - Interface BiFunction<T,U,R>
*/
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
		printConditionaly(people, person -> true, person -> System.out.println(person));

		// Step3
		printSeperateLine("Create a method that prints all people that have last name beginning with C");
		printConditionaly(people, person -> person.getLastName().startsWith("C"), person -> System.out.println(person));

		printSeperateLine("Create a method that prints all people that have first name beginning with C");
		printConditionaly(people, person -> person.getFirstName().startsWith("C"), person -> System.out.println(person.getFirstName()));
	}

	private static void printSeperateLine(String statement) {
		System.out.println();
		System.out.println(statement);

	}

	private static void printConditionaly(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}

}
