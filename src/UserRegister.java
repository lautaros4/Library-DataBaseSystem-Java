import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegister {

    private List<User> UR;
    private static Scanner sc = new Scanner(System.in);

    public UserRegister(){
        UR = new ArrayList<>();
    }

    public void register_user(){
        System.out.println("Insert full name: ");
        String name = sc.nextLine();
        System.out.println("Insert age: ");
        String age = sc.nextLine();
        System.out.println("Insert address: ");
        String address = sc.nextLine();
        System.out.println("Insert cellphone number: ");
        String cellphone = sc.nextLine();
        User user = new User(name, age, address, cellphone);
        UR.add(user);
        System.out.println(user.getFull_name() + " Now on system");

    }

    public List<User> getUR() {
        return UR;
    }

    public void delete_user(User user){
        UR.remove(user);
    }

    public void show_information(){
        for (User user : UR){
            System.out.println(user.show_information());
        }
    }
}
