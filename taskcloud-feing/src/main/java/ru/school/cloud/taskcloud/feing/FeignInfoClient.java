package ru.school.cloud.taskcloud.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="taskcloud-service")
public interface FeignInfoClient {

	@RequestMapping(value="/info", method=RequestMethod.GET)
	public String info();
	
}
