import java.util.ArrayList;
import java.util.List;

/**
 * Manages collection of Student objects.
 */
public class StudentsCollection {
    private List<Student> students;

    public StudentsCollection() {
        students = new ArrayList<>();
    }

    /**
     * Adds a new student to the collection.
     */
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student registered: " + student.getName());
    }

    /**
     * Finds a student by ID.
     */
    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    /**
     * Lists all registered students.
     */
    public void listStudents() {
        System.out.println("Registered Students:");
        for (Student student : students) {
            System.out.printf("ID: %d | Name: %s%n", student.getStudentId(), student.getName());
        }
    }
}
