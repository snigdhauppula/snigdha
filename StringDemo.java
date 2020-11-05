class StringDemo{
public static void main(String args[]){
String s="nimmy";
System.out.println(s.charAt(1));
System.out.println(s.concat("potti"));
System.out.println(s.equalsIgnoreCase("nimmy"));
System.out.println(s.indexOf("m"));
s=s.concat("potti");
System.out.println(s.substring(2));
String[] s1=s.split(" ");
System.out.println(s1[10]);
char[] c=s.toCharArray();
System.out.println(c[0]+" "+c[10]);
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
System.out.println(s.endsWith("ti"));
System.out.println(s.isEmpty());
System.out.println(s.lastIndexOf('i'));
s="nimmy potti";
System.out.println(s.trim());
}
}
