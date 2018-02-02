package dao.api;

import model.Movie;

import java.util.List;

/**
 * Created by andr_ on 15.06.2017.
 */
public interface MovieDAO {

    Movie getLastAddedMovie();
    Movie getMovieById(Integer id);
    void deleteMovieById(Integer id);

    List<Movie> getAllMoviesExceptLast();
}
