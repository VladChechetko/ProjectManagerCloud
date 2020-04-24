package ru.school.cloud.taskcloud.feing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class FeignInfoController {
	
	@Autowired
	private FeignInfoClient feignInfoClient;
	
	@GetMapping
	public String get() {
		return feignInfoClient.info();
	}
	
}
