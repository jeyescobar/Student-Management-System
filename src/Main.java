import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int option = getOption(scanner);
    }

    public static void printMenu() {
        System.out.println("===== STUDENT MANAGMENT SYSTEM ===== \n" +
                "1. Add Student \n" +
                "2. View Students \n" +
                "3. Search Student \n" +
                "4. Update Student\n" +
                "5. Delete Student\n" +
                "6. Exit\n \n" +
                "Select an option: ");
    }

    public static int getOption(Scanner scanner) {
        int numberSelected = 0;
        boolean repeat = false;
        do{
            try{
                numberSelected = scanner.nextInt();
                if (numberSelected >= 1 && numberSelected <= 6) {
                    return numberSelected;
                } else{
                    System.out.println("Option doesnt exist\n"+
                            "Select the number of the option.");
                    repeat = true;
                }
            }catch(InputMismatchException e){
                System.out.println("Its not an option \n" +
                        "Select the number of the option.");
                scanner.next();
                repeat = true;
            }
        }while(repeat);
        return numberSelected;
    }
}

