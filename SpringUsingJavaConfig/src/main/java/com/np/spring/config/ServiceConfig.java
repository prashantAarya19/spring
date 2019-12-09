package com.np.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.np.spring.service.Service;

@Configuration
@Import(DaoConfig.class)
public class ServiceConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Service service() {
		return new Service();
	}
}
