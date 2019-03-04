package drengineer.jdk8;

public class InitializeBlock {
	static int numStatic = 2;

	static {
		System.out.println("numStatic:" + numStatic);
		numStatic = 3;
	}

	public InitializeBlock() {
		System.out.println("Inner Constructor: numStatic" + this.numStatic);
	}

	private class InitTest {
		private int num = 1;

		{
			System.out.println("num:"+num);
			num = 2;
		}

		public InitTest() {
			System.out.println("Inner Constructor: num:" + this.num);
		}

	}
	
	public InitTest getInitest() {
		return new InitTest();
	}

	public static void main(String[] args) {
		InitializeBlock initializeBlockStaticNum = new InitializeBlock();
		initializeBlockStaticNum.getInitest();
	}

}
