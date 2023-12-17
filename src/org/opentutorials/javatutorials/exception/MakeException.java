package org.opentutorials.javatutorials.exception;
import java.io.*;

class DivideException extends Exception{
	DivideException() {
		super();
	}
	DivideException(String message) {
		super(message);
	}
}

class Calculator3{
	int left;
	int right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() throws DivideException{
		if(this.right == 0) {
			throw new DivideException("0으로 나누는 것은 혀용되지 않습니다. ");
		}
		System.out.println(this.left / this.right);
	}
}

public class MakeException {

	public static void main(String[] args) {
		Calculator3 c1 = new Calculator3();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			e.printStackTrace();
		}

	}

}
