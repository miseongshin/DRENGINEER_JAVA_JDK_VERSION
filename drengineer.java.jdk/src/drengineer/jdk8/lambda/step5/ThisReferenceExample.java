package drengineer.jdk8.lambda.step5;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {

		p.process(i);
	}
	//step3
	public void execute() {
		doProcess(10, i->{
			System.out.println("Value of i is" + i);
			System.out.println(this); //ThisReferenceExample �ν��Ͻ� ��ġ
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
			
			//�� �޼ҵ� ������ Process �ν��Ͻ� ��ġ ��� 
			public String toString() {
				return "This is the anonymous inner class";
			}
		});*/
		
/*		step2
 *      thisReferenceExample.doProcess(10, i->{
			System.out.println("Value of i is" + i);
			//System.out.println(this); //main���� this �� ����� �� ���� ������ ������ ����
			});*/
		
		thisReferenceExample.execute();

	}
	
	public String toString() {
		return "This is the main ThisReferenceExample inner class";
	}
}
