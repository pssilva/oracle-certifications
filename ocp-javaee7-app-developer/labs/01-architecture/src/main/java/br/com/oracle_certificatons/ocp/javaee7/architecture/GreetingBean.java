package br.com.oracle_certificatons.ocp.javaee7.architecture;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 * EJB Lite empacotado direto no WAR (permitido desde o Java EE 6).
 * Nome JNDI portável: java:global/01-architecture/GreetingBean
 */
@Stateless
public class GreetingBean {

    @PostConstruct
    void init() {
        System.out.println("[GreetingBean] instância criada: " + System.identityHashCode(this));
    }

    public String greet(String name) {
        return "Olá, " + (name == null || name.trim().isEmpty() ? "Java EE 7" : name.trim()) + "!";
    }
}
