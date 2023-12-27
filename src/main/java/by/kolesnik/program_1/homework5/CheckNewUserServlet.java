package by.kolesnik.program_1.homework5;

import by.kolesnik.program_1.homework5.bean.User;
import by.kolesnik.program_1.homework5.bean.UserBuilder;
import by.kolesnik.program_1.homework5.sources.Regex;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDate;
import java.util.function.Predicate;

@WebServlet(name = "CheckNewUserServlet", urlPatterns = "/user")
public class CheckNewUserServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        User user = new UserBuilder().username(req.getParameter("username"))
                .password(req.getParameter("password"))
                .firstname(req.getParameter("firstname"))
                .lastname(req.getParameter("lastname"))
                .patronymic(req.getParameter("patronymic"))
                .gender(req.getParameter("gender"))
                .birthDat(req.getParameter("birthDate"))
                .city(req.getParameter("city"))
                .phoneNumber(req.getParameter("phoneNumber"))
                .build();

        HttpSession session = req.getSession(true);
        session.setAttribute("user", user);
        if(user.getStatus()) {
            getServletContext().getRequestDispatcher("/jsp/success.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/program_1_war/");
        }
    }
}
