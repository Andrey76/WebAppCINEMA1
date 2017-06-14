package controllers;

import com.mysql.jdbc.Driver;
import dao.api.Dao;
import dao.impl.UserDAOImpl;
import helper.PropertyHolder;
import model.Role;
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

        String URL = "jdbc:mysql://localhost:3306/cinema?useSSL=false";
        String USER = "root";
        String PASSWORD = "andr1991";
        String SQL_INSERT =
                "INSERT INTO users1(FirstName, LastName, Login, Password, Birthday, Email, Sex, Role) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            DriverManager.registerDriver(new Driver ());
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
        //String role = "user";
        Role role = new Role("are"  );
        String dateOfBirthday = birthYear + "-" + birtMon[0] + "-" + dayOfBirth;
        LocalDate date = LocalDate.parse(dateOfBirthday);


        User user = new User(
                    login
                ,   password
                ,   firstName
                ,   lastName
                ,   email
                ,   sex
                ,   date
                ,   role
        );
        Dao userDao = new UserDAOImpl();
        userDao.save(user);

//        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
//             PreparedStatement statement = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS)){
//
//                    statement.setString(1, firstname);
//                    statement.setString(2, lastname);
//                    statement.setString(3, login);
//                    statement.setString(4, password);
//                    statement.setString(5, birthday);
//                    statement.setString(6, email);
//                    statement.setString(7, sex);
//                    statement.setString(8, "user");
//                    statement.executeUpdate();


//     } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
    }


