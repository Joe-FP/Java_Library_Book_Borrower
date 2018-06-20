import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    private HashMap<String, Integer> hashBooks;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 2;

        this.hashBooks = new HashMap<String, Integer>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book){
        if (this.books.size() < this.capacity){
            this.books.add(book);

            String genre = book.genre();

            if (this.hashBooks.containsKey(genre)){
                //Genre already exists.
                // Update the HashMap by incrementing value.
                this.hashBooks.put(genre, this.hashBooks.get(genre) + 1);
            } else{
                // Genre doesn't exist. Add the key value pair.
                this.hashBooks.put(genre, 1);
            }
        }
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }

    public int countByGenre(String genre){
        return this.hashBooks.get(genre);
    }

}
