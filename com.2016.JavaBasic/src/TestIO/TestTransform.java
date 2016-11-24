package TestIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//http://blog.csdn.net/jiangwei0910410003/article/details/22376895
public class TestTransform {
	//转换流---转换为stream
	public static void main(String[] args){
		try {
			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream("C:/Users/Janey_Zhou/workspace/File/tsformw1.txt"));
			osw.write("i am a tester");
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(
					new FileOutputStream("C:/Users/Janey_Zhou/workspace/File/tsformw1.txt",true), "ISO8859_1");//True表示在后面接着输入文字
			osw.write("welcome to java world");
			System.out.println(osw.getEncoding());
			osw.close();
			
			InputStreamReader isr = new InputStreamReader(
					new FileInputStream("C:/Users/Janey_Zhou/workspace/File/tsformr1.txt"));
			BufferedReader br = new BufferedReader(isr);
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	

}
