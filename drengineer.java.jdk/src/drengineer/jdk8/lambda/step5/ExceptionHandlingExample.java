package drengineer.jdk8.lambda.step5;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;// It is caused zero Exception
/*		쓸수있지만 좋지 않은 예
 *      process(someNumbers, key, (v, k) -> {   
			try {
				System.out.println(v / k);
			} catch (ArithmeticException e) {
				System.out.println("An exception happened");
			}
		});*/
		
		
		process(someNumbers, key, wrapperLambda((v,k) -> System.out.println(v/k)));
		
		
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {

		for (int i : someNumbers) {
			biConsumer.accept(i, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		
		return (v, k) -> {
			try {
				
				//System.out.println("Executing from wrapper");
				biConsumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}
}
