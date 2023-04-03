package co.uptc.edu.airplan.controler;

import org.springframework.web.bind.annotation.GetMapping;

import co.uptc.edu.airplan.model.HelloWorldResponse;
import co.uptc.edu.airplan.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.uptc.edu.airplan.model.HelloWorldResponse;

@RestController
public class BrayanController {
	
	
	@GetMapping("/hello-brayan")
	public User helloWord() {
		return new User("brayan","daniel","h",1);
		}
}
