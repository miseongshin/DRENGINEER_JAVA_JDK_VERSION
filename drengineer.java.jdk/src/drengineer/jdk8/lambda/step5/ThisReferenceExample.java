package drengineer.jdk8.lambda.step5;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {

		p.process(i);
	}
	//step3
	public void execute() {
		doProcess(10, i->{
			System.out.println("Value of i is" + i);
			System.out.println(this); //ThisReferenceExample 인스턴스 위치
			});
		
	}
	
	public static void main(String[] args) {

		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
/*		step1
 *      thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is" + i);
				System.out.println(this); 

			}
			
			//이 메소드 없으면 Process 인스턴스 위치 출력 
			public String toString() {
				return "This is the anonymous inner class";
			}
		});*/
		
/*		step2
 *      thisReferenceExample.doProcess(10, i->{
			System.out.println("Value of i is" + i);
			//System.out.println(this); //main에서 this 를 사용할 수 없기 때문에 컴파일 에러
			});*/
		
		thisReferenceExample.execute();

	}
	
	public String toString() {
		return "This is the main ThisReferenceExample inner class";
	}
}
