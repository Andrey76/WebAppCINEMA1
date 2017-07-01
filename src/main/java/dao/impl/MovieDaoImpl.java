package dao.impl;

import dao.api.MovieDAO;
import datasource.DataSource;
import model.Movie;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static dao.impl.SQLs.INSERT_MOVIE;
import static dao.impl.SQLs.UPDATE_MOVIE;

/**
 * Created by andr_ on 18.05.2017.
 */
public final class MovieDaoImpl extends CrudDAO<Movie> implements MovieDAO {
    private static MovieDaoImpl crudDAO;

    public MovieDaoImpl(Class type) {
        super(type);
    }


    public static synchronized MovieDaoImpl getInstance() {
        if (crudDAO == null) {
            crudDAO = new MovieDaoImpl(Movie.class);
        }
        return crudDAO;
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Movie entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_MOVIE);
        preparedStatement.setString(1, entity.getTitle());
        preparedStatement.setString(2, entity.getDescription());
        preparedStatement.setLong(3, entity.getDuration());
        preparedStatement.setInt(4, entity.getRent_start());
        preparedStatement.setInt(5, entity.getRent_end());
        preparedStatement.setString(6, entity.getGenre());
        preparedStatement.setString(7, entity.getRating());
        return preparedStatement;
    }

    @Override
    public PreparedStatement createInsertStatement(Connection connection, Movie entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MOVIE, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, entity.getTitle());
        preparedStatement.setString(2, entity.getDescription());
        preparedStatement.setLong(3, entity.getDuration());
        preparedStatement.setInt(4, entity.getRent_start());
        preparedStatement.setInt(5, entity.getRent_end());
        preparedStatement.setString(6, entity.getGenre());
        preparedStatement.setString(7, entity.getRating());
        return preparedStatement;
    }

    @Override
    public List<Movie> readAll(ResultSet resultSet) throws SQLException {
        List<Movie> result = new LinkedList<>();
        Movie movie = null;
        while (resultSet.next()) {
            movie = new Movie();
            movie.setId(resultSet.getInt("id"));
            movie.setTitle(resultSet.getString("title"));
            movie.setDescription(resultSet.getString("description"));
            movie.setDuration(resultSet.getLong("duration"));
            movie.setRent_start(resultSet.getInt("rent_start"));
            movie.setRent_end(resultSet.getInt("rent_end"));
            movie.setGenre(resultSet.getString("genre"));
            movie.setRating(resultSet.getString("rating"));
            result.add(movie);
        }
        return result;
    }

    @Override
    public Movie getLastAddedMovie() {
        DataSource dataSource = DataSource.getInstance();
        Connection connection = dataSource.getConnection();
        Movie movie = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLs.SELECT_LAST_ADDED_MOVIE);
            movie = new Movie();
            while (resultSet.next()) {
                movie.setId(resultSet.getInt("id"));
                movie.setTitle(resultSet.getString("title"));
                movie.setRent_start(resultSet.getInt("rent_start"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movie;
    }
}
