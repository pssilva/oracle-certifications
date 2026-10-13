package br.com.oracle_certificatons.ocp.javaee7.jsf;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/** Backing bean CDI (não javax.faces.bean.ManagedBean). */
@Named
@RequestScoped
public class GreetingBean implements Serializable {

    @NotNull
    @Size(min = 2, max = 40)
    private String name;

    public String submit() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Olá, " + name + "!", null));
        return "result"; // navegação implícita: result.xhtml
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
