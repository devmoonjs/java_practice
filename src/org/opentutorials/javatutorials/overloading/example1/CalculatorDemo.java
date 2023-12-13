package org.opentutorials.javatutorials.overloading.example1;

class Calculator{
	int left, int right;
	int third = 0;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right, int third) {
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third){
			
		}
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.setOprands(10,20,30);
		c1.sum();
		c1.avg();
		// commit issue test

	}

}
