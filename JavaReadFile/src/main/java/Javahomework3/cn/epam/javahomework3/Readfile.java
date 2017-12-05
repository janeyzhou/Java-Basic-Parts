package Javahomework3.cn.epam.javahomework3;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Readfile {
	
	String[][] str = new String[3][4];
	

	public void readCharacterfromFile(String filePath){
		
        try {
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //check if the file exist
                	FileReader inputstream = new FileReader(file);                	
                	int c;
                	while ((c = inputstream.read()) != -1) {
                		System.out.println("Read character " + (char) c);
                	}
                	System.out.println("Completed Successfully!");
                	if (inputstream != null) {
                		inputstream.close();
                		}
                }
                else
                	System.out.println("Can't find the file");	                  
        } catch (Exception e) {
            System.out.println("Get error while try to read file");
            e.printStackTrace();
        }
        
	}
	
	public void writeCharactertoFile (String filePath,String string[][]){
        try {
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //check if the file exist
                	FileWriter outputstream = new FileWriter(file);  
                	
        			System.out.println("Write character to a new file:");

                	for (int i=0; i<string.length; i++){
                		for (int j=0;j<string[i].length;j++){
                			
            				outputstream.write(string[i][j] +",");                        		

                			}
                		outputstream.write("\r\n");
                		
                	}

            		System.out.println("Completed write character Successfully!");
            		
            		if (outputstream != null) {
            			outputstream.close();
                		}
          		
                }                              
                else
                	System.out.println("Can't find the file");	                  
        } catch (Exception e) {
            System.out.println("Get error while try to write file");
            e.printStackTrace();
        }
	}
	
	public void readLinefromFile(String filePath){
        try {
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //check if the file exist
                	BufferedReader inputstream = new BufferedReader(new FileReader(file));                	
                	String l;               	
                	     
            		System.out.println("Read character from file and saved to Array");   
            		int j=0; 
                	while ((l = inputstream.readLine()) != null) {
                		String str1[] = l.split(",");                		
                		for (int i=0; i<str1.length;i++){
                			str[j][i] = str1[i];
                		}
                		j++; 
                	}
                	
                	for (int i=0; i<str.length;i++)
            			for (int m=0;m<str[i].length;m++)
            				System.out.println(str[i][m]);
                	
                	System.out.println("Read character Completed Successfully!");
                	if (inputstream != null) {
                		inputstream.close();
                		}
                }
                else
                	System.out.println("Can't find the file");	                  
        } catch (Exception e) {
            System.out.println("Get error while try to read file");
            e.printStackTrace();
        }
	}
	
}


