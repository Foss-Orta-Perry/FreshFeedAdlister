package com.freshfeed.adlister.dao;

import com.freshfeed.adlister.Config;
import com.freshfeed.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection;

    public MySQLUsersDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }

    @Override
    public User findByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username LIKE ? LIMIT 1";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
    }

    @Override
    public Long insert(User user) {


    }

    private User extractUser(ResultSet rs) throws SQLException {
        while (rs.next()) {
            return new User(
                    rs.getLong("id"),
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("password")
            );
        };
    }
}
