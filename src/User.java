import java.util.ArrayList;
import java.util.List;

public class User {

    private String full_name;
    private String age;
    private String address;
    private String cellphone;
    private List<Loan> loans_history;

    public User(String full_name, String age, String address, String cellphone) {
        this.full_name = full_name;
        this.age = age;
        this.address = address;
        this.cellphone = cellphone;
        loans_history = new ArrayList<>();
    }

    public void register_loans(Loan loan){
        loans_history.add(loan);
    }

    public String getFull_name() {
        return full_name;
    }

    public String show_information(){
        return "Name: " + this.full_name + ", " + "Age: " + this.age + ", " + "Address: " + this.address + ", " + "Cellphone: " + this.cellphone;
    }
}
