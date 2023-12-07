package com.tobeto.springProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation atandığı argümana özellikler kazandırır.
@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		//springi devreye alır
		SpringApplication.run(SpringProjectApplication.class, args);
	}

}
