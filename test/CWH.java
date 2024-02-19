package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH {
    public static void main(String[] args) throws IOException {

        File myFile = new File("C:\\Users\\Pralhad\\Documents\\test.txt");
        //creating a file
            try {
				myFile.createNewFile();
				System.out.println("File created successfully.");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
        
        //writing in the file
        FileWriter filewrite =new FileWriter("C:\\Users\\Pralhad\\Documents\\test.txt");
        try {
			filewrite.write("Hello guys, how are you?");
			filewrite.write("\n"+"Good bye everyone");
			filewrite.close();
			System.out.println("file written successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        //Reading a file :
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        
        //deleting the file 
        
        File myFile1 = new File("C:\\Users\\Pralhad\\Documents\\test1.txt");
        if(myFile1.delete()){
            System.out.println("I have deleted: " + myFile1.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
        
    }
}