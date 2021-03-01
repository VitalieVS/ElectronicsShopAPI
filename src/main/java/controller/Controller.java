package controller;

import entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/home")
    public String home() {
        return "Welcome to electronics API";
    }

    public List<Product> getProducts() {

    }
}
