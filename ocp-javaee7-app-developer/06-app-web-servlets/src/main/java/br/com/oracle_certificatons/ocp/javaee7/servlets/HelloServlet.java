package br.com.oracle_certificatons.ocp.javaee7.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/hello", "/ola"}, loadOnStartup = 1,
        initParams = @WebInitParam(name = "greeting", value = "Olá"))
public class HelloServlet extends HttpServlet {

    private String greeting;

    @Override
    public void init() throws ServletException {
        greeting = getInitParameter("greeting"); // roda uma única vez
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int visits = VisitCounter.next(req.getCookies());
        Cookie cookie = new Cookie(VisitCounter.COOKIE, String.valueOf(visits));
        cookie.setMaxAge(60 * 60); // 0 remove; -1 = só enquanto o browser estiver aberto
        resp.addCookie(cookie);

        HttpSession session = req.getSession();
        session.setAttribute("lastName", req.getParameter("name"));

        resp.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.printf("%s, %s!%n", greeting, req.getParameter("name")); // null sem o parâmetro
        out.println("User-Agent: " + req.getHeader("User-Agent"));
        out.println("Visitas (cookie): " + visits);
        out.println("Sessão: " + session.getId() + " nova=" + session.isNew());
    }
}
