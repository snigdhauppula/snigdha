import java.io.BufferedInputStream;
public class BufferedInput{
public static void main(String[] args) throws IOException {
FileInputStream fi=new FileInputStream("D://nim.txt");
BufferedInputStream bi=new BufferedInputStream(fi);
int i=bi.read();
while(i!=-1){
System.out.println((char)i);
i=bi.read();
}
}
}
