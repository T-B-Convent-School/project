/**
 * Main class to run the Student Grade Calculator application.
 */
public class StudentGradeApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        StudentInput input = new StudentInput();

        Student student = input.getStudentFromInput();
        manager.addStudent(student);

        System.out.println("\nResults:");
        System.out.println("Name: " + student.getName());
        System.out.printf("Percentage: %.2f%%\n", student.getPercentage());
        System.out.println("Grade: " + student.getGrade());
    }
}
