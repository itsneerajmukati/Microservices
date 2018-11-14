package com.demo.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.demo.usermanagement.*"})
@EnableDiscoveryClient
public class UsermanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermanagementApplication.class, args);
	}
}
