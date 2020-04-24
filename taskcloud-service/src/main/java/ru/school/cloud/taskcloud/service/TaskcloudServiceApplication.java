package ru.school.cloud.taskcloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TaskcloudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskcloudServiceApplication.class, args);
	}

}
