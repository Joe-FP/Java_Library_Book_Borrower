import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;
    private String name;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int bookCount() {return this.borrowedBooks.size();}

    public void borrowFromLibrary(Library library, Book book){
        library.removeBook(book);
        this.borrowedBooks.add(book);
    }
}
