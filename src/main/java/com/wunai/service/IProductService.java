package com.wunai.service;

import com.wunai.bo.Product;

import java.util.List;

public interface IProductService {
    List<Product> query(Product product);

    Product find(String id);

    void insert(Product product);

    void update(Product product);

    void delete(Product product);
}
