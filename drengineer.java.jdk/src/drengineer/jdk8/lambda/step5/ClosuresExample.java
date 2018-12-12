package drengineer.jdk8.lambda.step5;

public class ClosuresExample {
	
	// 함수형 프로그래밍의 Closures
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
/*		//b를 갖고 있지 않지만 b를 사용하고 있음 >> 아래 doProcess 에서 
		doProcess(a, new Process() {

			@Override
			public void process(int i) {
				//b = 40;  컴파일 에러.. final 로 인식 변경불가능
				System.out.println(i+b);
			}
		});*/
		
		doProcess(a, i->System.out.println(i+b));

	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}