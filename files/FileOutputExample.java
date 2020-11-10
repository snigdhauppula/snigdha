public class FileOutputExample {
public static void main(String[] args) {
try {
FileOutputStream ft=new FileOutputStream("D://nim.txt");
String name="this is files concept";
ft.write(name.getBytes());
ft.close();
}catch (IOException e) {
e.printStackTrace();
}
}
}
