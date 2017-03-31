package com.wimill.sunmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wimill.sunmall.mapper.ProductMapper;
import com.wimill.sunmall.model.Product;
import com.wimill.sunmall.service.ProductService;
import com.wimill.sunmall.mapper.MyMapper;
import com.wimill.sunmall.service.BaseServiceImpl;
import com.github.pagehelper.PageHelper;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl extends BaseServiceImpl<Product>
        implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    public Product findOneById(Integer Id) {
        return getMapper().selectByPrimaryKey(Id);
    }

    public List<Product> getAll(Product product) {
        if (product.getPage() != null && product.getRows() != null) {
            PageHelper.startPage(product.getPage(), product.getRows());
        }
        return productMapper.selectAll();
    }


    @Override
    protected MyMapper<Product> getMapper() {
        return productMapper;
    }
}