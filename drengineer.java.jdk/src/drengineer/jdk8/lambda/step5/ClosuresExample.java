package drengineer.jdk8.lambda.step5;

public class ClosuresExample {
	
	// �Լ��� ���α׷����� Closures
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
/*		//b�� ���� ���� ������ b�� ����ϰ� ���� >> �Ʒ� doProcess ���� 
		doProcess(a, new Process() {

			@Override
			public void process(int i) {
				//b = 40;  ������ ����.. final �� �ν� ����Ұ���
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