package co.uptc.edu.airplan.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.uptc.edu.airplan.model.HelloWorldResponse;

@RestController
public class AirplaneController {
	
	@GetMapping("/hello-world")
	public HelloWorldResponse helloWord() {
		return new HelloWorldResponse("");
	}
}
