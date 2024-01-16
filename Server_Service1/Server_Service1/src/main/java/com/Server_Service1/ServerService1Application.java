package com.Server_Service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerService1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerService1Application.class, args);
	}

}
