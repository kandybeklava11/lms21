import java.util.List;

public class Database {
    private List<Librery>libraries;
    private List<Book>books;
    private List<Reader> readers;

    public Database(List<Librery> libraries, List<Book> books, List<Reader> readers) {
        this.libraries = libraries;
        this.books = books;
        this.readers = readers;
    }

    public List<Librery> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Librery> libraries) {
        this.libraries = libraries;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }
}
