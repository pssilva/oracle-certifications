package br.com.oracle_certificatons.ocp.javaee7.jsp;

import java.io.IOException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Controller (Servlet) + View (JSP): padrão MVC clássico. */
@WebServlet("/catalog")
public class CatalogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("books", Arrays.asList("Beginning Java EE 7", "Java EE 7: The Big Picture"));
        req.getRequestDispatcher("/WEB-INF/views/catalog.jsp").forward(req, resp);
    }
}
