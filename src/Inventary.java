import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventary {

    private List<Book> books;
    private static Scanner sc = new Scanner(System.in);

    public Inventary(){
        books = new ArrayList<>();
    }

    public void register_book(){
        System.out.println("Insert title: ");
       String title = sc.nextLine();
       System.out.println("Insert cover: ");
       String cover = sc.nextLine();
       System.out.println("Insert state: ");
       String state = sc.nextLine();
       System.out.println("Insert quantity: ");
       Integer quantity = sc.nextInt();
       Book book = new Book(title, cover, state, quantity);
       books.add(book);
        System.out.println(book.getTitle() + "Now on system");

    }

    public List<Book> getBooks() {
        return books;
    }

    public void show_information(){
        for(Book book : books){
            System.out.println(book.show_information());
        }
    }
}
