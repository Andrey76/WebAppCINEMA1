package dao.impl;

import model.AccessRight;
import model.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by andr_ on 18.05.2017.
 */
public class RoleDAOImpl extends CrudDAO<> {
    public RoleDAOImpl() {
        super(AccessRight.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Role entity) throws SQLException {
        return null;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Role entity) throws SQLException {
        return null;
    }

    @Override
    protected List<Role> readAll(ResultSet resultSet) throws SQLException {
        List<Role> result = new LinkedList<>();
        Role role = null;
        while (resultSet.next()) {
            role = new Role();
            role.setId(resultSet.getInt("id"));
           // role.setName(resultSet.getString("name"));
            result.add(role);
        }
        return result;
    }
}
