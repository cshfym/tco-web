package com.tcoweb.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@EnableRedisHttpSession
@SpringBootApplication
class WebApplication {

	static void main(String[] args) {
		SpringApplication.run WebApplication, args
	}
}
