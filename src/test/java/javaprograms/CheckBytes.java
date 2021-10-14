package javaprograms;
import java.io.FileInputStream; 

public class CheckBytes { 
 
public static void main(String args[]) { 
 
try { 
FileInputStream input = new FileInputStream("D:/File/WriteFile_2021.txt"); 
 
System.out.println("Available bytes at the beginning: " +input.available()); 
 
// Reads 3 bytes from the file 
input.read(); 
input.read(); 
input.read(); 
 
// Returns the number of available bytes 
System.out.println("Available bytes at the end: " + input.available()); 
 
input.close(); 
} 
 
catch (Exception e) { 
e.getStackTrace(); 
} 
} 
} 