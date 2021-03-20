import java.util.ArrayList;
import java.util.Comparator;

public class StudentSorter {
    private final ArrayList<Student> list;

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
        for(int i = 0 ; i < list.size() ; i ++){
            for(int j = i + 1 ; j < list.size() ; j ++){
                if(list.get(i).GPA < list.get(j).GPA){
                    Student temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }
    }
}
