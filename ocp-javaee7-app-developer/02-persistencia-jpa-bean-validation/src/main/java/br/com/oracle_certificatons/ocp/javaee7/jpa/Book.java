package br.com.oracle_certificatons.ocp.javaee7.jpa;

import java.io.Serializable;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Version;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@NamedQuery(name = Book.FIND_ALL, query = "SELECT b FROM Book b ORDER BY b.title")
public class Book implements Serializable {

    public static final String FIND_ALL = "Book.findAll";

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private int version;

    @NotNull
    @Size(min = 1, max = 200)
    private String title;

    @Pattern(regexp = "\\d{3}-\\d{10}", message = "ISBN deve seguir o formato 978-0000000000")
    private String isbn;

    @DecimalMin("0.0")
    private Float price;

    @Convert(converter = BookFormatConverter.class)
    private BookFormat format = BookFormat.PAPERBACK;

    protected Book() {
        // exigido pela JPA
    }

    public Book(String title, String isbn, Float price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    public Long getId() { return id; }
    public int getVersion() { return version; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getIsbn() { return isbn; }
    public Float getPrice() { return price; }
    public void setPrice(Float price) { this.price = price; }
    public BookFormat getFormat() { return format; }
    public void setFormat(BookFormat format) { this.format = format; }
}
