package controllers;

import com.mysql.jdbc.Driver;
import dao.api.Dao;
import dao.impl.UserDAOImpl;
import helper.PropertyHolder;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

@WebServlet(name = "RegistrationServlet", urlPatterns = {"/reg"})
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PropertyHolder prop = PropertyHolder.getInstance();
        String firstName = request.getParameter("user_name");
        String lastName = request.getParameter("user_surname");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String[] birtMon = request.getParameterValues("BirthMonth");
        String dayOfBirth = request.getParameter("BirthDay");
        String birthYear = request.getParameter("BirthYear");
        String email = request.getParameter("user_mail");
        String sex = request.getParameter("gender");
        String dateOfBirthday = birthYear + "-" + birtMon[0] + "-" + dayOfBirth;
        LocalDate date = LocalDate.parse(dateOfBirthday);

        User user = new User(
                firstName
                , lastName
                , login
                , password
                , email
                , sex
                , date
        );
        Dao userDao = new UserDAOImpl();
        userDao.save(user);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("registrform.jsp").forward(request, response);
    }
}


