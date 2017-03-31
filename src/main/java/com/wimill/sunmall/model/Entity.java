package com.wimill.sunmall.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Created by showntop on 2017/3/19.
 */
public class Entity implements Serializable {
    private static final long serialVersionUID = -2103051167973747034L;

    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;


    @Autowired
    private long id;

    @Autowired
    private Date createdAt;

    @Autowired
    private Date updatedAt;

    
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}

