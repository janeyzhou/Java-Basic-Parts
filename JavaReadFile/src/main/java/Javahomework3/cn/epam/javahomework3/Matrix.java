package Javahomework3.cn.epam.javahomework3;


public class Matrix {
		
	public void sortarray (String str[][]){
		for (int i=0; i<str.length; i++)
			for (int m=str[i].length-1; m>0; --m)
				for (int n=0; n<m; ++n){
					if (str[i][n+1].length() < str[i][n].length()){
						String temp = str[i][n];
						str[i][n] = str[i][n+1];
						str[i][n+1] = temp;
					}
				}
	}
	
	public void printmatirx (String str[][]) {
		for (int i=0; i<str.length; i++){
			for (int j=0; j<str[i].length; j++){
				System.out.print(str[i][j]+", ");
			}
			System.out.println();
		}
			
	}

}
