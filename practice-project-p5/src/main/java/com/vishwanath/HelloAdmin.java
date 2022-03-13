package com.vishwanath;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class HelloAdmin {
	
	@GetMapping
	public String getName() {
		
		return "Hey, I'm Vish!!";
	}

}
