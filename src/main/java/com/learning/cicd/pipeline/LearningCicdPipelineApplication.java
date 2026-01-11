package com.learning.cicd.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LearningCicdPipelineApplication extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LearningCicdPipelineApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(LearningCicdPipelineApplication.class, args);
		System.out.println("Hello tomcat server pe project run karke dega jenkins");
	}

}
