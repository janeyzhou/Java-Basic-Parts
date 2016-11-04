package test;

public class Point1 {
	
	double x = 0;
	double y = 0;
	double z = 0;

	
	public Point1 (double x, double y, double z) {	
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void setxx(double xx) {
		x = xx;
	}
	/*
	public double getx(double x) {
		return x;
	}
	*/
	public void setyy(double yy) {
		y = yy;
	}
	/*
	public double gety(double y) {
		return y;
	}
	*/
	public void setzz(double zz) {
		z = zz;
	}
	/*
	public double getz(double z) {
		return z;
	}
	*/
	public void distance(Point1 p) {
		System.out.println((p.x-x)*(p.x-x) + (p.y-y)*(p.y-y) + (p.z-z)*(p.z-z));//??????return?????,??????
	}

	public static void main (String args[]) {
		
		Point1 pp = new Point1 (1.0, 2.0, 3.0);
		pp.setxx(3.0);
		
		pp.distance(new Point1 (1.0, 2.0, 8.0));
		
		//for??,for(commond1, command2, command3)
		//commond1????,???command2,???true, ??{}???,??false??,????command3
		//1-100?5??3????;101-200???
		int f = 0;
		for(int i=1; i<101; i++){
			if (i%3 == 0) {
				System.out.println(i);
				f++;
				if (f == 5) break;
			}
				
		}
		
		System.out.println();
		
		f = 0;
		int i = 1;
		while (i<101)  {
			if (i%3 == 0) {
				System.out.println(i);
				f++;
			}
			if (f == 5) {
				break;
			}
			i++;
		}
		
		System.out.println();
		//break?continue???????????,????break,continue
		for(i=101; i<120; i++){
			
			boolean b = true;
			
			for(int j=2; j<i; j++){
				if(i%j == 0){
					b = false;
					break;
				}
			}
			
			if(b == false){
				continue;
			}
			
			System.out.println(i);	
		}
		
	
		
		
	}
		
	

}
