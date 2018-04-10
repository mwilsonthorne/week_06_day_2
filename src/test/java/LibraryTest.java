import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library publicLibrary;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){
        publicLibrary = new Library("Biblio", 3);
        book1 = new Book("American Psycho");
        book2 = new Book("The Bible");
        book3 = new Book("The Wasp Factory");
        book4 = new Book("The Bee Factory");

    }

    @Test
    public void hasName(){
        assertEquals("Biblio", publicLibrary.getName());
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, publicLibrary.bookCount());
    }

    @Test
    public void canAddBook(){
        publicLibrary.addBook(book1);
        publicLibrary.addBook(book2);
        publicLibrary.addBook(book3);
        assertEquals(3, publicLibrary.bookCount());

    }

    @Test
    public void reachedCapacity(){
        publicLibrary.addBook(book1);
        publicLibrary.addBook(book2);
        publicLibrary.addBook(book3);
        publicLibrary.addBook(book4);
        assertEquals(3, publicLibrary.bookCount() );

    }
}
