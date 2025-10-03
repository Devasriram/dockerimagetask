package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping(value="/getAll")
	public String get() {
		
		return "Hi Deva";
	}
}
