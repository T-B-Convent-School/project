import java.util.ArrayList;
import java.util.List;

/**
 * Manages collection of Student objects.
 */
public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
