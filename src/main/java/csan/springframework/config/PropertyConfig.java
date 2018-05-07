package csan.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import csan.springframework.examplebeans.DataSource;

@Configuration
//@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
	
	@Value("${csan.user}")
	private String username;
	@Value("${csan.password}")
	private String password;
	@Value("${csan.dburl}")
	private String dburl;
	
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDburl(dburl);
		return dataSource;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}

}
