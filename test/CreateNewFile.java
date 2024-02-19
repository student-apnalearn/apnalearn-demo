package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class CreateNewFile{
	public static void main(String args[]){
		
		File f = new File("C:\\Users\\Pralhad\\Desktop\\Ajay.txt");
		try{
		   f.createNewFile();

		    System.out.println(" File create sucessfully");
		    FileWriter fileWriter=new FileWriter(f);
		    fileWriter.write("Code with Ajay");
		    fileWriter.close();
		    System.out.println(" File wrote sucessfully");
           }catch (IOException e)
           {
           e.printStackTrace();
           }
	} 
}