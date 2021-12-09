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
        return null;
    }

    @Override
    public Long insert(User user) {
        return null;
    }
}
