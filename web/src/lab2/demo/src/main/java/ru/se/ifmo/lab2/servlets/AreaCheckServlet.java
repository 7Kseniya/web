package ru.se.ifmo.lab2.servlets;

import ru.se.ifmo.lab2.data.ResultRow;
import ru.se.ifmo.lab2.utils.AreaChecker;
import ru.se.ifmo.lab2.utils.Validator;
import org.json.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@WebServlet(urlPatterns = "/checker")
public class AreaCheckServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AreaChecker checker = new AreaChecker();
        Validator validator = new Validator();
        Float x = validator.parseFloat(request.getParameter("x"));
        Float y = validator.parseFloat(request.getParameter("y"));
        Float r = validator.parseFloat(request.getParameter("r"));
        LocalDateTime localDateTime = validator.parseDate(request.getParameter("currentTime"));

        if (x != null && y != null && r != null && localDateTime != null) {
            HttpSession httpSession = request.getSession();

            ResultRow newRow = checker.formNewTableRow(x, y, r, localDateTime);

            List<ResultRow> resultRows = sessionObjectToArrayList(httpSession.getAttribute("table"));
            resultRows.add(newRow);
            httpSession.setAttribute("table", resultRows);

            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            //response.getWriter().println(new Gson().toJson(newRow));
            response.getWriter().println(new JSONObject(newRow));
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().println("bad request \nshould be provided not null parameters");
        }
    }

    private List<ResultRow> sessionObjectToArrayList(Object table) {
        if (table instanceof Collection) {
            return (List<ResultRow>) table;
        } else {
            return new ArrayList<>();
        }
    }
}