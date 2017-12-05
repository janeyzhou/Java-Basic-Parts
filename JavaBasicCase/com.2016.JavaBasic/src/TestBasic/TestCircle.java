package TestBasic;


class Point {
	double x;
	double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	public void setX(double x){
		this.x = x;
	}
	public double getY(){
		return y;
	}
	public void setY(double y){
		this.y = y;
	}
}

class Circle {
	Point o;
	double z;
	public double getZ(){
		return z;
	}
	public void setZ(double z){
		this.z = z;
	}
	
	public Point getO(){
		return o;
	}
	public void setO(double x, double y){
		o.setX(x);
		o.setY(y);
	}

	
	public Circle(Point p, double z){
		this.o = p;
		this.z = z;
		
	}
	
	public Circle(double z){
		o = new Point(4.0,5.0);
		this.z = z;
	}
	
	public void area(){
		double area = 3.14 * z * z;
		System.out.println("erea: " + area);
	}
	public boolean contain(Point p){
		if ((o.x-p.x)*(o.x-p.x) + (o.y-p.y)*(o.y-p.y) > z*z){
			return false;
		}else return true;
	}

}
//局部变量放在stack，使用完了就清除
//new出来的放在heap

public class TestCircle{
	public static void main(String[] args){
		Circle c1 = new Circle(new Point(1.0, 2.0), 3.0);//new出来的c1.z, new出来的point 的x，y放在heap； 但是c1对象放在heap
		Circle c2 = new Circle(6.0);//局部变量放在stack,6.0被赋值给了c2的z后就被系统清理了
		System.out.println("c1 location, radius and area: " + c1.getO().getX() + ", " + c1.getO().getY() + ", " + c1.getZ());
		c1.area();
		System.out.println("c1 location, radius and area: " + c2.getO().getX() + ", " + c2.getO().getY() + ", " + c2.getZ());
		c2.area();
		
		c1.setO(1.1, 2.1);
		c2.setZ(6.1);
		System.out.println("c1 location, radius and area: " + c1.getO().getX() + ", " + c1.getO().getY() + ", " + c1.getZ());
		c1.area();
		System.out.println("c1 location, radius and area: " + c2.getO().getX() + ", " + c2.getO().getY() + ", " + c2.getZ());
		c2.area();
		
		Point p = new Point (8.0, 9.0);
		System.out.println(c1.contain(p));
		System.out.println(c2.contain(p));
		System.out.println(c2.contain(new Point(11.0, 12.0)));
			
	}
}
