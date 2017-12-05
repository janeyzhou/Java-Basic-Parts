package TestBasic;


//继承（游泳运动员是一种运动员），聚集（队长，队员是球队的一部分），组合（头，手是人的必不可少的一部分）
//车--卡车，轿车，他们的go方法可能会不同，在子类中各自去实现

//一个java文件中只能有一个public类，而且文件名与public的类名一致

//main中引用的对象，该对象的类一定要放在main方法所在的类前面
class Mouse {
	public void bit(){
		System.out.println("Dead");
	}
}

public class Dog {
	String color;
	double hight;
	
	public void catchMouse (Mouse m) {//一个类的方法中的参数为另一个类的对象
		m.bit();
	}
	
	public static void main(String args[]) {
		Dog d = new Dog();
		Mouse m = new Mouse();
		d.catchMouse(m);
	}

}


