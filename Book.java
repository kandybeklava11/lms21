import java.util.Random;


public class Book {




    //private static int idBook= random.nextInt(1,9999999);
    private long id;
    private String name;
    private String author;
    private BooksGenre genre;

    public Book( String  name, String author, BooksGenre genre) {
        Random random=new Random();
this.id= random.nextInt(0,999999);
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BooksGenre getGenre() {
        return genre;
    }

    public void setGenre(BooksGenre genre) {
        this.genre = genre;
    }





    @Override
    public String toString() {
        return "Book: " +
                "id=" + id +
                ", name=" + name +
                ", author=" + author +
                ", genre=" + genre ;

    }
}
