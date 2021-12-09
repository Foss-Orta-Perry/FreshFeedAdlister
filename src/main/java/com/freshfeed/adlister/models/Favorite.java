package com.freshfeed.adlister.models;

public class Favorite {
    private long cust_id;
    private long ad_id;

    public Favorite(){}

    public Favorite(long cust_id, long ad_id) {
        this.cust_id = cust_id;
        this.ad_id = ad_id;
    }

    public long getCust_id() {
        return cust_id;
    }

    public void setCust_id(long cust_id) {
        this.cust_id = cust_id;
    }

    public long getAd_id() {
        return ad_id;
    }

    public void setAd_id(long ad_id) {
        this.ad_id = ad_id;
    }
}
