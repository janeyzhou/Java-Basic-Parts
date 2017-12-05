package TestIO;

import java.io.*;

public class TestFileInputStream {
	//一个字节一个字节的写---字节流
	public static void main(String[] args){
		FileInputStream finput = null;
		FileOutputStream foutput = null;
		int b = 0;
		try {//try catch不能乱使用，可以作为一个整体来写
			
			finput = new FileInputStream("C:/Users/Janey_Zhou/workspace/File/fis1.txt");
			foutput = new FileOutputStream("C:/Users/Janey_Zhou/workspace/File/fos1.txt");

			while ((b = finput.read()) != -1) {
				System.out.print((char)b);
				foutput.write(b);
				
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				finput.close();
				foutput.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
			
	}

}
