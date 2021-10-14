package javaprograms;
import java.io.StringReader; 

public class StringRead { 
public static void main(String[] args) { 
 
String data = "This is the text from StringReader."; 
char[] array = new char[100]; 
 
try { 
StringReader input = new StringReader(data); 
 
//Use the read method 
input.read(array); 
System.out.println("Data read from the string:"); 
System.out.println(array); 
 
input.close(); 
} catch (Exception e) { 
e.getStackTrace(); 
} 
} 
} 
