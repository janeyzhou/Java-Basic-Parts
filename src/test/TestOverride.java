package test;
//对父类方法进行重写，必须有相同的方法名，参数列表，返回值---避免出错最好copy
//重写的方法不能使用比被重写的方法更严格的访问权限
class TT{
	String name;
	double price;
	int n;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	TT(){//一旦重写了默认的构造函数，默认的构造函数就无法使用了
		System.out.println("superclass: " + n);
	}
		
	TT(int n) {
		System.out.println("superclass: " + n);
		this.n = n;
	}
	
	public void info(){
		System.out.println("father info:" + name + price);
	}
	
}

class T extends TT{
	String name;
	String type;
	int n;
	
	//子类的构造过程 必须  必须 必须  调用父类的构造方法,而且调用父类的构造方法必须写在第一句 第一句 第一句
	//super(argument_list)
	T(){
		super(111);
		System.out.println("subclass: " + n);
	}
	
	//子类的构造方法中如果没有显示地调用父类的构造方法，系统默认调用父类的无参数的构造方法
	//子类的构造方法中没有显示的调用父类的构造方法，如果父类中没有无参数的构造方法，这里会报错
	T(int n){
		System.out.println("subclass: " + n);
		this.n = n;
	}
	
	
	T(int n, String name){
		this();    //调用本类的其他的构造方类  -   this(arrgument_list)
		System.out.println("subclass: " + n);
		this.n = n;
		this.name = name;
	}
	
		
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void info(){//这里不能设置更为严格的权限，例如default，或者private，或者protected
		super.info();//指向该对象的父类对象
		name = "childname";
		System.out.println("child info: " + name + price + type);
	}
	
}

public class TestOverride{
	public static void main(String[] args){
		TT tt = new TT();
		tt.setName("ttname");
		tt.setPrice(10.0);
		tt.info();
		T t = new T();
		t.setType("fruit");
		t.info();
		T t1 = new T(222);//子类的构造方法中如果没有显示地调用父类的构造方法，系统默认调用父类的无参数的构造方法
		System.out.println("this method");
		T t2 = new T(333, "t2name");
	}

}
