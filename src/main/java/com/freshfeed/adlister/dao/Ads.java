package com.freshfeed.adlister.dao;

import com.sun.tools.javac.util.List;
import com.freshfeed.adlister.models.Ad;

import java.sql.SQLException;

public interface Ads {
    List<Ad> all() throws SQLException;
    Long insert(Ad ad ) throws SQLException;
}
