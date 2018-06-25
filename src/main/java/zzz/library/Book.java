package zzz.library;

public class Book {
    String author;
    String title;
    int published;

    public Book(String author, String title, int published) {
        this.author = author;
        this.title = title;
        this.published = published;
    }

    public String getAuthor() {
        return author;
    }
}
