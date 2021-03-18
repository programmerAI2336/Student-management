import java.util.ArrayList;
import java.util.Scanner;

public class StudentPrinter {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Student> list;

    public StudentPrinter(ArrayList<Student> list) {
        this.list = list;
    }

    public void handleCommand(int command) {
        if (command == 6) {
            printByID();
        }
        if (command == 7) {
            printAll();
        }
    }

    public void printByID() {
        System.out.print("ID : ");
        int ID = inputID();
        for (Student student : list) {
            if (student.ID == ID) {
                System.out.println("Student's information:");
                System.out.println(student.ID + "\t" + "|" + "\t" + student.name + "\t" + "|" + "\t" + student.birthYear + "\t" + "|" + "\t" + student.GPA);
            }
        }
    }

    public void printAll() {
        System.out.println("All student's information:");
        for (Student student : list) {
            System.out.println(student.ID + "\t" + "|" + "\t" + student.name + "\t" + "|" + "\t" + student.birthYear + "\t" + "|" + "\t" + student.GPA);
        }
    }

    public int inputID() {
        return Integer.parseInt(scanner.nextLine());
    }
}
