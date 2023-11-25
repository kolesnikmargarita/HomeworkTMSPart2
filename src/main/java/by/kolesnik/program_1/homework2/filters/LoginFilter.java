package by.kolesnik.program_1.homework2.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        Cookie[] cookies = ((HttpServletRequest) req).getCookies();
        boolean authorized = false;
        if(cookies != null) {
            for(Cookie cooki : cookies) {
                if(cooki.getName().equals("session")) {
                    if(cooki.getValue().equals("true")) {
                        authorized = true;
                    }
                }
            }
        }
        if(!authorized) {
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
