import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(String name, int capacity) {
        this.name = name;
        this.bookCollection = new ArrayList<>();
        this.capacity = capacity;

    }

    public String getName() {
        return this.name;
    }

    public int bookCount() {
        return bookCollection.size();
    }

    public void addBook(Book bookToAdd) {
        if (bookCount() < capacity) {
            bookCollection.add(bookToAdd);
        }
    }

}
