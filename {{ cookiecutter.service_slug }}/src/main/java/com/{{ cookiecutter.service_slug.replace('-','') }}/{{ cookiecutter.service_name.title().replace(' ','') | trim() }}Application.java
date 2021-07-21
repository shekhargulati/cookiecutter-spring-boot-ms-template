package com.{{ cookiecutter.service_slug.replace('-','') }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{ cookiecutter.service_name.title().replace(' ','') | trim()}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{ cookiecutter.service_name.title().replace(' ','') | trim() }}Application.class, args);
	}

}
