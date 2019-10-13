package edu.mum.cs.cs425.demos.elibraryrestapi.model.validators;

import edu.mum.cs.cs425.demos.elibraryrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueISBNValidator implements ConstraintValidator<UniqueISBN, String> {

    private BookService bookService;

    public UniqueISBNValidator() {
    }

    @Autowired
    public UniqueISBNValidator(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void initialize(UniqueISBN constraintAnnotation) {
    }

    @Override
    public boolean isValid(String isbn, ConstraintValidatorContext context) {
        boolean valid;
        if(bookService != null) {
            valid = (isbn != null && !bookService.findByISBN(isbn).isPresent());
        } else {
            valid = true;
        }
        return valid;
    }
}
