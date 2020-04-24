package ru.school.cloud.taskcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TaskcloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskcloudConfigApplication.class, args);
	}

}
