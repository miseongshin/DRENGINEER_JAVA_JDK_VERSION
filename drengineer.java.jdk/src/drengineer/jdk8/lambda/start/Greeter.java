package drengineer.jdk8.lambda.start;

public class Greeter {
	public void greet(Greeting greeting){
		greeting.perform();
	}

	public static void main(String[] args) {
		/*oop:*/
		Greeter greeter = new Greeter();
		HelloOOP helloOOP = new HelloOOP();
		
		/*lambda start*/
		MyLambda greetingFunction = () -> System.out.println("Hello Lambda!");
		MyAdd addFunction = (int a, int b) -> a+b;

		/*lambda version Hello*/
		Greeting myLambdaGreeting = ()->System.out.println("Hello Lambda!!");
		
		Greeting innerClassGreeting = new Greeting() {
			
			@Override
			public void perform() {
				 System.out.println("Hello innerClass!");
				
			}
		};

		helloOOP.perform();
		myLambdaGreeting.perform();
		innerClassGreeting.perform();
		
		greeter.greet(helloOOP);
		greeter.greet(myLambdaGreeting);
		
	}
}

interface MyLambda{
	void foo();
}

interface MyAdd{
	int add(int x , int y);
}