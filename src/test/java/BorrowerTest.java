import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower("Joe");
        book = new Book("IT", "Horror");
        library = new Library();
    }

    @Test
    public void borrowerStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void borrowerCanBorrow(){
        library.addBook(book);
        borrower.borrowFromLibrary(library, book);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
    }
}
