package com.freshfeed.adlister.dao;


import com.freshfeed.adlister.models.Ad;
import java.util.List;
import java.sql.SQLException;

public interface Ads {
    List<Ad> all() throws SQLException;
    Long insert(Ad ad ) throws SQLException;
}
