package TestBasic;

public class TestOverload {
	
	int id;
	int age;
	//方法的参数不同-参数类型和个数不同
	void max(int a, int b){  //int max(int a, int b)不是重构，是方法同名了，会报错
		System.out.println("int");
		System.out.println(a > b ? a:b);
	}
	
	void max(short a, short b){
		System.out.println("short");
		System.out.println(a > b ? a:b);
	}
	
	void max(float a, float b){//非静态的方法一定要用对象调用
		System.out.println("float");
		System.out.println(a > b ? a:b);
	}
	
	public static void Sum(int a, int b){//静态方法可以用classname.methodname
		System.out.print("Sum = " + a + b);
	}
	
	public TestOverload(){
		id = 0;
		age = 20;
	}
	
	public TestOverload(int _age){
		id = 0;
		age = _age;
	}
	
	public TestOverload(int _id, int _age){
		id = _id;
		age = _age;
	}
	
	public void info(){
		System.out.println("id: " + id + "; age: " + age);
	}
	
	
	public static void main(String[] args){
		TestOverload testoverload = new TestOverload();
		testoverload.max(3.0f, 4.0f);
		testoverload.max(3, 4);
		short a = 3; 
		short b = 4;
		testoverload.max(a, b);
		
		TestOverload testoverload1 = new TestOverload();
		testoverload1.info();
		TestOverload testoverload2 = new TestOverload(21);
		testoverload2.info();
		TestOverload testoverload3 = new TestOverload(1, 22);
		testoverload3.info();//非静态的方法一定要用对象调用
		TestOverload.Sum(1,2);//静态方法可以用classname.methodname
		
		
	}

}