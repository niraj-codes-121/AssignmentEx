package Practice.Constructor;

public class ExampleBook {
    public static void main(String[] args) {
        Book h1= new Book(1,"hewr", 120, 1);
        Book h3= new Book(19,"hewr", 120, 9);
        Book h2= new Book(15,"hewr", 120, 10);
        Book h5= new Book(198,"hewr", 120, 1);
       //h1.printInfo();
        Book [] books = {h1, h2,h3,h5};

        //for each loop to display
        for(Book book: books){
            book.printInfo();
        }


}}

class Book{
    //properties
    int pageNumber;
    String name;
    double price;
    int id;

    // constructor
    Book(int pageNumber, String name, double price, int id){
        this.pageNumber=pageNumber;
        this.name=name;
        this.price=price;
        this.id=id;
    }
    void printInfo(){
        System.out.println("the book pagenumber is:"+this.pageNumber);
        System.out.println("bookname is:"+this.name);
        System.out.println("the price is:"+this.price);
        System.out.println("the id is:"+this.id);
        //System.out.println("..........."+\n);
    }
}