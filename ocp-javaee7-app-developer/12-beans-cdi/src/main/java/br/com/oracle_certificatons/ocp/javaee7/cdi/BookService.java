package br.com.oracle_certificatons.ocp.javaee7.cdi;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class BookService {

    @Inject
    private NumberGenerator numberGenerator;

    @Inject
    private Event<Book> bookAddedEvent ;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        bookAddedEvent.fire(book);
        return book;
    }
}
