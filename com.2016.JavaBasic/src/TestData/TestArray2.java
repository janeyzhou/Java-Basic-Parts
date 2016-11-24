package TestData;

public class TestArray2 {
	
	public static void main(String[] args) {
		//静态初始化
		int a[][] = {{1,2}, {3,4,5,6}, {7,8,9}};
		int[][] aaaa;
		
		//int a[3][2] = {{1,2}, {3,4,5,6}, {7,8,9}};   数组的长度不能直接指定
		
		int aaa[][] = new int[3][5];
				
		//多维数组的初始化从高维到低维
		int aa[][] = new int[3][];
		aa[0] = new int[2];
		aa[1] = new int[4];
		aa[2] = new int[3];
		
		//非法 int aa[][] = new int[][4]
		
		//打印数组
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print("a[" + i + "][" + j + "]:" + a[i][j] + " ");
			}
			System.out.println();
		}
		
		//引用类型的多维数组
		String[][] s;
		s = new String[3][];
		s[0] = new String[2];
		s[1] = new String[3];
		s[2] = new String[1];
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				s[i][j] = new String("my location:" + i + j);
			}
		}
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				System.out.print(s[i][j] + "; ");
			}
			System.out.println();
		}
		
		//Copy array
		String[] ss = {"Java", "Ruby", "SQL", "Python", "PHP"};
		
		String[] ssBak = new String[6];
		
		System.arraycopy(ss, 1, ssBak, 2, 4);
		for(int i=0; i<ssBak.length; i++){
			System.out.print(ssBak[i] + " ");
		}
		System.out.println();
		
		//copy string array
		String[][] sss = {{"Java", "Ruby"}, {"SQL", "Python", "PHP"}, {"Orocal", "SQL Server", "Rest"}};
		String[][] sssBak = new String[3][];
		System.arraycopy(sss, 0, sssBak, 0, sss.length);
		for(int i=0; i<sssBak.length; i++){
			for(int j=0; j<sssBak[i].length; j++){
				System.out.print(sssBak[i][j] + "; ");
			}
			System.out.println();
		}
		
		//copy int array and change array value
		int[][] aBak = new int[3][];
		System.arraycopy(a, 0, aBak, 0, a.length);
		aBak[2][2] = 100;//这里将数组的值改了，但是a和aBak都指向同一个地方，所以两者的值都变了---arraycopy只是copy了地址并不是值
		for(int i=0; i<aBak.length; i++){
			for(int j=0; j<aBak[i].length; j++){
				System.out.print(aBak[i][j] + "; ");
			}
			System.out.println();
		}
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j] + "; ");
			}
			System.out.println();
		}
		
		
		//二分法查找数据
		int[] aSearch = {3,2,6,4,9,7,1,5};
		
		
	}
	


}
