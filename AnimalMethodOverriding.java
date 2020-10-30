abstract class Animal{
abstract void lifespam();
abstract void sound();
void breath(){
System.out.println("Starts with a key");
}
}
class Dog extends Animal{
void lifespam(){
System.out.println("Dog lifespam is 10 years");
}
void sound(){
System.out.println("Dog sound is woof");
}
}
class Catextends Animal{
void lifespam(){
System.out.println("Cat lifespam is 8 years");
}
void sound(){
System.out.println("Cat sound is meow ");
}
}
class AnimalMethodOverriding{
public static void main(String args[]){
Animal x=new Dog();
x.Breath();
x.lifespam();
x.sound();
x=new Cat();
x.breath();
x.lifespam();
x.sounds();
}
}

