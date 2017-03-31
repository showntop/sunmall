package com.wimill.sunmall.controller;

import com.wimill.sunmall.model.Product;
import com.wimill.sunmall.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by showntop on 2017/3/19.
 */
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@ResponseBody
	@RequestMapping("/admin/products")
	public Object get(HttpServletRequest request , @Valid String q, Model model){
	    return productService.findOne(id);
	}
}
