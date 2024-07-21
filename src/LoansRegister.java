import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoansRegister {

    private List<Loan> LR;
    private static Scanner sc = new Scanner(System.in);

    public LoansRegister(){
        LR = new ArrayList<>();
    }

    public void register_loan(List<User> users, List<Book> inventary){
        System.out.println("Insert user's name: ");
        String user_name = sc.nextLine();
        User user = findUser(users, user_name);
        if (user == null){
            System.out.println("User not found. Register it first");
            return;
        }

        List<Book> loaned_books = new ArrayList<>();
        while(true) {
            System.out.println("Insert book (leave it empty for ending this): ");
            String b = sc.nextLine();
            if(b.isEmpty()){
                break;
            }
            Book book = findBook(inventary, b);
            if(book != null){
                loaned_books.add(book);
            }
            else {
                System.out.println("Book not founded");
                return;
            }
        }

        Loan loan = new Loan(user, loaned_books);
        LR.add(loan);
        System.out.println(loan.register_loan());

        for (Book b : inventary){
            for (Loan l : LR){
                if(l.equals(b)){
                    b.subsQuantity();
                }
            }
        }
    }

    public void register_return(List<Loan> loans, List<Book> inventary){
        System.out.println("Insert user's name: ");
        String user_name = sc.nextLine();
        Loan loan = findLoan(loans, user_name);
        LR.remove(loan);
        for (Book b : inventary){
            for (Book lr : loan.getList_of_books()){
                if(lr == b){
                    b.addQuantity();
                }
            }
        }

    }

    public User findUser(List<User> users, String user_name){
        for (User user : users){
            if (user.getFull_name().equals(user_name)){
                return user;
            }
        }
        return null;
    }

    public Book findBook(List<Book> books, String b){
        for (Book book : books){
            if(book.getTitle().equals(b)){
                return book;
            }
        }
        return null;
    }

    public Loan findLoan(List<Loan> loans, String l){
        for (Loan loan : loans){
            if(loan.getUser().getFull_name().equals(l)){
                return loan;
            }
        }
        return null;
    }

    public List<Loan> getLR() {
        return LR;
    }
}
