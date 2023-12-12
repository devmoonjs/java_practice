package eclipse.shortkey;

class Calculator {
    int left, right;
//    
//    public Calculator(){}
    
    public Calculator(int left, int right) {
    	this.left = left;
    	this.right = right;
    }
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionCalculator extends Calculator{
	public SubstractionCalculator(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public void substract() {
		System.out.println(this.left - this.right);
	}

	
}


public class CalculatorDemo1{
	public static void main(String[] args) {
		
		SubstractionCalculator c1 = new SubstractionCalculator(10, 20);
		c1.setOprands(1200, 20);
		c1.substract();
	}
}

