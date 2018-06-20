import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Animal Farm", "Political");
        book2 = new Book("IT", "Horror");
        book3 = new Book("Dracula", "Horror");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook_true(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBook_false(){
        library.addBook(book1);
        library.addBook(book2);
        // the following book should not be added (max capacity = 2)
        library.addBook(book3);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void correctGenreCount(){
        // Add 2 books of the same genre.
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countByGenre("Horror"));
    }

}
