package com.wimill.sunmall.service;

import java.io.Serializable;

public interface BaseService<T> {

	T findAll();
    T findOne(Integer id);

}