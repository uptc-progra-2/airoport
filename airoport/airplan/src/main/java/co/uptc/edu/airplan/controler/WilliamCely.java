package co.uptc.edu.airplan.controler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.uptc.edu.airplan.model.User;

@RestController
public class WilliamCely {

	@GetMapping("/WilliamCely")
	public User williamCely() {
		return new User("William", "Cely", "Bom Dia", 99);

	}
}