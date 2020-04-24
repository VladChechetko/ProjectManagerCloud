package ru.school.cloud.taskcloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TaskcloudDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskcloudDiscoveryApplication.class, args);
	}

}
