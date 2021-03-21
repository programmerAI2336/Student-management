import java.util.Scanner;

public class InputHandler {
    private final Scanner console = new Scanner(System.in);
    public int command;

    public void printUsableCommand() {
        System.out.println("Quit : 0 ");
        System.out.println("Add student's information : 1 ");
        System.out.println("Delete student's information : 2 ");
        System.out.println("Edit student's information : 3 ");
        System.out.println("Sort student list  by name : 4 ");
        System.out.println("Sort student list by GPA : 5 ");
        System.out.println("Print student's information : 6 ");
        System.out.println("Print all student's information : 7");
    }

    public void getCommand() {
        System.out.print("- Enter command : ");
        command = Integer.parseInt(console.nextLine());
    }
}
