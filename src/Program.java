import java.util.ArrayList;

public class Program {
    private static final ArrayList<Student> list = new ArrayList<>();
    private static final InputHandler inputHandler = new InputHandler();
    private static final StudentEditor editor = new StudentEditor(list);
    private static final StudentPrinter printer = new StudentPrinter(list);

    public static void main(String[] args) {
        while (true) {
            inputHandler.printUsableCommand();
            inputHandler.getCommand();
            System.out.println("------------------- Start --------------------");
            editor.handleCommand(inputHandler.command);
            printer.handleCommand(inputHandler.command);
            System.out.println("-------------------- End ---------------------");
        }
    }
}
