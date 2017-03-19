package com.wimill.sunmall.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by showntop on 2017/3/19.
 */
public class Entity implements Serializable {
    private static final long serialVersionUID = -2103051167973747034L;

    @Autowired
    private long id;

    @Autowired
    private Date createdAt;

    @Autowired
    private Date updatedAt;

}

