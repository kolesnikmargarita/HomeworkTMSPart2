package by.kolesnik.program_1.homework2;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.HashMap;

public class HtmlLoginServlet extends HttpServlet {

    String name;
    String password;
    HashMap<String, String> accounts = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        accounts.put(getServletConfig().getInitParameter("firstLogin"),
                getServletConfig().getInitParameter("firstPassword"));
        accounts.put(getServletConfig().getInitParameter("secondLogin"),
                getServletConfig().getInitParameter("secondPassword"));
        if(accounts.containsKey(name) && accounts.get(name).equals(password)) {
            HttpSession session = req.getSession(true);
            session.setAttribute("authorized", "true");
        }
        resp.sendRedirect("/program_1_war/timeInMinsk");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        name = req.getParameter("username");
        password = req.getParameter("password");
        this.doGet(req, resp);
    }
}
