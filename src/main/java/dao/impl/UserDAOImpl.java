package dao.impl;

import dao.api.Dao;
import dao.api.UserDao;
import datasource.DataSource;
import model.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static dao.impl.SQLs.INSERT_USER;
import static dao.impl.SQLs.UPDATE_USER;


public class UserDAOImpl extends CrudDAO<User> implements UserDao {
    public UserDAOImpl() {
        super(User.class);
    }
    private Dao<Integer, User> userDao;
    private DataSource dataSource;
    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, User entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
        setStatement(entity, preparedStatement);
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, User entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
        setStatement(entity, preparedStatement);
        return preparedStatement;
    }

    private void setStatement(User entity, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(3, entity.getLogin());
        preparedStatement.setString(4, entity.getPassword());
        preparedStatement.setString(1, entity.getFirstName());
        preparedStatement.setString(2, entity.getLastName());
        preparedStatement.setDate(5,   Date.valueOf(entity.getBirthday()));
        preparedStatement.setString(6, entity.getEmail());
        preparedStatement.setString(7, entity.getSex());
        preparedStatement.setInt(8, entity.getRole().ordinal());
    }


    @Override
    protected List<User> readAll(ResultSet resultSet) throws SQLException {
        List<User> result = new LinkedList<>();
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("Login"));
            user.setLastName(resultSet.getString("Password"));
            user.setLogin(resultSet.getString("FirstName"));
            user.setPassword(resultSet.getString("LastName"));
            user.setBirthday(resultSet.getDate("Birthday").toLocalDate());
            user.setEmail(resultSet.getString("Email"));
            user.setSex(resultSet.getString("Sex"));
            user.setRole (resultSet.getInt("role_id"));
            result.add(user);
        }
        return result;
    }
//    @Override
//    public User getById(Integer id){
//        User user = userDao.getById(id);
//        return  user;
//    }

    @Override
    public User getByLogin(String login) {
        DataSource dataSource = DataSource.getInstance();
        Connection connection = dataSource.getConnection();
        User user = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLs.SELECT_CURRENT_LOGIN_USER);
            preparedStatement.setString(1, login);
            ResultSet resultSet =  preparedStatement.executeQuery();
            user = new User();
            while (resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setFirstName(resultSet.getString("Login"));
                user.setLastName(resultSet.getString("Password"));
                user.setLogin(resultSet.getString("FirstName"));
                user.setPassword(resultSet.getString("LastName"));
                user.setBirthday(resultSet.getDate("birthday").toLocalDate());
                user.setEmail(resultSet.getString("Email"));
                user.setSex(resultSet.getString("Sex"));
                user.setRole (resultSet.getInt("role_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }


}
