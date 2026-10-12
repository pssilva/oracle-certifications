package br.com.oracle_certificatons.ocp.javaee7.architecture;

import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Mostra quem o container injeta e quais nomes JNDI padronizados ele expõe.
 */
@WebServlet("/platform")
public class PlatformInfoServlet extends HttpServlet {

    @Resource(lookup = "java:module/ModuleName")
    private String moduleName;

    @Resource(lookup = "java:app/AppName")
    private String appName;

    @EJB
    private GreetingBean greetingBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println(greetingBean.greet(req.getParameter("name")));
        out.println("java:app/AppName       = " + appName);
        out.println("java:module/ModuleName = " + moduleName);
        out.println("Servidor               = " + getServletContext().getServerInfo());
        out.println("Servlet API            = " + getServletContext().getMajorVersion()
                + "." + getServletContext().getMinorVersion());
    }
}
