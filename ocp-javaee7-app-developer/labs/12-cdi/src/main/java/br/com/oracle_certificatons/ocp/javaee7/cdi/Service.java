package br.com.oracle_certificatons.ocp.javaee7.cdi;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;

/** Stereotype: agrupa escopo, nome EL e interceptor binding em uma anotação. */
@Stereotype
@RequestScoped
@Named
@Logged
@Retention(RUNTIME)
@Target(TYPE)
public @interface Service {
}
