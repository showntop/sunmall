package com.wimill.sunmall.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.wimill.sunmall.mapper.BaseMapper;
import com.wimill.sunmall.model.Entity;
import com.wimill.sunmall.service.BaseService;

@Transactional
public abstract class BaseServiceImpl<T extends Entity>
        implements BaseService<T> {

    protected abstract BaseMapper<T,  Integer> getDao();

    protected Class<T> entityClazz;


    @SuppressWarnings("unchecked")
    public BaseServiceImpl() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClazz = (Class<T>) params[0];
    }



    @Transactional(readOnly = true)
    public T findAll() {
        return getDao().selectByPrimaryKey(id);
    }


    @Transactional(readOnly = true)
    public T findOne(Integer id) {
        Assert.notNull(id);
        return getDao().selectByPrimaryKey(id);
    }


}