class StringBuilderDemo{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("nimmy");
StringBuilder s=new StringBuilder("nimmy");
System.out.println(sb);
System.out.println(sb.charAt(1));
System.out.println(sb.append("uppula"));
System.out.println(sb.equals(s));
System.out.println(sb.indexOf("m"));
System.out.println(sb.substring(2));
System.out.println(sb.substring(1,4));
System.out.println(sb.reverse());
System.out.println(sb.deleteCharAt(6));
sb.setCharAt(6,' ');
System.out.println(sb);
System.out.println(sb.replace(6,10,"ymmi"));
}
}
