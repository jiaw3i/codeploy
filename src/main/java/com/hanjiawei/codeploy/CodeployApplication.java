package com.hanjiawei.codeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class CodeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeployApplication.class, args);
	}

}
