package br.com.oracle_certificatons.ocp.javaee7.jsp;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class BookController {

    @Inject
    private BookEJB bookEJB;
    private Book book = new Book();

    public String doCreateBook() {
        FacesContext ctx = FacesContext.getCurrentInstance();

        if (book.getIsbn() == null || "".equals(book.getIsbn())) {
            ctx. addMessage ( "bookForm:isbn" , new FacesMessage (FacesMessage. SEVERITY_WARN ,
                    "Wrong isbn", "You should enter an ISBN number"));
        }
        if (book.getTitle() == null || "".equals(book.getTitle())) {
            ctx. addMessage ( "bookForm:title" , new FacesMessage(FacesMessage.SEVERITY_WARN,
                    "Wrong title", "You should enter a title for the book"));
        }

        if ( ctx.getMessageList().size() != 0)
            return null;

        try {
            book = bookEJB.createBook(book);
            ctx.addMessage( null , new FacesMessage(FacesMessage. SEVERITY_INFO , "Book created",
                    "The book" + book.getTitle() + " has been created with id=" + book.getId()));

        } catch (Exception e) {
            ctx.addMessage(null, new FacesMessage(FacesMessage. SEVERITY_ERROR ,
                    "Book hasn't been created", e.getMessage()));
        }
        return null;
    }

    // Constructors, getters, setters
}
