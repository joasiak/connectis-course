package zzz.library;

import java.time.LocalDate;
import java.util.UUID;

public class BookRepository {

    private String id;
    private Book book;
    private BookCategory category;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BookRepository(Book book) {
        this.id =  UUID.randomUUID().toString();
        this.book = book;
    }

    public BookRepository(Book book, BookCategory category, LocalDate borrowDate, LocalDate returnDate) {
        this.id =  UUID.randomUUID().toString();;
        this.book = book;
        this.category = category;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }
}
