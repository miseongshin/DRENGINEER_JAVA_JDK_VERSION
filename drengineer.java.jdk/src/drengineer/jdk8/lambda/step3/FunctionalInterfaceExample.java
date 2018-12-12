package drengineer.jdk8.lambda.step3;

@FunctionalInterface  
public interface FunctionalInterfaceExample {
	public void perform();
	// public void another(); 
	// 동일한 파라메터 리턴을 갖는 추상메서드를 정의하지 못하게함
	// 필수는 아니지만 있으면 동일한 것이 없다는 것을 명시적으로 확인가능
}
