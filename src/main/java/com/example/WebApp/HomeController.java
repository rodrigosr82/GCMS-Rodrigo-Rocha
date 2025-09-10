package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, Worldd!";
	}

	
	@RequestMapping("/rodrigo")
	public @ResponseBody String greetingRodrigo() {
<<<<<<< HEAD
		return "Olá, Rodrigo!";
=======
		return "Hello, Rodrigod!";
>>>>>>> 15dceeb8d1a8c250e5e55c4da58d0530ba3f137e
	}
}
