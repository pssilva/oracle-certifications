package br.com.oracle_certificatons.ocp.javaee7.security;

import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
@DeclareRoles({"admin", "user"})
@RolesAllowed("admin")
public class ReportService {

    @Resource
    private SessionContext ctx;

    /** Herda @RolesAllowed("admin") da classe (segurança declarativa). */
    public String adminReport() {
        return "Relatório sigiloso para " + ctx.getCallerPrincipal().getName();
    }

    /** Segurança programática: mesma regra, decidida no código. */
    @PermitAll
    public String summary() {
        return ctx.isCallerInRole("admin") ? "Resumo completo" : "Resumo público";
    }
}
