package coreJava1;

public class function1 {
	
	private int num1;
    private int num2;
    private int num3;
    
    
    public function1() {
    	this.num1=3;
    	this.num2=6;
    	this.num3=7;
    	
    }
    public function1(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public int sum() {
    	return this.num1+this.num2+this.num3;
    }
    public void calculateProduct() {
        int result = num1 * num2 * num3;
        System.out.println("Product is : " + result);
    }
    
    
}
