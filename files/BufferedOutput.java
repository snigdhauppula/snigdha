import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedOutput {
public static void main(String[] args) throws FileNotFoundException{
try {
FileOutputStream ft=new FileOutputStream("D://nim.txt");
BufferedOutputStream bo=newBufferedOutputStream(ft);
String name="todays is concept files";
bo.write(name.getBytes());
bo.close();
}catch (IOException e){
e.printStackTrace();
}
}
}
