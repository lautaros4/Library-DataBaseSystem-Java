import java.util.ArrayList;
import java.util.List;

public class Loan {

    private User user;
    private List<Book> list_of_books;

    public Loan(User user, List list_of_books) {
        this.user = user;
        this.list_of_books = list_of_books;
    }

    public String register_loan(){
        this.user.register_loans(this);
        return "Loan successfully registered " + show_information();
    }

    public String show_information(){
        String joinedstr = null;
        for (Book book : this.list_of_books){
            joinedstr += book.getTitle() + " ,";
        }
        return "User: " + user.getFull_name() + "Books: " + joinedstr;
    }

    public User getUser() {
        return user;
    }

    public List<Book> getList_of_books() {
        return list_of_books;
    }
}
