import java.util.Scanner;

/**
 * Handles user input for student details and marks.
 */
public class StudentInput {
    private Scanner scanner;

    public StudentInput() {
        scanner = new Scanner(System.in);
    }

    public Student getStudentFromInput() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // consume newline

        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
        }
        scanner.nextLine(); // consume newline after last input

        return new Student(name, marks);
    }
}
