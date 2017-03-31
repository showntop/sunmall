package com.wimill.sunmall.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.wimill.sunmall.mapper.MyMapper;
import com.wimill.sunmall.model.Entity;
import com.wimill.sunmall.service.BaseService;

@Transactional
public abstract class BaseServiceImpl<T>
        implements BaseService<T> {

    protected abstract MyMapper<T> getMapper();

    protected Class<T> entityClazz;


    @SuppressWarnings("unchecked")
    public BaseServiceImpl() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClazz = (Class<T>) params[0];
    }



    @Transactional(readOnly = true)
    public T findAll() {
        return null;
    }


    @Transactional(readOnly = true)
    public T findOne(Integer id) {
        Assert.notNull(id);
        return getMapper().selectByPrimaryKey(id);
    }


}