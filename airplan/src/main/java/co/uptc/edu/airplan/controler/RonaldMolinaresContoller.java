package co.uptc.edu.airplan.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.uptc.edu.airplan.model.*;

@RestController
public class RonaldMolinaresContoller {
	@GetMapping("Samir")
	public User RonaldSamirMolinares() {
		return new User ("Ronald Samir", "Molinares Sanabria", "(∂ + m) ψ = 0", 17);
	}
}
