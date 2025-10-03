/**
 * Represents a student/user of the library.
 */
public class Student {
    private int studentId;
    private String name;

    /**
     * Constructor initializes student details.
     */
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
}
