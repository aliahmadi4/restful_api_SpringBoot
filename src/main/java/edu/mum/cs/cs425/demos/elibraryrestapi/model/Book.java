package edu.mum.cs.cs425.demos.elibraryrestapi.model;

import edu.mum.cs.cs425.demos.elibraryrestapi.model.validators.UniqueISBN;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    @UniqueISBN
    @NotBlank(message = "* ISBN is required")
    @Column(name = "isbn", nullable = false, unique = true)
    private String isbn;
    @NotBlank(message = "* Book Title is required")
    @Column(name = "title", nullable = false)
    private String title;
    private Double overdueFee;
    private String publisher;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePublished;

    public Book() {
    }

    public Book(Integer bookId, String isbn, String title, Double overdueFee,
                String publisher, LocalDate datePublished) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.overdueFee = overdueFee;
        this.publisher = publisher;
        this.datePublished = datePublished;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getOverdueFee() {
        return overdueFee;
    }

    public void setOverdueFee(Double overdueFee) {
        this.overdueFee = overdueFee;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", overdueFee=" + overdueFee +
                ", publisher='" + publisher + '\'' +
                ", datePublished=" + datePublished +
                '}';
    }
}
