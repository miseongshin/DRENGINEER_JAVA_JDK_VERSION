package drengineer.jdk8.lambda.step6;

import java.util.Arrays;
import java.util.List;

import drengineer.jdk8.lambda.step4.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(//
				new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Mattew", "Arnold", 39));
		
		System.out.println("Using for loop");
		
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in each loop");
		
		for (Person person : people) {
			System.out.println(person);
		}

		System.out.println("Using lambda for each loop");
		//people.forEach(p->System.out.println(p));
		people.forEach(System.out::println);
	}
}
