package by.kolesnik.program_1.homework1.task2;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

public class NameServlet extends HttpServlet {

    Names names;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        names = new Names(
                getServletConfig().getInitParameter("firstName"),
                getServletConfig().getInitParameter("secondName"),
                getServletConfig().getInitParameter("thirdName")
        );
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println(names.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        BufferedReader reader = req.getReader();
        int intValueOfChar;
        StringBuilder result = new StringBuilder();
        while ((intValueOfChar = reader.read()) != -1) {
            result.append((char) intValueOfChar);
        }
        if(!names.addName(result.toString())) {
            resp.sendError(409, "This name already exists!");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        BufferedReader reader = req.getReader();
        int intValueOfChar;
        StringBuilder result = new StringBuilder();
        while ((intValueOfChar = reader.read()) != -1) {
            result.append((char) intValueOfChar);
        }
        if(!names.removeName(result.toString())) {
            resp.sendError(410, "Name not found!");
        }
    }
}
