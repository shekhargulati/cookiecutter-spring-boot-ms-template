package com.{{ cookiecutter.service_slug.replace('-','') }};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class {{ cookiecutter.service_name.title().replace(' ','') | trim()}}ApplicationTests {

	@Test
	void contextLoads() {
	}

}
