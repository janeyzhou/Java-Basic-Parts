package TestData;

import java.io.File;//代表的是文件名和路径，并不代表文件中的数据
import java.io.IOException;

public class TestFile {
	
	//路径分割符永远用/
	
	public static void main(String[] args){
		
		//展示文件的目录结构
		File f = new File("C:/Users/Janey_Zhou/workspace/File");//在内存中创建的file对象，并不是在硬盘上创建真实的file
		String[] directory = f.list(); //文件和文件夹
		for(int i=0; i<directory.length; i++){
			System.out.println(directory[i]);
		}
		File[] ff = f.listFiles();  //文件的目录，文件夹的目录
		for(int i=0;i<ff.length; i++){
			System.out.println(ff[i]);
			}
		
		getDirectory(f, 1);
		
		//创建文件
		String separator = File.separator;	//文件路径分隔符
		String filename = "myfile.txt";
		String directory1 = "dir1" + separator + "dir2";
		
		File f1 = new File(directory1, filename);  //directory1是路径，后面的文件
		if (f1.exists()){
			System.out.println("file name: " + f1.getName());
			System.out.println("file size: " + f1.length());
		}else{
			f1.getParentFile().mkdirs();//首先要创建路径，然后才能创建文件
			try{
				f1.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		System.out.println(f1.getAbsolutePath());
		
		
	}
	
	//递归方法
	public static void getDirectory(File f, int level){
		String space = "";
		for(int i=0; i<level; i++){
			space = space + "     ";
		}
		
		File[] f1 = f.listFiles();
		for(int i=0; i<f1.length; i++){
			if(f1[i].isDirectory()){
				System.out.println(space + f1[i].getName());
				getDirectory(f1[i], level+1);
			}else{
				System.out.println(space + f1[i].getName() + space);
			}
		}
		
	}	

}
