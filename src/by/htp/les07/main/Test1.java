package by.htp.les07.main;

public class Test1 {

	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;

	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}

	public int getSum() {
		int x;
		x = a + b;
		return x;
	}

	public int greatestOfAAndB() {
		if (this.a > this.b) {
			return this.a;
		} else {
			return this.b;
		}
	}

	public void printA() {
		System.out.println("a = " + this.a);
	}

	public void printB() {
		System.out.println("b = " + this.b);
	}

	public void printSum(Test1 test) {

		int x;
		x = test.getSum();
		System.out.println("a + b = " + x);
	}

	public void printGreatest(Test1 test) {
		int x = test.greatestOfAAndB();
		System.out.println("The greatest of A and B is " + x);
	}

}
