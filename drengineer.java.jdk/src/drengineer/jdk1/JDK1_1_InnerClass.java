package drengineer.jdk1;

public class JDK1_1_InnerClass {

	private String data = "YOU";

	class MemberInner {
		void printer() {
			System.out.println(data + "CAN DO IT!");
		}
	}

	public static void main(String[] args) {
		JDK1_1_InnerClass innerClass = new JDK1_1_InnerClass();
		MemberInner memberInner = innerClass.new MemberInner();
		memberInner.printer();
	}
}
