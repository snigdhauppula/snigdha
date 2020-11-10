public class FileInputExample {
public static void main(String[] args) throws IOException {
FileInputStream fi=new FileInputStream("D://nim.txt");
int i=fi.read();
System.out.println(i);
System.out.println((char)i);
    

	}

}
