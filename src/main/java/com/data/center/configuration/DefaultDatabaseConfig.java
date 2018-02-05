package com.data.center.configuration;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultDatabaseConfig
{
	@Autowired
	ApplicationContext applicationContext;
 
	@Bean(name = "PostgreSQL_DataSource")
	public DataSource getDataSource() throws IOException
	{
		return new org.apache.tomcat.jdbc.pool.DataSource();
	}
 
	@Bean(name = "PostgreSQL_SqlSessionFactory")
	public SqlSessionFactory getSqlSessionFactory() throws Exception
	{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(getDataSource());
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/mapper/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}
 
	@Bean(name = "PostgreSQL_SqlSessionTemplate")
	public SqlSessionTemplate getSqlSessionTemplate() throws Exception
	{
		return new SqlSessionTemplate(getSqlSessionFactory());
	}
}