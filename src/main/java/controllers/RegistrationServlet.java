package controllers;

import dao.api.Dao;
import dao.impl.UserDAOImpl;
import model.User;
import utils.ValidationUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.Map;

@WebServlet(name = "RegistrationServlet", urlPatterns = {"/reg"})
public class RegistrationServlet extends HttpServlet {

    public void init(){
    //    Dao userDao = new UserDAOImpl();
      //  UserListener userServ = new UserListener(userDao);
    }
    private static final String VALIDATION_RESULT = "validation_result";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("registr.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User currentUser = fillUser(request, response);
        Map<String, String> validationResult = ValidationUtil.validateUser(currentUser);
        if (validationResult.isEmpty()) {

            Dao userDao = new UserDAOImpl();
            getServletContext().getInitParameter("userServ");
            userDao.save(currentUser);
            request.getRequestDispatcher("/startp.jsp").forward(request, response);
        } else {
            request.setAttribute(VALIDATION_RESULT, validationResult);
            request.getRequestDispatcher("/registr.jsp").forward(request, response);
        }
    }

    private User fillUser(HttpServletRequest request, HttpServletResponse response){
        String firstName = request.getParameter("user_name");
        String lastName = request.getParameter("user_surname");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String[] birthday = request.getParameterValues("dayOfBirth");
        String email = request.getParameter("user_mail");
        String sex = request.getParameter("gender");
        //  LocalDate date = LocalDate.parse(dateOfBirthday);
        Date birthUser = Date.valueOf(birthday[0]);
        User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setLogin(login);
            user.setPassword(password);
            user.setBirthday(birthUser);
            user.setEmail(email);
            user.setSex(sex);
            user.setRole(1);

        return user;
    }
}


