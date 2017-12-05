package TestData;

public class TestStringBuffer {
	public static void main(String[] args){
		//buffer string是可变的。表示缓冲string---表示可变的字符序列
		String s1 = "hello";
		String s2 = "world";
		s1 = s1 + s2;  
		System.out.println(s1);  //其实是s1的指针改变了，指向了helloworld的位置，是多增加了一个一块区域存储helloworld
	
		StringBuffer sb1 = new StringBuffer(s1); //stringbuffer可以直接在原来的内存区域进行操作
		StringBuffer sb2 = new StringBuffer("world");
		
		//stringbuffer的构造方法 StringBuffer(), StringBuffer(string s)
		
		
		//stringbuffer methods ---append----insert----delete----indexof----substring-----length-----reverse
		sb1.append(s2).append("/").append(5);
		System.out.println(sb1);
		for(int i=0; i<10; i++){
			sb2.append(i);
		}
		System.out.println(sb2);
		
		sb2.delete(1,2).deleteCharAt(9);
		System.out.println(sb2);
		sb2.insert(1, "love");
		System.out.println(sb2);
		
		//将一个string转换为double的二维数组---方法一
		String s = "1,2;3,4,5;6,7,8,9";
		String[] strs = s.split(";");
		String[][] strs1 = new String[strs.length][];
		for(int m=0; m<strs.length; m++){
			strs1[m] = strs[m].split(",");
		}
		
		for(int m=0; m<strs1.length; m++){
			for(int n=0; n<strs1[m].length; n++){
				System.out.print("String:" + strs1[m][n] + "; ");
			}
			System.out.println();
		}
		
		double[][] d1 = new double[strs.length][];
		for(int m=0; m<strs1.length; m++){
			d1[m] = new double[strs1[m].length];//要先初始化才能直接用
			for(int n=0; n<strs1[m].length; n++){
				d1[m][n] = Double.parseDouble(strs1[m][n]);
				System.out.print("Double:" + d1[m][n] + "; ");
			}
			System.out.println();
		}
		
		
		//将一个string转换为double的二维数组-----方法二
		String str = "1,2;3,4,5;6,7,8,9";
		String[] first = str.split(";");
		double[][] d2 = new double[first.length][];
		for(int m=0; m<first.length; m++){
			String[] second = first[m].split(",");
			d2[m] = new double[second.length];
			for(int n=0; n<second.length; n++){
				d2[m][n] = Double.parseDouble(second[n]);
				
				System.out.print("d:" + d2[m][n] + "; ");
			}
			System.out.println();
		}
		
		
	
		
	}

}
