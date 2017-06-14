package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andr_ on 29.05.2017.
 */
@WebServlet(name = "StartServlet", urlPatterns={"/start"})
public class StartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginButton = request.getParameter("login");
        String registrationButton = request.getParameter("registration");
        if (loginButton != null){
            response.sendRedirect(request.getContextPath() + "loginform.jsp");
        }
        else if (registrationButton != null){
            response.sendRedirect(request.getContextPath() + "registrationform.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
