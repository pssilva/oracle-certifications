package br.com.oracle_certificatons.ocp.javaee7.cdi;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/** Habilitado no beans.xml (alternativa CDI 1.1: @Priority). */
@Logged
@Interceptor
public class LoggedInterceptor {

    @AroundInvoke
    public Object log(InvocationContext ctx) throws Exception {
        System.out.println("[Logged] -> " + ctx.getMethod().getName());
        return ctx.proceed();
    }
}
