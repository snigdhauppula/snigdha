public class StringBufferDemo{
public static void main(String args[]){
StringBuffer sb=new StringBuffer("nimmy");
StringBuffer s=new StringBuffer("nimmy");
System.out.println(sb.charAt(1));
System.out.println(sb.append("uppula"));
System.out.println(sb.equals(s));
System.out.println(sb.indexOf("h"));
System.out.println(sb.substring(2));
System.out.println(sb.substring(1,4));
System.out.println(sb.reverse());
System.out.println(sb.deleteCharAt(6));
sb.setCharAt(6,' ');
System.out.println(sb);
System.out.println(sb.replace(6,10,"varu"));
}
}
