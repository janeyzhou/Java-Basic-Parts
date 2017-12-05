package TestBasic;

//package必须在第一行，package命名规则用域名倒过来
import AssistPackage.Cat;//引入其他的包
//除了lang的包不用，其他包都需要引用，io输入输出，util工具类，比如日期日历、系统特性
//手动打包，打包当前目录的文件 jar -cvf name.jar *.*(表示该目录下的所有文件)


public class Keyword {
	int kthis;
	
	//静态变量放在data
	static int high; //该成员变量只有一份，而且与所有对象共同使用，是公用的，第一次用时被初始化
	String name;
	
	public Keyword(String name){
		this.name = name;
		high++;
	}
	
	public Keyword(int kthis){
		this.kthis = kthis;
	}
		
	public void setKThis(int kthis){
		this.kthis = kthis;//处理成员变量与参数重名的情况
	}
		
	Keyword increament(){
		kthis++;
		return this;//类的方法中使用this表示使用该方法的对象的引用
	}
	
	public void print(){
		System.out.println(kthis);
		System.out.println(high);
		System.out.println(name);
	}
	
	public static void main(String[] args){
		Keyword.high = 100;//直接用类调用静态成员变量
		Keyword keyword1 = new Keyword(10);
		keyword1.increament().print();
		keyword1.high = 1000;
		keyword1.increament().increament().print();//由于increament返回的是这个对象，所以可以继续调用increament方法
		Keyword keyword2 = new Keyword("mimi");
		keyword2.print();//静态成员变量的值可以被每一个对象使用，但是成员变量是每个对象各自的，从打印的kthis和name的值就可以看出来
		
		Cat c = new Cat();
		c.info();
	}

}

