package com.wunai.service.impl;

import com.wunai.bo.Product;
import com.wunai.mybatis.ProductMapper;
import com.wunai.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapperr;

    @Override
    public List<Product> query(Product product) {
        return productMapperr.query(product);
    }

    @Override
    public Product find(String id) {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
}
