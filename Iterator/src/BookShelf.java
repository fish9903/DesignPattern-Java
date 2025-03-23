import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return this.books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return this.last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
