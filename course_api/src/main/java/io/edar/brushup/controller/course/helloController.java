package io.edar.brushup.controller.course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}