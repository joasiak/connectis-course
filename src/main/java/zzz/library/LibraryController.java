package zzz.library;

import java.util.*;

public class LibraryController implements DbService{

    private Map<BookCategory, Set<BookRepository>> bookDb = new HashMap<>();

    @Override
    public void add(BookRepository book, BookCategory category) {
        book.setCategory(category);
        if (!bookDb.containsKey(category)) {
            bookDb.put(category, new HashSet<BookRepository>());
        }
            bookDb.get(category).add(book);
    }

    @Override
    public BookRepository getById(String id) {

        /*
        List<BookRepository> bookList = bookDb.values().stream().flatMap(s->s.stream()).filter(s->s.getId().equals(id)).collect(Collectors.toList());
        return (bookList.size()==1) ? bookList.get(0) : null;
        */

        for (BookCategory category : bookDb.keySet()) {
            for (BookRepository book : bookDb.get(category)) {
                if (book.getId().equals(id)) return book;
                break;
            }
        }
        return null;
    }

    @Override
    public Set<Book> getByAuthor(String str) {
        Set<Book> bookSet = new HashSet<>();
        for (BookCategory category : bookDb.keySet()) {
            for (BookRepository book : bookDb.get(category)) {
                if (book.getBook().getAuthor().equals(str)) bookSet.add(book.getBook());
            }
        }
        return bookSet;
    }

    @Override
    public void update(String id, BookRepository updatedBook) {
        BookCategory category = getById(id).getCategory();
        delete(id);
        add(updatedBook, category);
    }

    @Override
    public void delete(String id) {
        for (BookCategory category : bookDb.keySet()) {
            for (BookRepository book : bookDb.get(category)) {
                if (book.getId().equals(id)) bookDb.get(category).remove(book);
                return;
            }
        }
    }
}
