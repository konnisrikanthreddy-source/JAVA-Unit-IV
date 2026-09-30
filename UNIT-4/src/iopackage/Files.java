package iopackage;
import java.io.File;
public class Files {

	public static void main(String[] args) {
		
		 File f = new File("Java.txt");

	        System.out.println("File name: " + f.getName());
	        System.out.println("Path: " + f.getAbsolutePath());
	        System.out.println("Exists: " + f.exists());
	        //If java.txt is available then f.exists() returns true
	}
}
