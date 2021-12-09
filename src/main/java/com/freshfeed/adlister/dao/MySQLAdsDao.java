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
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt = null;
        String sql = "SELECT * FROM ads";

        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        return createAdsFromResults(rs);


    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);

        statement.setLong(1, ad.getUserId());
        statement.setString(2, ad.getTitle());
        statement.setString(3, ad.getDescription());

        statement.executeUpdate();
        ResultSet generatedResultSet = statement.getGeneratedKeys();

        ResultSet rs = statement.getGeneratedKeys();
        rs.next();
        return rs.getLong(1);
    }

    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads (user_id, title, description) VALUES (?, ?, ?)";


    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }
}
