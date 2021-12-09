package com.freshfeed.adlister.dao;

import com.freshfeed.adlister.models.User;

import java.sql.SQLException;

public interface Users {
    User findByUsername(String username) throws SQLException;
    Long insert(User user);
}
