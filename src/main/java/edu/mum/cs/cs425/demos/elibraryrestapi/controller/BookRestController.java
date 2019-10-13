package edu.mum.cs.cs425.demos.elibraryrestapi.controller;

import edu.mum.cs.cs425.demos.elibraryrestapi.model.Book;
import edu.mum.cs.cs425.demos.elibraryrestapi.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://127.0.0.1:5500","http://localhost:81"}, allowedHeaders = "*")
public class BookRestController {

    private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = {"/elibrary/rest/api/book/pagedlist"})
    public Page<Book> listBooksPaged(@RequestParam(defaultValue = "0") int pageno) {
        return bookService.getAllBooksPaged(pageno);
    }

    @GetMapping(value = {"/elibrary/rest/api/book/list"})
    public List<Book> listBooks(@RequestParam(defaultValue = "0") int pageno) {
        return bookService.getAllBooks();
    }

}
