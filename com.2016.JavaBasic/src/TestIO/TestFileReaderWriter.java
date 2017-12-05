package TestIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReaderWriter {
	//一个字符一个字符的写---字符流
	public static void main(String[] args){
		FileReader freader = null;
		FileWriter fwriter = null;
		int c = 0;
		try {

			freader = new FileReader("C:/Users/Janey_Zhou/workspace/File/fr1.txt");
			fwriter = new FileWriter("C:/Users/Janey_Zhou/workspace/File/fw1.txt");
			
			while((c = freader.read()) != -1) {
				System.out.print((char)c);
				fwriter.write(c);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				freader.close();
				fwriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
			
		
		
		
	}
	
	
}
