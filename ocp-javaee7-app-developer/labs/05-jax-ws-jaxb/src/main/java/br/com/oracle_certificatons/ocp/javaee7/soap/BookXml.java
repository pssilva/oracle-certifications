package br.com.oracle_certificatons.ocp.javaee7.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookXml {

    @XmlAttribute
    private String isbn;

    @XmlElement(name = "book-title", required = true)
    private String title;

    private Float price;

    @XmlTransient
    private String internalNote;

    public BookXml() {
        // exigido pelo JAXB
    }

    public BookXml(String isbn, String title, Float price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public Float getPrice() { return price; }
    public String getInternalNote() { return internalNote; }
    public void setInternalNote(String internalNote) { this.internalNote = internalNote; }
}
