import java.util.Arrays;
import java.util.Scanner;

class Book{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BookAdder bookAdder=new BookAdder(scanner);
        bookAdder.add();
        BookViewer bookViewer=new BookViewer();
        bookViewer.show();
    }
}
class BookAdder{
    Scanner scanner;
    BookStore bookStore;
    BookAdder(Scanner scanner){
        this.scanner=scanner;
        this.bookStore=BookStore.STORE;
    }
    public void add(){
        System.out.println("Book Name");
        String sc=scanner.nextLine();
        bookStore.add(sc);
    }

}
class BookViewer{
    BookStore bookStore;
    BookViewer(){
        this.bookStore=BookStore.STORE;
    }
    public void show(){
        System.out.println("all books");
        for (String book: bookStore.getBooks()){
            System.out.println(book);
        }
    }
}
enum BookStore{
    STORE;
    String[] books={};
    public void add(String data){
        books= Arrays.copyOf(books,books.length+1);
        books[books.length-1]=data;
    }
    public String[] getBooks(){
        return books;
    }
}