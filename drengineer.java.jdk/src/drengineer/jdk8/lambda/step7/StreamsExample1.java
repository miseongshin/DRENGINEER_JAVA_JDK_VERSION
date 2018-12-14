package drengineer.jdk8.lambda.step7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import drengineer.jdk8.lambda.step4.Person;

public class StreamsExample1 {

	
	//Streams
	//A sequence of elements supporting sequential and parallel aggregate operations.
	// 시퀀스는 순차(sequential)와 병렬(parallel)연산을  지원하는 요소
	//Collection
	// --> 3사람 이동중
	//           1, 2, 3, 4, 5, 6
	//person1
	//person2
	//person3
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(//
				new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Mattew", "Arnold", 39));
		
/*		people.stream()
		.forEach(p->System.out.println(p.getFirstName()));*/
		System.out.println("step1:");
		people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		
		System.out.println("\r\nstep2 :");
		//Stream<Person> stream = people.stream();
		long count=people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.count();
		System.out.println(count);

		
		System.out.println("\r\nstep3 :");
		long count2=people.parallelStream()
		.filter(p->p.getLastName().startsWith("C"))
		.count();
		System.out.println(count2);
		
		//stream vs parallel stream

		
	}
}
