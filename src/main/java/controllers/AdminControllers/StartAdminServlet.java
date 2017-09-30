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
import java.util.List;

/**
 * Created by andr_ on 29.09.2017.
 */
@WebServlet(name = "StartAdminServlet", urlPatterns = "/startAdmin")
public class StartAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginButton = request.getParameter("login");
        String registrationButton = request.getParameter("registration");
        String deleteButton = request.getParameter("delete");
        if (loginButton != null) {
            //   request.getRequestDispatcher("/WEB-INF/loginform.jsp").forward(request, response);
            response.sendRedirect("/login");
        } else if (registrationButton != null) {
            response.sendRedirect("/reg");
        }

        MovieDAO movieDAO = new MovieDaoImpl(Movie.class);
        Movie movie = movieDAO.getLastAddedMovie();
        request.setAttribute("film", movie.getTitle());
        request.setAttribute("id", movie.getId());
        request.setAttribute("rent_start", movie.getRent_start());
        request.setAttribute("pict", movie.getPict_url());
        request.setAttribute("rent_start", movie.getRent_start());
        request.setAttribute("rent_start", movie.getDescription());
        List<Movie> movies = movieDAO.getAllMoviesExceptLast();
        request.setAttribute("movies", movies);
        request.setAttribute("film", movie.getTitle());
        request.setAttribute("id", movie.getId());
        request.setAttribute("rent_start", movie.getRent_start());
        request.setAttribute("pict", movie.getPict_url());
        request.setAttribute("rent_start", movie.getRent_start());
        request.setAttribute("rent_start", movie.getDescription());
        if (deleteButton != null) {
            Integer i = Integer.valueOf(request.getParameter("id"));
            movieDAO.deleteMovieById(i);
            response.sendRedirect("adminPages/startAdminp.jsp");
        }
        request.getRequestDispatcher("adminPages/startAdminp.jsp").forward(request, response);

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
