package com.wimill.sunmall.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by showntop on 2017/3/19.
 */
public class DruidDataSourceConfig implements EnvironmentAware {

    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
      this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource.");
    }

    @Bean
    public DataSource  dataSource(){
        System.out.println("insert into druid!");
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(propertyResolver.getProperty("url"));
        datasource.setDriverClassName(propertyResolver.getProperty("driver-class-name"));
        datasource.setUsername(propertyResolver.getProperty("username"));
        datasource.setPassword(propertyResolver.getProperty("password"));
        datasource.setInitialSize(Integer.valueOf(propertyResolver.getProperty("initial-size")));
        datasource.setMinIdle(Integer.valueOf(propertyResolver.getProperty("min-idle")));
        datasource.setMaxWait(Long.valueOf(propertyResolver.getProperty("max-wait")));
        datasource.setMaxActive(Integer.valueOf(propertyResolver.getProperty("max-active")));
        datasource.setMinEvictableIdleTimeMillis(Long.valueOf(propertyResolver.getProperty("min-evictable-idle-time-millis")));

        try {
            datasource.setFilters("stat,wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datasource;
    }
}
