package com.freshfeed.adlister.dao;

import com.freshfeed.adlister.models.Product;

import java.util.List;

public interface Products {
    List<Product> all();
    Long insert(Product product);
}
