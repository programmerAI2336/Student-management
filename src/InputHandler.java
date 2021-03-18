import java.util.Scanner;

public class InputHandler {
    private final Scanner console = new Scanner(System.in);
    public int command;

    public void printUsableCommand() {
        System.out.println("Add student's information : press 1 ");
        System.out.println("Delete student's information : press 2 ");
        System.out.println("Edit student's information : press 3 ");
        System.out.println("Sort student list  by name : press 4 ");
        System.out.println("Sort student list by GPA : press 5 ");
        System.out.println("Print student's information : press 6 ");
        System.out.println("Print all student's information : press 7");
    }

    public void getCommand() {
        System.out.print("- Enter command : ");
        command = Integer.parseInt(console.nextLine());
    }
}
