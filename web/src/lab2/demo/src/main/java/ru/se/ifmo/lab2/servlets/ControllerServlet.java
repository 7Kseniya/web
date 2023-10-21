package ru.se.ifmo.lab2.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.json.JSONArray;

import ru.se.ifmo.lab2.data.ResultRow;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/controller")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        addTableToSessionIfNotExist(request);
        if (request.getParameter("x") != null && request.getParameter("y") != null
                && request.getParameter("r") != null && request.getParameter("currentTime") != null) {
            getServletContext().getRequestDispatcher("/checker").forward(request, response);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().setAttribute("table", new ArrayList<>());
        response.setStatus(HttpServletResponse.SC_OK);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        addTableToSessionIfNotExist(request);

        JSONArray jsonArray = new JSONArray((List<ResultRow>)request.getSession().getAttribute("table"));

        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println(jsonArray);
    }
    private void addTableToSessionIfNotExist(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        if (httpSession.getAttribute("table") == null) httpSession.setAttribute("table", new ArrayList<>());
    }
}