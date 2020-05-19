package com.jwt.auth.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Arrays;

/*@Configuration
@EnableMBeanExport(registration=RegistrationPolicy.IGNORE_EXISTING)
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.jwt.auth.dao.mySql",
        entityManagerFactoryRef = "mySqlEntityManagerFactory",
        transactionManagerRef = "mySqlTransactionManager"
)*/
public class mySqlDataSourceConfig extends WebSecurityConfigurerAdapter {
   /* @Autowired
    private Environment env;

    @Bean
    @Primary
    @ConfigurationProperties(prefix="datasource.mysql")
    public DataSourceProperties mySqlDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    public DataSource mySqlDataSource() {
        DataSourceProperties mySqlDataSourceProperties = mySqlDataSourceProperties();

        System.out.println("!!!"+mySqlDataSourceProperties.getDriverClassName());
        System.out.println("!!!"+mySqlDataSourceProperties.getUrl());
        System.out.println("!!!"+mySqlDataSourceProperties.getUsername());
        System.out.println("!!!"+mySqlDataSourceProperties.getPassword());


        return DataSourceBuilder.create()
                .driverClassName(mySqlDataSourceProperties.getDriverClassName())
                .url(mySqlDataSourceProperties.getUrl())
                .username(mySqlDataSourceProperties.getUsername())
                .password(mySqlDataSourceProperties.getPassword())
                .build();
    }

    @Bean
    public PlatformTransactionManager mySqlTransactionManager()
    {

        EntityManagerFactory factory = mySqlEntityManagerFactory().getObject();
        return new JpaTransactionManager(factory);
    }


    @Bean(name = "mySqlEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean mySqlEntityManagerFactory()
    {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(mySqlDataSource());
        factory.setPackagesToScan(new String[]{"com.jwt.auth.model"});
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        return factory;

    }

    @Bean
    public DataSourceInitializer mySqlDataSourceInitializer()
    {
        DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
        dataSourceInitializer.setDataSource(mySqlDataSource());
        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
        // databasePopulator.addScript(new ClassPathResource("orders-data.sql"));
        dataSourceInitializer.setDatabasePopulator(databasePopulator);
        dataSourceInitializer.setEnabled(env.getProperty("datasource.mySql.initialize", Boolean.class, false));
        return dataSourceInitializer;
    }


    @Bean
    public OpenEntityManagerInViewFilter mySqlOpenEntityManagerInViewFilter()
    {
        OpenEntityManagerInViewFilter osivFilter = new OpenEntityManagerInViewFilter();
        osivFilter.setEntityManagerFactoryBeanName("mySqlEntityManagerFactory");
        return osivFilter;
    }

*/
}
