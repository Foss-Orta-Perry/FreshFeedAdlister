package com.freshfeed.adlister.models;

public class Product {
private long id;
private String title;
private String description;
private long cat_id;
private long ven_id;

public Product(){}

    public Product(long id, String title, String description, long cat_id, long ven_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.cat_id = cat_id;
        this.ven_id = ven_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getCat_id() {
        return cat_id;
    }

    public void setCat_id(long cat_id) {
        this.cat_id = cat_id;
    }

    public long getVen_id() {
        return ven_id;
    }

    public void setVen_id(long ven_id) {
        this.ven_id = ven_id;
    }
}
