package com.wimill.sunmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wimill.sunmall.mapper.ProductMapper;
import com.wimill.sunmall.model.Product;
import com.wimill.sunmall.service.ProductService;
import com.wimill.sunmall.mapper.BaseMapper;
import com.wimill.sunmall.service.BaseServiceImpl;

@Service
@Transactional
public class ProductServiceImpl extends BaseServiceImpl<Product>
        implements ProductService {

    @Autowired
    private ProductMapper userDao;


    public Product findOneById(Integer Id) {
        return getDao().selectByPrimaryKey(Id);
    }


    @Override
    protected BaseMapper<Product, Integer> getDao() {
        return userDao;
    }
}