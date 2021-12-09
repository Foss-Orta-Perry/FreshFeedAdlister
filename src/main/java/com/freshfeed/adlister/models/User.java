package com.freshfeed.adlister.models;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private boolean is_vendor;
    private String profile_img_url;

    public User() {}

    public User(long id, String username, String email, String password, String first_name, String last_name, boolean is_vendor, String profile_img_url) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.is_vendor = is_vendor;
        this.profile_img_url = profile_img_url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public boolean isIs_vendor() {
        return is_vendor;
    }

    public void setIs_vendor(boolean is_vendor) {
        this.is_vendor = is_vendor;
    }

    public String getProfile_img_url() {
        return profile_img_url;
    }

    public void setProfile_img_url(String profile_img_url) {
        this.profile_img_url = profile_img_url;
    }
}
