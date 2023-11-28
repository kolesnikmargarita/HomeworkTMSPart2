package by.kolesnik.program_1.homework2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@WebServlet(name = "UserTimeServlet", urlPatterns = "/timeInMinsk")
public class TimeServlet extends HttpServlet {

    private static String time;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //ZoneId zoneId = ZoneId.of(req.getParameter("zone") == null ? "Europe/Minsk" : req.getParameter("zone"));
        getServletContext().getRequestDispatcher("/jsp/time.jsp").forward(req, resp);
    }

    public static String getTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Minsk"));
        return zonedDateTime.getHour()
                + ":" + zonedDateTime.getMinute() + ":" + zonedDateTime.getSecond();
    }
}
