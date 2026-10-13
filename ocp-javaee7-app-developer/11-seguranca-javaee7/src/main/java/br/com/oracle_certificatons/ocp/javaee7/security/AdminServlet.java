package br.com.oracle_certificatons.ocp.javaee7.security;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/report")
@ServletSecurity(@HttpConstraint(rolesAllowed = "admin"))
public class AdminServlet extends HttpServlet {

    @EJB
    private ReportService reports;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain;charset=UTF-8");
        resp.getWriter().println("Usuário: " + req.getUserPrincipal() + " admin? " + req.isUserInRole("admin"));
        resp.getWriter().println(reports.adminReport());
    }
}
