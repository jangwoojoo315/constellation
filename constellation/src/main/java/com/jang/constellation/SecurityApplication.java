package com.jang.constellation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {SecurityAutoConfiguration.class})
public class SecurityApplication {
	//Security사용시 나오는 기본로그인창 비활성화
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
