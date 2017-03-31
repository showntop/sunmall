package com.wimill.sunmall.service;

import com.wimill.sunmall.model.Product;
import com.wimill.sunmall.service.BaseService;

import java.util.List;

public interface ProductService extends BaseService<Product> {
    Product findOneById(Integer Id);
    List<Product> getAll(Product product);
}