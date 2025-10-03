import java.util.ArrayList;
import java.util.List;

/**
 * Manages collection of Book objects and related operations.
 */
public class BooksCollection {
    private List<Book> books;

    public BooksCollection() {
        books = new ArrayList<>();
    }

    /**
     * Adds a new book to the collection.
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    /**
     * Lists all books with available copies.
     */
    public void listBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.printf("ID: %d | Title: %s | Author: %s | Available: %d/%d%n",
                    book.getId(), book.getTitle(), book.getAuthor(),
                    book.getAvailableCopies(), book.getTotalCopies());
        }
    }

    /**
     * Issues a book by ID if available.
     */
    public boolean issueBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (book.issueBook()) {
                    System.out.println("Book issued: " + book.getTitle());
                    return true;
                } else {
                    System.out.println("Book '" + book.getTitle() + "' is currently not available.");
                    return false;
                }
            }
        }
        System.out.println("Book ID " + id + " not found.");
        return false;
    }

    /**
     * Returns a book by ID.
     */
    public boolean returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.returnBook();
                System.out.println("Book returned: " + book.getTitle());
                return true;
            }
        }
        System.out.println("Book ID " + id + " not found.");
        return false;
    }
}
