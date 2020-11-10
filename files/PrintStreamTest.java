import java.io.FileOutputStream;  
import java.io.PrintStream;  
public class PrintStreamTest{    
public static void main(String args[])throws Exception{    
FileOutputStream fout=new FileOutputStream("D:\\nim.txt ");    
PrintStream ps=new PrintStream(fout);    
ps.println(2016);    
ps.println("Hello Java");    
ps.println("Welcome to Java");    
ps.close();    
fout.close();    
System.out.println("Success?");    
}    
}    
