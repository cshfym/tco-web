package com.tco.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@SpringBootApplication
@EnableRedisHttpSession
class Application {

	static void main(String[] args) {
		SpringApplication.run Application, args
	}
}
