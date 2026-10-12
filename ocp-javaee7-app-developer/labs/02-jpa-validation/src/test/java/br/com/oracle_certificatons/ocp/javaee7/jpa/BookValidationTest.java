package br.com.oracle_certificatons.ocp.javaee7.jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BookValidationTest {

    private static Validator validator;

    @BeforeAll
    static void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void livroValidoNaoTemViolacoes() {
        assertTrue(validator.validate(new Book("Beginning Java EE 7", "978-1430246268", 49.9f)).isEmpty());
    }

    @Test
    void tituloNuloEIsbnInvalidoGeramDuasViolacoes() {
        Set<ConstraintViolation<Book>> violations = validator.validate(new Book(null, "123", 10f));
        assertEquals(2, violations.size());
    }

    @Test
    void converterIdaEVolta() {
        BookFormatConverter converter = new BookFormatConverter();
        assertEquals("E", converter.convertToDatabaseColumn(BookFormat.EBOOK));
        assertEquals(BookFormat.HARDCOVER, converter.convertToEntityAttribute("H"));
    }
}
