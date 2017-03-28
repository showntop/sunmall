package com.wimill.sunmall.service;

import com.wimill.sunmall.model.Product;
import com.wimill.sunmall.service.BaseService;

public interface ProductService extends BaseService<Product> {
    Product findOneById(Integer Id);
}