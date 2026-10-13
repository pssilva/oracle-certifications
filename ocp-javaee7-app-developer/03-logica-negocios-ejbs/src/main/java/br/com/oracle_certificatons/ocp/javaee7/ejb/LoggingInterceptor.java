package br.com.oracle_certificatons.ocp.javaee7.ejb;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {

    @AroundInvoke
    public Object log(InvocationContext ctx) throws Exception {
        long start = System.nanoTime();
        try {
            return ctx.proceed();
        } finally {
            System.out.printf("[%s.%s] %d µs%n", ctx.getTarget().getClass().getSimpleName(),
                    ctx.getMethod().getName(), (System.nanoTime() - start) / 1_000);
        }
    }
}
