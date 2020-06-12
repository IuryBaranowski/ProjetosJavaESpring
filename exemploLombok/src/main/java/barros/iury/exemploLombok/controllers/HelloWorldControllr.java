package barros.iury.exemploLombok.controllers;

import barros.iury.exemploLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllr {

    @GetMapping("/")
    public String index() {
        return "Exemplo Lombok";
    }

    @GetMapping("/product")
    public String getProduct() {
        return "Objeto produto";
    }
}
