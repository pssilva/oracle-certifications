package br.com.oracle_certificatons.ocp.javaee7.jms;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

    @EJB
    private OrderProducer producer;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String item = req.getParameter("item") == null ? "livro" : req.getParameter("item");
        producer.send(item);
        resp.getWriter().println("Pedido enviado para a fila: " + item);
    }
}
