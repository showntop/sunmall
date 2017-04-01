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
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
/**
 * Created by showntop on 2017/3/19.
 */
@Controller
@RequestMapping("/admin/products")
public class ProductController {

	@Autowired
	private ProductService productService;

    @RequestMapping
    public ModelAndView getAll(Product product) {
        ModelAndView result = new ModelAndView("products/index");
        List<Product> productList = productService.getAll(product);
        result.addObject("pageInfo", new PageInfo<Product>(productList));
        result.addObject("queryParam", product);
        result.addObject("page", product.getPage());
        result.addObject("rows", product.getRows());
        return result;
    }
}
