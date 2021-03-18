import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentEditor {
    private final ArrayList<Student> list;
    private final Scanner console = new Scanner(System.in);
    private final Random random = new Random();

    public StudentEditor(ArrayList<Student> list) {
        this.list = list;
    }

    public void handleCommand(int command) {
        if (command == 1) {
            add();
        }
        if (command == 2) {
            delete();
        }
        if (command == 3) {
            edit();
        }
    }

    public int generateID() {
        int[] usableID = new int[900000];
        for (int i = 0; i < usableID.length; i++) {
            usableID[i] = i + 100000;
        }
        int ID = 0;
        if (!list.isEmpty()) {
            int index = random.nextInt(usableID.length);
            for (Student student : list) {
                if (student.ID != usableID[index]) {
                    ID = usableID[index];
                    break;
                }
            }
        } else {
            ID = usableID[random.nextInt(usableID.length)];
        }
        return ID;
    }

    public void add() {
        int ID = generateID();
        System.out.println("ID : " + ID);
        System.out.print("Name : ");
        String name = getName();
        System.out.print("Birth year : ");
        int birthYear = getBirthYear();
        System.out.print("GPA : ");
        float GPA = getGPA();
        System.out.println("Added new student :");
        System.out.println(ID + "\t" + "|" + "\t" + name + "\t" + "|" + "\t" + birthYear + "\t" + "|" + "\t" + GPA);
        list.add(new Student(ID, name, birthYear, GPA));
    }

    public void delete() {
        System.out.print("ID : ");
        int ID = getID();
        for (Student student : list) {
            if (student.ID == ID) {
                System.out.println("Removed student :");
                System.out.println(student.ID + "\t" + "|" + "\t" + student.name + "\t" + "|" + "\t" + student.birthYear + "\t" + "|" + "\t" + student.GPA);
                list.remove(student);
            } else {
                System.out.println("Wrong ID.");
            }
            break;
        }
    }

    public void edit() {
        System.out.print("ID : ");
        int ID = getID();
        for (Student student : list) {
            if (student.ID == ID) {
                System.out.println("Last name : " + student.name);
                System.out.print("New name : ");
                student.name = getName();
                System.out.println("Last birth year : " + student.birthYear);
                System.out.print("New birth year : ");
                student.birthYear = getBirthYear();
                System.out.println("Last GPA : " + student.GPA);
                System.out.print("New GPA : ");
                student.GPA = getGPA();
                break;
            }
        }
    }

    public int getID() {
        return Integer.parseInt(console.nextLine());
    }

    public String getName() {
        return console.nextLine();
    }

    public int getBirthYear() {
        return Integer.parseInt(console.nextLine());
    }

    public float getGPA() {
        return Float.parseFloat(console.nextLine());
    }
}
