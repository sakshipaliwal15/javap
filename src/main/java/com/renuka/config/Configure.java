package com.renuka.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.renuka.model.Doctor_Details;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.renuka.*")
public class Configure 
{
	@Bean
	   public InternalResourceViewResolver getResolver()
	   {
		    InternalResourceViewResolver vr=new InternalResourceViewResolver();
		    vr.setPrefix("/WEB-INF/Views/");
		    vr.setSuffix(".jsp");
			return vr;
	   }
		
	
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/hcms2");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public ModelAndView getMOModelAndView() {
		return new ModelAndView();
	}
	
	public Properties getHibernateProperties() {
		Properties prop=new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		prop.setProperty("hibernate.show_sql", "true");
		prop.setProperty("hibernate.format_sql", "true");
		return prop;
	}
	
	public SessionFactory getSessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(getDataSource());
		localSessionFactoryBean.setHibernateProperties(getHibernateProperties());
		localSessionFactoryBean.setAnnotatedClasses(com.renuka.model.AdminLogin.class, Doctor_Details.class);
		try {
			localSessionFactoryBean.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return localSessionFactoryBean.getObject();
	}
	
	@Bean
	@Scope("singleton")
	public Transaction getTransactionManager() {
		Transaction transaction=getSessionFactory().openSession().beginTransaction();
		return transaction;
	}
	
	@Bean
	@Scope("singleton")
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate(getSessionFactory());
		return hibernateTemplate;
	}

}
