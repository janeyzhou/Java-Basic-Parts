package Javahomework3.cn.epam.javahomework3;


public class Calculator {
	
	private int value1;
	private int value2;
	
	public Calculator(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public int addition(int a, int b) {
		int result = 0;
		a=this.value1;
		b=this.value2;
		result = a+b;
		return result;
	}
	
	public int substraction(int a, int b) {
		int result = 0;
		a=this.value1;
		b=this.value2;
		result = a-b;
		return result;
	}
	
	public int multiplicaiton(int a, int b) {
		int result = 0;
		a=this.value1;
		b=this.value2;
		result = a*b;
		return result;
	}
	
	public int division(int a, int b) {
		int result = 0;
		a=this.value1;
		b=this.value2;
		result = a/b;
		return result;
	}
	


}
