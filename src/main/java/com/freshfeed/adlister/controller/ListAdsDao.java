package com.freshfeed.adlister.controller;

import com.freshfeed.adlister.dao.Ads;
import com.freshfeed.adlister.models.Ad;

import java.sql.SQLException;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;


    @Override
    public List<Ad> all() throws SQLException {
        return null;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        return null;
    }
}
