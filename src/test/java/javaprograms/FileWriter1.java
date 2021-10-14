package javaprograms;


	import java.io.FileWriter; 
	import java.nio.charset.Charset; 
	 
	public class FileWriter1 { 
	 
	public static void main(String args[]) { 
	 
	String data = "This is the data in the output file"; 
	 
	try { 
	FileWriter output = new FileWriter("D:/File/WriteFile_2021.txt"); 
	output.write(data); 
	System.out.println("Data is written to the file."); 
	FileWriter output1 = new FileWriter("D:/File/WriteFile_2021.txt", Charset.forName("UTF8")); 
	 
	System.out.println("Character encoding of output1: " + output.getEncoding()); 
	System.out.println("Character encoding of output2: " + output1.getEncoding()); 
	 
	output.close(); 
	output1.close(); 
	} catch (Exception e) { 
	e.getStackTrace(); 
	} 
	} 
	} 

