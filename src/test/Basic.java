package test;



//unicode全球统一字符编码，java运用unicode 中UTF16; UNICODE也包含UTF-8编码

public class Basic {
	
	//注释//, /*   */,  /**    /
	//字符常量 用单引号 ‘a’； 字符串常量用双引号“hello”
	//final 不可改变的变量； private是仅该类可见； public是其他类也可见
	//public static final的成员变量需要全部大写； static的成员变量可以直接引用 class.成员变量
	//变量要先申明，再赋值，再使用
	//程序执行： 先把code load到内存code segment区域
	//操作系统从main方法执行
	//java虚拟机先将java文件编译为class文件,然后再解释给对应的系统（java是解释型语言）
	//局部变量：1 方法内变量；2 方法的参数----作用域是方法中，俗称{}内
	//成员变量： 类中方法外---作用域是类中
	//boolean只能是true和false； 整数默认是int； 小数默认是double
	public static void main (String args[]) {
		long l = 100L;
		float f = 1.1F;
		char echar = 'a';
		char achar = '中';
		int i = 10;
		String str = "hello world" + i;
		
		
		System.out.println(str);//+运算符，只要一遍有string，都会将其他的都转换为string
		System.out.println(i);//打印时任何类型都会转换为string
	}
	
	
	

}
