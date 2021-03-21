import java.io.*;
import java.util.ArrayList;

public class Program {
    private static final ArrayList<Student> list = new ArrayList<>();
    private static final InputHandler inputHandler = new InputHandler();
    private static final StudentEditor editor = new StudentEditor(list);
    private static final StudentSorter sorter = new StudentSorter(list);
    private static final StudentPrinter printer = new StudentPrinter(list);

    private static void writeData() throws IOException {
        String fileName = "Student.txt";
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
        output.writeObject(list);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        while (true) {
            inputHandler.printUsableCommand();
            inputHandler.getCommand();
            if (inputHandler.command >= 1 && inputHandler.command <= 7) {
                System.out.println("------------------- Start --------------------");
                editor.handleCommand(inputHandler.command);
                sorter.handleCommand(inputHandler.command);
                printer.handleCommand(inputHandler.command);
                writeData();
                System.out.println("-------------------- End ---------------------");
            } else if (inputHandler.command == 0) {
                System.out.println("Quit program.");
                break;
            } else {
                System.out.println("Quit program.");
            }
        }
    }
}
