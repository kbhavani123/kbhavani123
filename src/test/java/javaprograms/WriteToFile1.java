package javaprograms;
import java.io.FileOutputStream; 
import java.io.OutputStreamWriter; 
 
public class WriteToFile1 { 
 
public static void main(String args[]) { 
 
String data = "wavelabs is for artficial intelligence."; 
 
try { 
FileOutputStream file = new FileOutputStream("D:/File/WriteFile_2021.txt"); 
OutputStreamWriter output = new OutputStreamWriter(file); 
output.write(data); 
System.out.println("Data is written to the file."); 
output.close(); 
} 
 
catch (Exception e) { 
e.getStackTrace(); 
} 
} 
} 
