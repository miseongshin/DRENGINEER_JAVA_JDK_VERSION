package drengineer.jdk8.lambda.step4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1_solution_java7_1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(//
				new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Mattew", "Arnold", 39));

		// step1 
		//: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		// Step2 
		//: Create a method that prints all elements in the list
		printAll(people);
		printSeperateLine();

		// Step3 
		//: Create a method that prints all people that have last name beginning with C
		printLastNameBeiginningWithC( people);
		

	}

	private static void printSeperateLine() {
		System.out.println("===============================================");
		
	}

	private static void printLastNameBeiginningWithC(List<Person> people) {
		for (Person person : people) {
			if (person.getLastName().startsWith("C"))
				System.out.println(person);
		}
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.toString());
		}
		
	}
}
