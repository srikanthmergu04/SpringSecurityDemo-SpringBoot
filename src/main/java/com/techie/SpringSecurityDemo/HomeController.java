package com.techie.SpringSecurityDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String welcome() {
		System.out.println("Welcome to Spring Boot Application.");
		return "index.jsp";
	}

}
