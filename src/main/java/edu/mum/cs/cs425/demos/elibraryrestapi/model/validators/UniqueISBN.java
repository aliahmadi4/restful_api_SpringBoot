package edu.mum.cs.cs425.demos.elibraryrestapi.model.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueISBNValidator.class)
public @interface UniqueISBN {
    String message() default "{edu.mum.cs.cs425.customvalidators.uniqueisbn.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
