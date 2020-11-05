public class NullPointerExceptionDemo{
public static void main(String args[]){
String name=null;
System.out.println("Null Pointer Exception:");
try{
name.length();
}catch(NullPointerException np){
np.printStackTrace();
}finally{
System.out.println("Null Pointer Exception:");
}
}
}