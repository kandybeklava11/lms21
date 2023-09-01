import java.util.List;
import java.util.Random;

public class Librery {


    private int id;
    private String name;

    private String address;
    private List<Book> books;
    private List<Reader> readers;

    public Librery( String name, String address, List<Book> books, List<Reader> readers) {;
        Random random=new Random();
        this.id=random.nextInt(1,999999);
        this.name = name;
        this.address = address;
        this.books = books;
        this.readers = readers;
    }



    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//     public List<Book> getBooks() {
//        return books;
//    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Librery: " +
                "id=" + id +
                ", name=" + name +
                ", address=" + address+
                ", books=" + books +
                ", readers=" + readers ;

    }
}
