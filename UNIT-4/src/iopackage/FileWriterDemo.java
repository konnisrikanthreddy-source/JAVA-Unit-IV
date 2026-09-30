package iopackage;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		
		 	FileWriter fw = new FileWriter("Java.txt");
		 	fw.write("HELLO SRITW \n Welcome to Java");

		    fw.close();

		    System.out.println("Data written successfully");
	}

}
