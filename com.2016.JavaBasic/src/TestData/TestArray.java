package TestData;


class Date1{
	int year;
	int month;
	int day;
	
	Date1(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//设计比较方法
	public boolean compare(Date1 d){
		if (this.year > d.year) {
			return true;
		}else if(this.year == d.year && this.month > d.month){
			return true;
		}else if (this.year == d.year && this.month == d.month && this.day > d.day){
			return true;
		}else {
			return false;
		}
	}
	
	//设计排序方法，设计为static的模式，这样可以类直接调用
	public static Date1[] bubbleSorting(Date1[] Date1list){
		Date1 tempd;
		for(int i=Date1list.length; i>0; i--){
			for (int j=0; j< i-1; j++){
				if(!Date1list[j+1].compare(Date1list[j])){
					tempd = Date1list[j+1];
					Date1list[j+1] = Date1list[j];
					Date1list[j] = tempd;
				}
			}
		}
		return Date1list;
	}
	
	//重写toString方法
	public String toString(){
		return this.year + " " + this.month + " " + this.day;
	}
	
}

public class TestArray {
	
	public static void main(String[] args){
		
		//数组在声明的时候不能指定长度， int a[5]
		int a[];		//这是a是null	
		//数组是通过new来创建数组对象的		
		a = new int[5];//分配了内存，并初始化为0
		for(int i=0; i<5; i++){
			a[i] = i;
			System.out.print(a[i] + " ");
		}
		
		String b[];
		b = new String[2];
		b[0] = "3.14";
		b[1] = "3.141";
		double sum;
		sum = Double.parseDouble(b[0]) + Double.parseDouble(b[1]);//将字符串转化成基础类型
		System.out.println(sum);
		
	
		
		Date1 d[];
		d = new Date1[3];		//数组是通过new来创建数组对象的	
		for (int j=0; j<3; j++){
			d[j] = new Date1(2016,5,10-j);	//为引用类型的数组中的每一个元素进行实例化
			}
		Date1[] date = Date1.bubbleSorting(d);//调用排序
		for (int i=0; i<date.length; i++){  
			System.out.println(d[i].toString());   //调用toString打印Date1
		}
		
		
		
		int[] arra1 = {2,4,6,7,3,5,1,9,8};
		int temp;
		for (int i=0; i<arra1.length; i++){    //选择排序
			for (int j=i+1; j<arra1.length; j++){
				if(arra1[i] > arra1[j]){
					temp = arra1[i];
					arra1[i] = arra1[j];
					arra1[j] = temp;
				}
			}
		}
		
		for (int i=0; i<arra1.length-1; i++){
			System.out.print(arra1[i] + " ");
		}
		
		int[] arra2 = {2,4,6,7,3,5,1,9,8};
		int temp1; int k;
		for (int i=0; i<arra2.length; i++){
			k = i;
			for (int j=k+1; j<a.length; j++){
				if (arra2[j] < arra2[k]){
					k=j;
				}
			}
			if (k != i){
				temp1 = arra2[i];
				arra2[i] = arra2[k];
				arra2[k] = temp1;
			}
		}
		
		for (int i=0; i<arra2.length; i++){
			System.out.print(arra2[i] + " ");
		}
		
		
	}
	
	//System.exit(0),退出程序
	
	
	
	
	
}

