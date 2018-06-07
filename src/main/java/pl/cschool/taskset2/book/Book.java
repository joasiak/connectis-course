package pl.cschool.taskset2.book;

public class Book {

    private String title;
    private Author author;
    private int publishedYear;
    private String publishedBy;
    private Bestseller bestseller = Bestseller.NO;

    public Book(String title, Author author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    public Bestseller getBestseller() {
        return bestseller;
    }

    public void setBestseller(Bestseller bestseller) {
        this.bestseller = bestseller;
    }

    @Override
    public String toString() {
        return "Book: " +
                " \"" + title + '\"' +
                " " + author +
                ", wydana w " + publishedYear +
                ", przez " + publishedBy +
                ", bestseller " + bestseller;
    }
}
