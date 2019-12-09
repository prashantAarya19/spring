package com.np.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.np.spring.dao.Dao;

@Configuration
public class DaoConfig {

	@Bean
	public Dao dao() {
		return new Dao();
	}

}
