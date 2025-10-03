/**
 * Represents an individual book in the library with details.
 */
public class Book {
    private int id;                  // Unique ID of the book
    private String title;            // Title of the book
    private String author;           // Author's name
    private int totalCopies;         // Total copies of this book
    private int availableCopies;     // Currently available copies

    /**
     * Constructor initializes book details.
     */
    public Book(int id, String title, String author, int totalCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;  // Initially, all copies are available
    }

    // Getters...
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getTotalCopies() { return totalCopies; }
    public int getAvailableCopies() { return availableCopies; }

    /**
     * Issues a book if available.
     * @return true if book issued successfully, false if no copies available
     */
    public boolean issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        }
        return false;
    }

    /**
     * Returns a book and updates availability.
     */
    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
        }
    }
}
