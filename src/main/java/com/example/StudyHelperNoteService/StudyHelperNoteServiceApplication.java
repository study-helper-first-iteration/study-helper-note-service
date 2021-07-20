package com.example.StudyHelperNoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import service.DataLoader;

@ComponentScan({"controller","service"})
@SpringBootApplication
@EntityScan("entity")
@EnableEurekaClient
@EnableJpaRepositories(basePackages ="dao")
public class StudyHelperNoteServiceApplication {
	
	//@Autowired
	//DataLoader data;

	public static void main(String[] args) {
		SpringApplication.run(StudyHelperNoteServiceApplication.class, args);
	}

}
