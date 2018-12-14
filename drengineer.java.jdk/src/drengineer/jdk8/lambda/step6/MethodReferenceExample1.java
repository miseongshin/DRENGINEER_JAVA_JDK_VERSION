package drengineer.jdk8.lambda.step6;

public class MethodReferenceExample1 {
	
	//Method References and Collections
	//https://www.youtube.com/watch?v=lwwIZuwYmNI&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=21
	public static void main(String[] args) {
		
		//Thread thread = new Thread(() ->printMessage());
		//MethodReferenceExample1::printMessage === () ->printMessage()
		// () -> method()
		Thread thread = new Thread(MethodReferenceExample1::printMessage);
		thread.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
