import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSorter {
    private ArrayList<Student> list;

    public StudentSorter(ArrayList<Student> list) {
        this.list = list;
    }

    public void handleCommand(int command) {
        if (command == 4) {
            sortByName();
            System.out.println("Sorted.");
        }
        if (command == 5) {
            sortByGPA();
            System.out.println("Sorted.");
        }
    }

    public void sortByName() {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
    }

    public void sortByGPA() {

    }
}
