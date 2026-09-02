import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagment {
    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(Scanner scanner) {
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Major: ");
        String major = scanner.nextLine();
        boolean again;

        int id = 0;

        do {
            try {
                System.out.println("ID: ");
                id = scanner.nextInt();
                scanner.nextLine();
                again = false;
            } catch (InputMismatchException e) {
                System.out.println("Type only numbers: ");
                again = true;
                scanner.nextLine();
            }
        } while (again);

        double gpa = 0;

        do {
            try {
                System.out.println("GPA: ");
                gpa = scanner.nextDouble();
                again = false;
            } catch (InputMismatchException e) {
                System.out.println("Type only numbers: ");
                scanner.nextLine();
                again = true;
            }
        } while (again);

        Student student = new Student(id, name, major, gpa);
        students.add(student);

        System.out.println("Student added.");

    }

    public static void showList() {
        System.out.println("The List: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public static void searchStudent(Scanner scanner, ArrayList<Student> students) {
        int id;
        System.out.println("Enter the ID of the student: ");
        id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println(students.get(i));
            } else {
                System.out.println("Student not found");
            }
        }
    }

    public static void updateStudent(Scanner scanner, ArrayList<Student> students) {
        int id;
        int choice;
        String newMajor;
        double newGPA;
        boolean repeat = false;

            System.out.println("Enter the ID of the student: ");
        id = scanner.nextInt();
        do{
            for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println("What you want to update? \n" +
                        "1. Major \n" +
                        "2. GPA");
                choice = scanner.nextInt();
                if (choice == 1) {
                    scanner.nextLine();
                    System.out.println("Actual Major: " + students.get(i).getMajor());
                    System.out.println("New Major: ");
                    newMajor = scanner.nextLine();
                    students.get(i).setMajor(newMajor);
                    System.out.println(students.get(i));
                    repeat= false;
                } else if (choice == 2) {
                    scanner.nextLine();
                    System.out.println("Actual GPA: " + students.get(i).getGpa());
                    System.out.println("New GPA: ");
                    newGPA = scanner.nextDouble();
                    students.get(i).setGpa(newGPA);
                    System.out.println("Student Updated: \n" + students.get(i));
                    repeat = false;
                } else {
                    System.out.println("Option doesn't exist");
                    repeat = true;
                }
            }

            }
        }while (repeat);
    }
}


