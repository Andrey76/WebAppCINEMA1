package dao.impl;

import dao.DAOFactory;
import model.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static dao.impl.SQLs.INSERT_USER;
import static dao.impl.SQLs.UPDATE_USER;


public class UserDAOImpl extends CrudDAO<User>  {
    public UserDAOImpl() {
        super(User.class);
    }

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
        preparedStatement.setString(1, entity.getFirstName());
        preparedStatement.setString(2, entity.getLastName());
        preparedStatement.setString(3, entity.getLogin());
        preparedStatement.setString(4, entity.getPassword());
        preparedStatement.setDate(5,   Date.valueOf(entity.getBirthday()));
        preparedStatement.setString(6, entity.getEmail());
        preparedStatement.setString(7, entity.getSex());

        preparedStatement.setString(8, "Xyi");
    }


    @Override
    protected List<User> readAll(ResultSet resultSet) throws SQLException {
        List<User> result = new LinkedList<>();
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setLogin(resultSet.getString("FirstName"));
            user.setPassword(resultSet.getString("LastName"));
            user.setFirstName(resultSet.getString("Login"));
            user.setLastName(resultSet.getString("Password"));
            user.setEmail(resultSet.getString("Email"));
            user.setSex(resultSet.getString("Sex"));
            user.setBirthday(resultSet.getDate("birthday").toLocalDate());
            user.setRole(DAOFactory.getInstance().getRoleDao().getById(resultSet.getInt("Role")));
            result.add(user);
        }
        return result;
    }
}
