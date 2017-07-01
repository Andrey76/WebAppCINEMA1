package controllers;

import com.mysql.jdbc.Driver;
import dao.impl.UserDAOImpl;
import helper.PropertyHolder;
import model.User;
import utils.Messages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by andr_ on 18.05.2017.
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PropertyHolder prop = PropertyHolder.getInstance();
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = new UserDAOImpl().getByLogin(login);

        if (user == null) {
            request.setAttribute("message", Messages.wrongLog);
            request.getRequestDispatcher("/login").forward(request, response);
            
        }
        if (user != null && user.getPassword().equals(password)) {
            HttpSession session = request.getSession();
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/start");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/loginform.jsp").forward(request, response);

    }

}