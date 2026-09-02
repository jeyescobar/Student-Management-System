import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagment {
    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(Scanner scanner) {
        System.out.println("Introduzca el nombre del estudiante: ");
        String name = scanner.nextLine();

        System.out.println("Introduzca su major: ");
        String major = scanner.nextLine();
        boolean again;

        int id = 0;

        do {
            try {
                System.out.println("Introduzca su ID: ");
                id = scanner.nextInt();
                scanner.nextLine();
                again = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduce solo numeros: ");
                again = true;
                scanner.nextLine();
            }
        } while (again);

        double gpa = 0;

        do {
            try {
                System.out.println("Introduzca su GPA: ");
                gpa = scanner.nextDouble();
                again = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca solo numeros: ");
                scanner.nextLine();
                again = true;
            }
        } while (again);

        Student student = new Student(id, name, major, gpa);
        students.add(student);

        System.out.println("Estudiante añadido.");

        }
        public static void showList() {
            System.out.println("Tu lista: ");
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
        }
    }
        public static void searchStudent(Scanner scanner, ArrayList<Student> students){
            int id;
            System.out.println("Enter the ID of the student: ");
            id = scanner.nextInt();
            for(int i = 0; i < students.size(); i++){
                        if(students.get(i).getId() == id){
                            System.out.println(students.get(i));
                        }
                        else{
                            System.out.println("Estudiante no encontrado");
                        }
            }
        }
}


