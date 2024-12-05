package com.iptech.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigServerApplication {

	public static void main(String[] args) {
		
		System.out.println("this is config server");
		SpringApplication.run(ConfigServerApplication.class, args);
		
	}

}
