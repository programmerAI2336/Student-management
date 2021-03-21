import java.io.*;
import java.util.ArrayList;

public class StudentData {

    public ArrayList<Student> readData() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Student.txt"));
            list = (ArrayList<Student>) input.readObject();
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeData(ArrayList<Student> list) throws IOException {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Student.txt"));
        output.writeObject(list);
        output.flush();
        output.close();
    }
}
