package controllers.AdminControllers;

import dao.api.MovieDAO;
import dao.impl.MovieDaoImpl;
import model.Movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andr_ on 30.09.2017.
 */
@WebServlet(name = "DeleteMovie", urlPatterns = "/deleteMovie")
public class DeleteMovie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String deleteButton = request.getParameter("delete");

        Integer i = Integer.valueOf(request.getParameter("id"));
            MovieDAO movieDAO = new MovieDaoImpl(Movie.class);
            movieDAO.deleteMovieById(i);
            response.sendRedirect("/startAdmin");
    }
}
