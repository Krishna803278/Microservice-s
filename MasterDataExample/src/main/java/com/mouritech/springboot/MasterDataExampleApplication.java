package com.mouritech.springboot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaAuditing
//@EnableSwagger2
@EntityScan("com.mouritech.springboot.*")
@EnableJpaRepositories("com.mouritech.springboot.*")
@ComponentScan({"com.mouritech.springboot.*"})
public class MasterDataExampleApplication {
	@Bean
	public ModelMapper modelMapper() {
	return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(MasterDataExampleApplication.class, args);
	}
	
	

}
