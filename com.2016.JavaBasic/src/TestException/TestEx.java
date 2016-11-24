package TestException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEx {
	
	//try -- catch----fianlly---throw----throws
	
	public static void main(String[] args){//或者直接在main方法上抛异常---不要使用
		
		Student st = new Student();
		st.manager();
		
		//方法声明的时候直接指明异常
/*		public void someMethod()
							throws SomeException{
			if (someCondition){
				throw new SomeException("xxxx");
			}
		}
*/		
		
/*		
		//方法中定义处理异常的方式
		try{
			someMethod();
		} catch (SomeException e) {
			//coding
		}
*/		
		
		//所有异常来自Throwable类---Direct Known Subclasses: Error（系统内部异常，无法处理）, 
		//Exception（包含一般的exception---必须要捕获的  和runtime exception---经常出的异常，比如被0除，可以不捕获）--是可以处理的
		
		//不捕获出错 throw exception的mEx方法
		TestEx te = new TestEx();
		te.mEx(0);
		
		//调用trows但是没有捕获异常， 就需要自己catch
		try {
			te.fEx();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//捕获错误 throw exception的mEx方法
		try{
			new TestEx().mEx(0);
		} catch (ArithmeticException a){
			a.printStackTrace();
			System.out.println("error");
		}
		
		//必须捕获error---如果使用的方法有些throws，那是一定要用try catch捕获的
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("mytest.txt");
			int b;
			b = fin.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();  //必须执行的段落
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	void mEx(int i) throws ArithmeticException {
		if(i == 0) {
			throw new ArithmeticException("x/0");
		}
	}
	
	
	//这里的意思是抛出异常，但是不处理，谁调用这个方法，就必须自己处理异常
	//
	void fEx() throws FileNotFoundException, IOException {
		FileInputStream fin1 = new FileInputStream("my.txt");
		fin1.read();
	}
	//调用trows但是没有捕获异常， 就需要自己catch
	//try中放可能有异常的语句---catch中放异常的处理（如果没有异常，所有的catch都会被忽略）---finally中放一定要执行的语句，不管有没有异常
	//一般情况catch到异常后，后面的语句无法执行
	void fEx2() {
		try {
			fEx();
		} catch (FileNotFoundException e){ //子异常放在前面
			System.out.println(e.getMessage()); //异常的信息
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //异常事件发生时执行堆栈的内容，就是哪些地方遇到异常了
		} finally {
			System.out.println("finally"); //通常用在关闭文件，删除临时文件
		}
	}
	
	
	
	

}

//自定义异常
class MyException extends Exception{
	int id;
	public MyException(String message, int id){
		super(message);
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
}


class Student{
	
	public void regist(int num) throws MyException {
		if(num < 0) {
			new MyException("人数为负，不合理", 3);//如果异常被捕获了，后面的语句不会执行
		}
		System.out.println("人数：　" + num);
	}
	
	public void manager() {
		try {
			regist(1);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("登记失败， 出错码：　" + e.getId());
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
	
}

class A {
	public void method() throws IOException {}
}

class B1 extends A {
	public void method() throws IOException {}//重写父类抛出异常的方法，只能是相同的异常
}

class B2 extends A {
	public void method() {}//重写父类抛出异常的方法，只能是相同的异常 或者是不抛出异常
}

