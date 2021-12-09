package com.freshfeed.adlister.dao;


import com.freshfeed.adlister.Config;
import com.freshfeed.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }


    @Override
    public List<Ad> all() throws SQLException {
        String selectQuery = "Select * from ads";
        Statement statement = null;
        ResultSet resultSet = null;
        List<Ad> adsList = new ArrayList<>();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {

                Ad newAdd = new Ad((int) resultSet.getLong("id"), resultSet.getString("title"), resultSet.getString("description"));
                adsList.add(newAdd);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adsList;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        return null;
    }
}