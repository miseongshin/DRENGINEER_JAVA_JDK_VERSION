package drengineer.jdk8.lambda.step6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import drengineer.jdk8.lambda.step4.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(//
				new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Mattew", "Arnold", 39));

		System.out.println("Printing all persons");
		//System.out.println(person)  : 인스턴스
		// p -> method(p)
		//person -> System.out.println(person)
		printConditionaly(people, person -> true, System.out::println);
	}

	private static void printConditionaly(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}

}
