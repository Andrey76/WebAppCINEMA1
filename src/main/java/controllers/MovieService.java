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
import java.sql.Date;
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
        String pict_url = request.getParameter("pict_url");
        String treiler_url = request.getParameter("treiler_url");
        request.getRequestDispatcher("movieService.jsp").forward(request,response);
        Long dur = Long.parseLong(duration);
        Date rent_st = Date.valueOf(rent_start);
        Date rent_e = Date.valueOf(rent_end);
        Movie movie = new Movie(title, description, dur, rent_st, rent_e, genre, rating, pict_url, treiler_url);
        Dao movieDao = new MovieDaoImpl(Movie.class);
        movieDao.save(movie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("movieService.jsp").forward(request, response);
    }
    private Movie movPos(){

        return null;
    }


}
