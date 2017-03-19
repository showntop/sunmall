package com.wimill.sunmall.mapper;

import com.wimill.sunmall.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by showntop on 2017/3/19.
 */
@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM products WHERE id = #{id}")
    Product find(long id);
}
