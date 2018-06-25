package zzz.library;

import java.util.Set;

public interface DbService {

    void add(BookRepository book, BookCategory category);
    BookRepository getById(String id);
    Set<Book> getByAuthor(String str);
    void update(String id, BookRepository updatedBook);
    void delete(String id);



}
