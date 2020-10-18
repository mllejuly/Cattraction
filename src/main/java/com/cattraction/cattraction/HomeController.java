package com.cattraction.cattraction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@GetMapping("/cattraction/home")
	public String welcome() {
		return "Welcome to Cattraction!";
	}
	
}
