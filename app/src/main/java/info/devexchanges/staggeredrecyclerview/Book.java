package info.devexchanges.staggeredrecyclerview;

public class Book {

    private String author;
    private String name;

    public Book(String bookName, String author) {
        this.name = bookName;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }
}