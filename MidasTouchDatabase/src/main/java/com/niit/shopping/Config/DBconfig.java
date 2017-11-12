package com.niit.shopping.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.shopping.Model.Category;
import com.niit.shopping.Model.Product;
import com.niit.shopping.Model.Supplier;
import com.niit.shopping.Model.User;


@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit.shopping")

public class DBconfig {
	
@Bean
public DataSource getH2DataSource()
{
	DriverManagerDataSource drivermrgDatasrc=new  DriverManagerDataSource();
	drivermrgDatasrc.setDriverClassName("org.h2.Driver");
	drivermrgDatasrc.setUrl(" jdbc:h2:tcp://localhost/~/midas");
	drivermrgDatasrc.setUsername("midas");
	drivermrgDatasrc.setPassword("midas");
	return drivermrgDatasrc;
}
@Bean(name="SessionFactory")
public SessionFactory getSessionFactory()
{
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.put("hibernate.show_sql", "true");
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        
        LocalSessionFactoryBuilder locsessionbuilder = new LocalSessionFactoryBuilder(getH2DataSource());
        locsessionbuilder.addProperties(hibernateProperties);
        locsessionbuilder.addAnnotatedClass(Category.class);
        locsessionbuilder.addAnnotatedClass(Product.class);
        locsessionbuilder.addAnnotatedClass(User.class);
        locsessionbuilder.addAnnotatedClass(Supplier.class);
        SessionFactory sessionFactory = locsessionbuilder.buildSessionFactory();
        System.out.println("Session Factory Object created");
        return sessionFactory;
        
}
@Bean
public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
{
    HibernateTransactionManager hibernatetransmanager = new HibernateTransactionManager(sessionFactory);
    return hibernatetransmanager;
    
}
}
