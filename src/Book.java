import java.util.Objects;

public class Book {

    private String title;
    private String cover;
    private String state;
    private Integer quantity;

    public Book(String title, String cover, String state, Integer quantity) {
        this.title = title;
        this.cover = cover;
        this.state = state;
        this.quantity = quantity;
    }

    public void addQuantity() {
        this.quantity += 1;
    }

    public void subsQuantity(){
        this.quantity -= 1;
    }

    public String show_information(){
        return "Book: " + this.title + ", " + "Cover: " + this.cover + ", " + "State: " + this.state + ", " + "Qty: " + this.quantity;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}

