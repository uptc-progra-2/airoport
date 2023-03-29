package co.uptc.edu.airplan.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.uptc.edu.airplan.model.User;

@RestController
public class newControlller {

    @GetMapping("/Yeison Piracon")
    public User descriptionUser(){
        return new User("yeison","piracon","hello",2808);
    }
}
