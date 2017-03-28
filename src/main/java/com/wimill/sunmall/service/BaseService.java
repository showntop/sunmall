package com.wimill.sunmall.service;

import java.io.Serializable;

public interface BaseService<T extends Serializable> {


    T findOne(Integer id);

}