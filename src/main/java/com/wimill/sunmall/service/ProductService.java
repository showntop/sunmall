package com.wimill.sunmall.service;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wimill.sunmall.mapper.ProductMapper;
import com.wimill.sunmall.model.Product;

import java.util.List;

/**
 *  * @author showntop
 *   * @since 2017-03-31 11:09
 *    */
@Service
public class ProductService {

	@Autowired
    private ProductMapper productMapper;

    public List<Product> getAll(Product product) {
    	if (product.getPage() != null && product.getRows() != null) {
            PageHelper.startPage(product.getPage(), product.getRows());
	    }
    	return productMapper.selectAll();
    }

    public Product getById(Integer id) {
    	return productMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
	    productMapper.deleteByPrimaryKey(id);
	}

    public void save(Product product) {
	    if (product.getId() != null) {
	    	productMapper.updateByPrimaryKey(product);
	    } else {
	        productMapper.insert(product);
	    }
    }
}
