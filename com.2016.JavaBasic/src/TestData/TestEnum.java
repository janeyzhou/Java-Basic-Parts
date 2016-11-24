package TestData;

public class TestEnum {
	
	public enum Mycolor {red, green, blue}//其实就是一个类型
	public enum Opener {husband, wife}
	
	public static void main(String[] args){
		//只能取特定值中的一个 enum关键字
		
		Mycolor m = Mycolor.red;//red是一个静态变量
		Opener o = Opener.husband;
		
		switch(m){
		case red:
			System.out.println("red");
			break;
		case green:
			System.out.println("green");
			break;
		case blue:
			System.out.println("blue");
			break;
		default:
			System.out.println("other color");
			break;
		}
		
		
	}

}
