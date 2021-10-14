package javaprograms;


	import java.io.PrintWriter; 
	 
	public class PrintWriter1 { 
	public static void main(String[] args) { 
	 
	String data = "This is a text inside the file."; 
	 
	try { 
	PrintWriter output = new PrintWriter("D:/File/print_2021.txt"); 
	int age = 25; 
	output.print(data); 
	output.printf("I am %d years old.", age); 
	System.out.println("Successfully printed in the file "); 
	output.close(); 
	} catch (Exception e) { 
	e.getStackTrace(); 
	} 
	} 
	} 

