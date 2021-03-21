import java.io.*;
import java.util.ArrayList;

public class Program {
    private static final StudentData data = new StudentData();
    private static final ArrayList<Student> list = data.readData();
    private static final InputHandler inputHandler = new InputHandler();
    private static final StudentEditor editor = new StudentEditor(list);
    private static final StudentSorter sorter = new StudentSorter(list);
    private static final StudentPrinter printer = new StudentPrinter(list);

    public static void main(String[] args) throws IOException {
        while (true) {
            inputHandler.printUsableCommand();
            inputHandler.getCommand();
            if (inputHandler.command >= 1 && inputHandler.command <= 7) {
                System.out.println("------------------- Start --------------------");
                editor.handleCommand(inputHandler.command);
                sorter.handleCommand(inputHandler.command);
                printer.handleCommand(inputHandler.command);
                System.out.println("-------------------- End ---------------------");
            } else if (inputHandler.command == 0) {
                System.out.println("Quit program!");
                break;
            }
        }
        data.writeData(list);
    }
}
