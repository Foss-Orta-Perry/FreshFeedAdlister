package com.freshfeed.adlister.models;

public class Ad {
    private long id;
    private long ven_id;
    private String title;
    private String description;
    private String ad_img_url;
    private long prod_id;
    private long cat_id;

    public Ad(long id, long ven_id, String title, String description, String ad_img_url, long prod_id, long cat_id) {
        this.id = id;
        this.ven_id = ven_id;
        this.title = title;
        this.description = description;
        this.ad_img_url = ad_img_url;
        this.prod_id = prod_id;
        this.cat_id = cat_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVen_id() {
        return ven_id;
    }

    public void setVen_id(long ven_id) {
        this.ven_id = ven_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAd_img_url() {
        return ad_img_url;
    }

    public void setAd_img_url(String ad_img_url) {
        this.ad_img_url = ad_img_url;
    }

    public long getProd_id() {
        return prod_id;
    }

    public void setProd_id(long prod_id) {
        this.prod_id = prod_id;
    }

    public long getCat_id() {
        return cat_id;
    }

    public void setCat_id(long cat_id) {
        this.cat_id = cat_id;
    }
}

