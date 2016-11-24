package TestData;

public class TestString {

	
	public static void main(String[] args){
		//String常量
		//java.lang.String是不可变的字符序列
		String s1 = "hello";   //这里是string常量--字符串常量放在data seg中
		String s2 = "hello";
		String s3 = "hellollo";
		String s4 = "I am learning Java ";
		
		System.out.println(s1 == s2);//true----因为指向data seg中的同一块区域，但是不是同一个对象
		
		String ss1 = new String("hello");//new 了一个string类型的对象
		String ss2 = new String("hello");
		System.out.println(ss1.equals(ss2));//true-----查看string是否有重写equals方法---重写了equals方法，比较的是字符串序列
		System.out.println(ss1 == ss2);//false---string类型的对象指向不同的heap seg区域
		
		
		//String对象
		char[] c = {'j', 'a', 'v', 'a', 'r', 'u', 'b', 'y'};
		String ss3 = new String(c);//查看string的构造方法
		String ss4= new String(c, 5, 3);//查看string的构造方法
		System.out.println(ss3);
		System.out.println(ss4);
		
		//useful string method
		System.out.println(s1.charAt(1));
		System.out.println(s1.length());
		System.out.println(s3.indexOf("lo"));
		System.out.println(s3.indexOf("o", 4));
		System.out.println(s1.equalsIgnoreCase("HELLO"));
		System.out.println(s3.replace("ll", "dd"));
		System.out.println(s4.startsWith("i"));
		System.out.println(s4.endsWith("a"));
		System.out.println(s4.toUpperCase());
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(3, 6));
		System.out.println(s4.trim());
	
		//静态重载
		Date d = new Date(2014,5,12);
		System.out.println(d.toString());
		String strDate = String.valueOf(d);//静态方法直接string 类调用---其实是将对象的tostring
		System.out.println(strDate);
		int a = 5;
		String strInt = String.valueOf(a);//利用静态valueof方法，把int转换为string类型
		System.out.println(a);
		
		//split method
		int aa = 123456;
		String straa = String.valueOf(aa);
		System.out.println("string lenght: " + straa.length());
		String strsplit = "I am a tester";
		String[] split = strsplit.split("");
		for (int i =0; i<split.length; i++){
			System.out.println(split[i]);
		}

		//统计uppercase lowercase的个数
		String countCase = "I am learning Java";
		String[] splitCountCase = countCase.split("");
		int upperCaseNumber = 0;
		int lowerCaseNumber = 0;
		for (int i=0; i<splitCountCase.length; i++){
			if(splitCountCase[i].matches("[a-z]")){
				lowerCaseNumber++;
			}else if (splitCountCase[i].matches("[A-Z]")){
				upperCaseNumber++;
			}
		}
		System.out.println("upperCaseNumber: " + upperCaseNumber + "; lowerCaseNumber: " + lowerCaseNumber); 
		
		
		//统计一个字符串出现个次数
		String originalStr = "IamJavatestjavarubyjavajavadevjava";
		String countStr = "java";
		int strNumber = 0;
		
		for(int i=0; i<originalStr.length(); i++){
			if(originalStr.indexOf(countStr, i) != -1){
				//System.out.println("i" + i);
				strNumber++;
			//	System.out.println("number" + strNumber);
				i = originalStr.indexOf(countStr, i) + countStr.length()-1;
			}else continue;
		}
		System.out.println("strNumber:　" + strNumber);
		
		String originalStr1 = "IamJavatestjavarubyjavajavadevjava";
		String countStr1 = "java";
		int strNumber1 = 0;
		while(originalStr1.indexOf(countStr1) != -1) {
			strNumber1++;
			originalStr1 = originalStr1.substring(originalStr1.indexOf(countStr1) + countStr1.length());
		}
		System.out.println("strNumber1:　" + strNumber1);
	
	}

}


class Date{
	int year;
	int month;
	int day;
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString(){
		return ("date:　" + this.year + "-" + this.month + "-" +this.day);
	}
}
