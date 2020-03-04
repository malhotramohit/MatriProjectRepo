package com.matri.Matri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.matri.Matri.image.configuration.ImageUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({ ImageUploadProperties.class })
public class MatriApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatriApplication.class, args);
	}

}
