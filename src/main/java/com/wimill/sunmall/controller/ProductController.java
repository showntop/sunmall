package com.wimill.sunmall.controller;

import com.wimill.sunmall.model.Product;
import com.wimill.sunmall.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * Created by showntop on 2017/3/19.
 */
@RestController
@RequestMapping("/admin/products")
public class ProductController {

	@Autowired
	private ProductService productService;

    @RequestMapping
    public PageInfo<Product> getAll(Product product) {
        List<Product> countryList = productService.getAll(product);
        return new PageInfo<Product>(countryList);
    }
}
