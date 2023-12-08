package SOLID;

public class Book {

    public String name;
    public String ISBN;
    public String authorName;

    public int bookPrice;

    public int penPrice;

   public Book(String name , String ISBN, String authorName){
       this.name = name;
       this.ISBN = ISBN;
       this.authorName = authorName;
   }
}

class BookImpl {

    public static void main(String[] args) {


        Book b = new Book("Clean code", "12345", "Rober C.Martin");
        Book b1 = new Book("System Desgin", "345566", "Alex wu");
    }
}


