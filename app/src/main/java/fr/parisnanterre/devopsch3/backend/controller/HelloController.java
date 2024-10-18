package fr.parisnanterre.devopsch3.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //sera pris en compte comme controleur par SpringBoot
public class HelloController {

    @GetMapping("/hello") //si on voulait faire un post, ce serait PostMapping
    public String getHello(){
        return "Hello from API";
    }
}
