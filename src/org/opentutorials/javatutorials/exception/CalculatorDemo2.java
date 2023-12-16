package org.opentutorials.javatutorials.exception;

class Calculator2{
	int left;
	int right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("계산 결과는 ");
			System.out.println(this.left / this.right);
			System.out.println(" 입니다. ");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		} finally {
			System.out.println("DivideEnd");
		}
	}
}


public class CalculatorDemo2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 0);
		c1.divide();
		
		Calculator c2 = new Calculator();
		c2.setOprands(10, 5);
		c2.divide();
	}

}
