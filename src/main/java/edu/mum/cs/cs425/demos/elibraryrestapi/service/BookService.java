package edu.mum.cs.cs425.demos.elibraryrestapi.service;

import edu.mum.cs.cs425.demos.elibraryrestapi.model.Book;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public abstract List<Book> getAllBooks();
    public abstract Page<Book> getAllBooksPaged(int pageNo);
    public abstract Book saveBook(Book book);
    public abstract Book getBookById(Integer bookId);
    public abstract void deleteBookById(Integer bookId);
    public abstract Optional<Book> findByISBN(String isbn);

}
