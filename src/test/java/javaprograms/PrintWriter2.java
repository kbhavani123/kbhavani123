package javaprograms;


	import java.io.FileWriter; 
	import java.io.IOException; 
	import java.io.PrintWriter; 
	 
	public class PrintWriter2 { 
	 
	public static void main(String[] args) throws IOException { 
	FileWriter fw = new FileWriter("D:/File/print_2021.txt"); 
	PrintWriter out = new PrintWriter(fw); 
	out.write(97); 
	out.println(100); 
	out.println(true); 
	out.print('c'); 
	out.println("code in side the file"); 
	System.out.println("Successfully printed in the file "); 
	out.close(); 
	} 
	} 

