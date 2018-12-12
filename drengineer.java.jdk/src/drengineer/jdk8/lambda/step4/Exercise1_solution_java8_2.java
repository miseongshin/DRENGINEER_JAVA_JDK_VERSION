package drengineer.jdk8.lambda.step4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Exercise1_solution_java8_2 {
	// https://www.youtube.com/watch?v=yubVRLP9Htw&index=15&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
	
/*	Package java.util.function   >> 인터페이스 새로 생성없이 이것이용하면됨. 
 * url : //https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 * 
 * - Interface Predicate<T>    java8_2변경내용 : Predicate 인터페이스의 test 메소드 로 변경  (java8_1의 condition 인터페이스의 test메소드) 
 * - Interface Supplier<T>
 * - Interface Function<T,R>
 * */
	
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

	private static void printConditionaly(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person))
				System.out.println(person);
		}
	}

}
