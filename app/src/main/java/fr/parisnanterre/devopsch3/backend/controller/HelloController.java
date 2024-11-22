package fr.parisnanterre.devopsch3.backend.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController //sera pris en compte comme controleur par SpringBoot
@Tag(name = "Hello Controller") //met une description à la route 
public class HelloController {

    @GetMapping("/hello") //si on voulait faire un post, ce serait PostMapping
    
    @Operation(
            summary = "Returns a welcome message",
            description = "This endpoint returns a simple message saying 'Hello from API'"
    )
    public String getHello(){
        return "Hello from API";
    }
}
