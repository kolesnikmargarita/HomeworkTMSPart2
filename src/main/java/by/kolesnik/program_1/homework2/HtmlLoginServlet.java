package by.kolesnik.program_1.homework2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;

public class HtmlLoginServlet extends HttpServlet {

    String name;
    String password;
    HashMap<String, String> accounts = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        accounts.put(getServletConfig().getInitParameter("firstLogin"),
                getServletConfig().getInitParameter("firstPassword"));
        accounts.put(getServletConfig().getInitParameter("secondLogin"),
                getServletConfig().getInitParameter("secondPassword"));
        if(accounts.containsKey(name) && accounts.get(name).equals(password)) {
            resp.addCookie(new Cookie("session", "true"));
        } else {
            resp.addCookie(new Cookie("session", "false"));
        }
        resp.sendRedirect("http://localhost:8080/program_1_war/time");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        name = req.getParameter("username");
        password = req.getParameter("password");
        this.doGet(req, resp);
    }
}
