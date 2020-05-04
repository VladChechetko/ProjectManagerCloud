package ru.school.cloud.taskcloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@Lazy
public class InfoController {
	
	@Value("${app.version}")
	private String version;
	
	@Value("${app.email}")
	private String email;

	@GetMapping
	public String get() {
		return "version: " + version + "<br/> email:" + email;
	}
	
}
