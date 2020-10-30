class Sports{
void types(){
System.out.println("1.indoor 2.outdoor");
}
}
class Indoor extends Sports{
void games(){
System.out.println("chess,carrom");
}
}
class Carrom extends Sports{
void play()
{
System.out.println("four members will play carrom");
}
}
class SportsHierarichal{
public static void main(String args[]){
Indoor i=new Indoor();
Carrom cu=new Carrom();
i.types();
i.games();
cu.types();
cu.play();
}
}