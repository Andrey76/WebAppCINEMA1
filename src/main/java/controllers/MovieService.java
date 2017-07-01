package controllers;

import com.mysql.jdbc.Driver;
import dao.api.Dao;
import dao.impl.MovieDaoImpl;
import helper.PropertyHolder;
import model.Movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by andr_ on 12.06.2017.
 */
@WebServlet(name = "MovieService",  urlPatterns = {"/movser"})
public class MovieService extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PropertyHolder prop = PropertyHolder.getInstance();
        String title = request.getParameter("movie_title");
        String description = request.getParameter("description");
        String duration = request.getParameter("duration");
        String rent_start = request.getParameter("rent_start");
        String rent_end = request.getParameter("rent_end");
        String genre = request.getParameter("genre");
        String rating = request.getParameter("rating");
        Long dur = Long.parseLong(duration);
        int rent_st = Integer.parseInt(rent_start);
        int rent_e = Integer.parseInt(rent_end);
        Movie movie = new Movie(title, description, dur, rent_st, rent_e, genre, rating);
        Dao movieDao = new MovieDaoImpl(Movie.class);
        movieDao.save(movie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("movieService.jsp").forward(request, response);
    }
}
