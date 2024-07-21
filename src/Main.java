//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Inventary inventary = new Inventary();
        UserRegister UR = new UserRegister();
        LoansRegister LR = new LoansRegister();

        while(true){
            menu.show();
            System.out.println("Insert option: ");
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    UR.register_user();
                    continue;
                case "2":
                    inventary.register_book();
                    continue;
                case "3":
                    LR.register_loan(UR.getUR(), inventary.getBooks());
                    continue;
                case "4":
                    LR.register_return(LR.getLR(), inventary.getBooks());
                    continue;
                case "5":
                    UR.show_information();
                    continue;
                case "6":
                    inventary.show_information();
                    continue;
                case "7":
                    break;
            }

        }


    }
}