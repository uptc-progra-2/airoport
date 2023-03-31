package co.uptc.edu.airplan.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.uptc.edu.airplan.model.*;

@RestController
public class AndresMController {

    @GetMapping("/AndresMaldonado")
    public User AndresMaldonado() {
        return new User("Andres", "Maldonado", "Buen día :)", 10);
    }
}
