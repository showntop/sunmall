package com.wimill.sunmall.mapper;

import tk.mybatis.mapper.common.Mapper;
// import tk.mybatis.mapper.common.PostgresqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @author showntop
 * @since 2017-03-31 21:53
 */
public interface MyMapper<T> extends Mapper<T>{
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}