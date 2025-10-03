/**
 * Represents a student with name, marks per subject, and grade.
 */
public class Student {
    private String name;
    private int[] marks;
    private double percentage;
    private char grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculatePercentage();
        calculateGrade();
    }

    private void calculatePercentage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        this.percentage = (double) total / marks.length;
    }

    private void calculateGrade() {
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    public String getName() { return name; }
    public int[] getMarks() { return marks; }
    public double getPercentage() { return percentage; }
    public char getGrade() { return grade; }
}
