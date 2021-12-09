package com.freshfeed.adlister.models;

public class Vendor {
    private long id;
    private long cust_id;
    private String vendor_name;

    public Vendor(){}

    public Vendor(long id, long cust_id, String vendor_name) {
        this.id = id;
        this.cust_id = cust_id;
        this.vendor_name = vendor_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCust_id() {
        return cust_id;
    }

    public void setCust_id(long cust_id) {
        this.cust_id = cust_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }
}
