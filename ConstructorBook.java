class Book{
String book_title;
String book_author;
int book_pages;
int book_price;
String publisher_name;
int publisher_year;
int book_id;
Book(String book_title, String book_author,int book_pages,int book_price,String publisher_name,int publisher_year,int book_id){
this.book_title=book_title;
this.book_author=book_author;
this.book_pages=book_pages;
this.book_price=book_price;
this.publisher_name=publisher_name;
this.publisher_year=publisher_year;
this.book_id=book_id;

}
void display(){
System.out.println("Book book_title="+book_title);
System.out.println("Book book_author="+book_author);
System.out.println("Book book_pages="+book_pages);
System.out.println("book_price="+book_price);
System.out.println("publisher_name="+publisher_name);
System.out.println("publisher_year="+publisher_year);
System.out.println("Book book_is="+book_id);
}
}
class ConstructorBook{
public static void main(String args[]){
Book b=new Book("world famous great scientists","rajiv tiwar",136,60,"manoj",2010,1256);
b.display();
}
}
