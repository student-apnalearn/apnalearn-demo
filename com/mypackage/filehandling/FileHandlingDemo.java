package com.mypackage.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {
	public static void main(String[] args) {
		String folderPath = "D:\\Section 10";
		File file = new File(folderPath + "\\80 CD\\statemwent.pdf");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getUsableSpace());
		System.out.println(file.length());
		System.out.println(file.getName());

		// To create new file in the system.

//		File file1 = new File("D:\\Section 10\\God.jpeg");
//		if (!file1.exists()) {
//			try {
//				file1.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println(file1.isDirectory());
//		System.out.println(file1.isFile());
//		System.out.println(file1.getName());

		// To access all files and folders in specific location.
		checkAllAvailableFiles(folderPath); // method calling
	}

	static void checkAllAvailableFiles(String folderPath) {
		File file2 = new File(folderPath);
		if(file2.exists()) {
			System.out.println("This is a valid folder path");
			File[] files =file2.listFiles();
			for (File newFile : files) {
				if(newFile.isDirectory());
				{
					checkAllAvailableFiles(folderPath+"\\"+newFile.getName());
				}  else{
					System.out.println(newFile.getName()); 
					}
			}	
	    }else {
	    	System.out.println("This is not valid folder path");
	    }
	}
}
