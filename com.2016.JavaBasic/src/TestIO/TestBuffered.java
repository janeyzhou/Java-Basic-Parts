package TestIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffered {
	
	public static void main(String[] args) {
		
		//字节流：inputstream， outputstream（010101，一个字节）
		//字符流： reader， writer（一个个字符，2个字节）
		//节点流（字节取源数据），处理流（已经存在的流之上的）
		//带缓冲的处理流----先写flush在写close
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		FileWriter fw = null;
		FileReader fr = null;
		int b = 0;
		String s = null;

		try{
			fis = new FileInputStream("C:/Users/Janey_Zhou/workspace/File/br1.txt");
			fos = new FileOutputStream("C:/Users/Janey_Zhou/workspace/File/bw1.txt");
			fr = new FileReader("C:/Users/Janey_Zhou/workspace/File/br2.txt");
			fw = new FileWriter("C:/Users/Janey_Zhou/workspace/File/bw2.txt");

			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
		
			while((b = bis.read()) != -1) {
				System.out.println((char)b);
				bos.write(b);
			}
			
			
			
			while((s = br.readLine()) != null){
				System.out.println(s);
				bw.write(s);
			}
			
			bw.flush();//buffered的输出一定要在关闭前执行flush
			bos.flush();
			
		} catch (IOException e){
			e.printStackTrace();
			
		} finally {
			try {
				//fis.close();
			//	fos.close();
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	


}
