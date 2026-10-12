package br.com.oracle_certificatons.ocp.javaee7.servlets;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class TimingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        long start = System.currentTimeMillis();
        chain.doFilter(request, response); // sem esta linha a requisição para aqui
        System.out.printf("[TimingFilter] %s %d ms%n",
                ((HttpServletRequest) request).getRequestURI(), System.currentTimeMillis() - start);
    }

    @Override
    public void destroy() {
    }
}
