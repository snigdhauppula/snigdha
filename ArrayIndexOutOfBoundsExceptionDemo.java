public class ArrayIndexOutOfBoundsExceptionDemo{
public static void main(String args[]){
System.out.println("Array IndexOutOf Bouns Exception:");
int[] arr={1,2,3,4,5};
try{
System.out.println(arr[11]);
}catch(ArrayIndexOutOfBoundsException ai){
ai.printStackTrace();
}
finally{
System.out.println("Array IndexOutOfBounds Exception:");
}
}
}