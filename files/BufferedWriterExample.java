import java.io.*;  
public class BufferedWriterExample {  
public static void main(String[] args) throws Exception {     
FileWriter wr= new FileWriter("D:\\nim.txt");  
BufferedWriter buf= new BufferedWriter(wr);  
buf.write("Welcome to javaTpoint.");  
buf.close();  
System.out.println("Success");  
}  
}  