package com.ait;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.ait"})
@Configuration
public class SpringConfiguration 
{

	/*
	 * @Bean public Student student() { return new Student(); }
	 * 
	 * @Bean public Trainer trainer() { return new Trainer(); }
	 * 
	 * @Bean public Course course() { return new Course(); }
	 */
}
