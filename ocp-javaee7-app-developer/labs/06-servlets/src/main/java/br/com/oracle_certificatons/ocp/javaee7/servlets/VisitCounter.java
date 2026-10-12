package br.com.oracle_certificatons.ocp.javaee7.servlets;

import javax.servlet.http.Cookie;

final class VisitCounter {

    static final String COOKIE = "visits";

    private VisitCounter() {
    }

    static int next(Cookie[] cookies) {
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (COOKIE.equals(c.getName())) {
                    return next(c.getValue());
                }
            }
        }
        return next((String) null);
    }

    /** Regra pura, testável sem container (Cookie depende de recursos do servidor). */
    static int next(String currentValue) {
        if (currentValue == null) {
            return 1;
        }
        try {
            return Integer.parseInt(currentValue) + 1;
        } catch (NumberFormatException e) {
            return 1;
        }
    }
}
