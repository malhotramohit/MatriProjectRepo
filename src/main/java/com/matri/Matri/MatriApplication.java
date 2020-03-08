package com.matri.Matri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

import com.matri.Matri.image.configuration.ImageUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({ ImageUploadProperties.class })
public class MatriApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatriApplication.class, args);
	}

	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}

}
