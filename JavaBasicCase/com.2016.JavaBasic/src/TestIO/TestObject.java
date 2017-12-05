package TestIO;

import java.io.*;

public class TestObject {
	
	public static void main(String[] args){
		T t = new T();
		t.i = 11;
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/Janey_Zhou/workspace/File/ow1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
			
			FileInputStream fis = new FileInputStream("C:/Users/Janey_Zhou/workspace/File/ow1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			T tread = (T)ois.readObject();
			System.out.println(tread.i);
			System.out.println(tread.j);
			System.out.println(tread.d);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

class T implements Serializable{//如果类要序列化一定要实现serializable接口
	transient int i = 10;//transient的意思是不考虑这个值，忽略掉
	int j = 100;
	double d = 2.3;
	
}

abstract class TT implements Externalizable {
	int i = 0;
}
