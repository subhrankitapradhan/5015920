package com.example.EmployeeManagementSystem.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
@ConfigurationProperties(prefix = "spring.secondary.datasource")

public class SecondaryDataSourceConfig {
	private String url;
    private String username;
    private String password;
    private String driverClassName;

    // getters and setters

    @Bean(name = "secondaryDataSource")
    DataSource secondaryDataSource() {
        return DataSourceBuilder.create()
            .url(url)
            .username(username)
            .password(password)
            .driverClassName(driverClassName)
            .build();
    }

    
}
