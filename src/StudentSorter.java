import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSorter {
    private final ArrayList<Student> list;

    public StudentSorter(ArrayList<Student> list) {
        this.list = list;
    }

    public void handleCommand(int command) {
        if (command == 4) {
            sortByName();
        }
        if (command == 5) {
            sortByGPA();
        }
    }

    public void sortByName() {
        Comparator nameSorter = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };
        list.sort(nameSorter);
    }

    public void sortByGPA() {

    }
}
