package drengineer.jdk8.lambda.step2;

public class TypeInferenceExample {// 타입 추측 예제

	public static void main(String[] args) {
		
		//1. 
		//StringLengthLambda myLambda = (String s) -> s.length();
		//StringLengthLambda myLambda = (s) -> s.length();
		//StringLengthLambda myLambda = s -> s.length();

		//System.out.println(myLambda.getLength("Hello Lambda"));
		
		//2.
		printLambda(s->s.length());		
		
		
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}

	interface StringLengthLambda {
		
		int getLength(String s);
	}
}
