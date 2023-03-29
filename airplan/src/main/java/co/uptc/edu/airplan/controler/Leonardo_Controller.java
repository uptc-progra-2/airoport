package co.uptc.edu.airplan.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.uptc.edu.airplan.model.User;

@RestController
public class Leonardo_Controller {
    
    @GetMapping("/Hello-Leonardo")
    public User leonardo() {
        return new User("Leonardo", "Castellanos", "Bonjour", 27);
    }
}

