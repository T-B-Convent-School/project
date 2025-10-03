import java.util.Scanner;

/**
 * Main class with menu-driven application flow.
 * Coordinates library book and student operations.
 */
public class LibraryManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BooksCollection books = new BooksCollection();
        StudentsCollection students = new StudentsCollection();

        while (true) {
            System.out.println("\nLibrary Management Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Add Student");
            System.out.println("4. List Students");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Total Copies: ");
                    int copies = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(bookId, title, author, copies);
                    books.addBook(book);
                    break;

                case 2:
                    books.listBooks();
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Student Name: ");
                    String name = scanner.nextLine();

                    Student student = new Student(studentId, name);
                    students.addStudent(student);
                    break;

                case 4:
                    students.listStudents();
                    break;

                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    int issueStudentId = scanner.nextInt();
                    scanner.nextLine();

                    Student issueStudent = students.findStudentById(issueStudentId);
                    if (issueStudent == null) {
                        System.out.println("Student not registered.");
                    } else {
                        books.issueBook(issueBookId);
                    }
                    break;

                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    scanner.nextLine();

                    books.returnBook(returnBookId);
                    break;

                case 7:
                    System.out.println("Exiting Library Management System.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
