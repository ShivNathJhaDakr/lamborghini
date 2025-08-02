package com.lamborghini.demo;

import com.lamborghini.demo.Lamborghini;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LamborghiniController {

    @GetMapping("/lamborghini")
    public Lamborghini getLamborghini() {
        return new Lamborghini("Aventador", 350);
    }
}