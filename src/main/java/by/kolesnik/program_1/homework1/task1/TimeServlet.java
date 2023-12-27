package by.kolesnik.program_1.homework1.task1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ZoneId zoneId = ZoneId.of(req.getParameter("zone") == null ? "Europe/Minsk" : req.getParameter("zone"));
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        resp.getWriter().println(zonedDateTime.getHour()
                + ":" + zonedDateTime.getMinute() + ":" + zonedDateTime.getSecond());
    }
}
